package lk.ijse.SathsaraMoters.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.SathsaraMoters.entity.User;
import lk.ijse.SathsaraMoters.repository.UserRepository;

import java.io.IOException;

public class SignupFormController {

    @FXML
    private AnchorPane signupPane;

    @FXML
    private TextField txtAdminName;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtPassword1;

    @FXML
    void btnSignUp(ActionEvent event) {
        String confirmPassword = txtPassword1.getText();
        String userName = txtUserName.getText();
        String password = txtPassword.getText();

        if(confirmPassword.equals(password)) {
            User user = new User(userName, password);
            UserRepository repository = new UserRepository();

            boolean isSaved = repository.isSaved(user);

            if (isSaved) {
                try {
                    Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/Login1_form.fxml"));
                    Scene scene = new Scene(rootNode);
                    Stage stage = (Stage) this.signupPane.getScene().getWindow();

                    stage.setTitle("Login_page");
                    stage.centerOnScreen();
                    stage.setScene(scene);

                    stage.show();
                } catch (IOException e) {
                    new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
                }
            } else {
                new Alert(Alert.AlertType.ERROR, "something wrong please try again another user name or password").show();
            }
        }
        else
            new Alert(Alert.AlertType.ERROR,"password Confirmation Failed , please try again ").show();
    }
}
