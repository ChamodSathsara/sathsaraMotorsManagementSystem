package lk.ijse.SathsaraMoters.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import lk.ijse.SathsaraMoters.config.SessionFactoryConfig;
import lk.ijse.SathsaraMoters.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TableTestFormController implements Initializable {

    @FXML
    private AnchorPane tablePane;

    @FXML
    private Label hbox;

    @FXML
    private VBox vbox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        getUser();
    }
    public void getUser(){
        List<User> userList = new ArrayList<>();
        userList = getUsers();

        TableRawFormController con = new TableRawFormController();
        con.getData(userList);
    }

    private List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        Session session = SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        String sql = "SELECT c FROM User AS c";
        Query query = session.createQuery(sql);
        List<User> list = query.list();

        return list;
    }
}
