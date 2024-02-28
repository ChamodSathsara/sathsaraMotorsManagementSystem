package lk.ijse.SathsaraMoters.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Parent;
import javafx.stage.Stage;
import lk.ijse.SathsaraMoters.entity.User;
import lk.ijse.SathsaraMoters.repository.UserRepository;

import java.io.IOException;

public class Login1FormController {
    @FXML
    private AnchorPane loginPane;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtPassword;

    @FXML
    void btnLogin(ActionEvent event) {

        String userName = txtUserName.getText();
        String password = txtPassword.getText();

        User user = new User(userName,password);
        UserRepository repository = new UserRepository();
        
        boolean isLogin = repository.isCheck(user);

        if (isLogin) {
            try {
                Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));
                Scene scene = new Scene(rootNode);
                Stage stage = (Stage) this.loginPane.getScene().getWindow();

                stage.setTitle("Dashboard_page");
                stage.centerOnScreen();
                stage.setScene(scene);

                stage.show();

            } catch (IOException e) {
                new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
            }
        }
        else
            new Alert(Alert.AlertType.ERROR,"Password Or User Name inCorrect").show();
    }

    @FXML
    void btnSignup(ActionEvent event) {
        try {
            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/signup_form.fxml"));
            Scene scene = new Scene(rootNode);
            Stage stage = (Stage) this.loginPane.getScene().getWindow();

            stage.setTitle("Signup_page");
            stage.centerOnScreen();
            stage.setScene(scene);

            stage.show();
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }
}
