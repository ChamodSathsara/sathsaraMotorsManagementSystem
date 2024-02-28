package lk.ijse.SathsaraMoters.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.SathsaraMoters.config.SessionFactoryConfig;
import lk.ijse.SathsaraMoters.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.query.NativeQuery;

//import javax.persistence.Query;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TableRawFormController {

    @FXML
    private AnchorPane rowPane;

    @FXML
    private Label lableUserName;

    @FXML
    private Label lablePassword;

    @FXML
    private Label lableDelete;

    public void getData(List<User> userlist){
        showPage();
        for (int i = 0 ; i < userlist.size() ; i++){
            User user = userlist.get(i);
            lableUserName.setText(user.getUserName());
            lablePassword.setText(user.getPassword());


        }
    }

    private void showPage()  {
        Parent rootNode = null;
        try {
            rootNode = FXMLLoader.load(this.getClass().getResource("/view/tableRaw_form.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.rowPane.getChildren().clear();
        this.rowPane.getChildren().add(rootNode);
    }
}
