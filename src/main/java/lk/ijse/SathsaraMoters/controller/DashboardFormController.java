package lk.ijse.SathsaraMoters.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {
    @FXML
    private AnchorPane DashboardPane;

    @FXML
    private BarChart<?, ?> barchartRevenue;

    @FXML
    private CategoryAxis axisDays;

    @FXML
    private NumberAxis axisIncome;

    @FXML
    private TableView<?> tableTopCustomer;

    @FXML
    private TableColumn<?, ?> columnCustomerName;

    @FXML
    private TableColumn<?, ?> columnCustomerAmount;

    @FXML
    private TableColumn<?, ?> columnCustomerDate;

    @FXML
    private TableView<?> tableRemainningSpairParts;

    @FXML
    private TableColumn<?, ?> columnSpairPartName;

    @FXML
    private TableColumn<?, ?> columnSpairPartQty;

    @FXML
    private AnchorPane allPane;

    @FXML
    void btnAddBillOnAction(ActionEvent event) {
        try {
            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/addBill_form.fxml"));
            this.allPane.getChildren().clear();
            this.allPane.getChildren().add(rootNode);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    @FXML
    void btnCustomersOnAction(ActionEvent event) {
        try {
            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));
            this.allPane.getChildren().clear();
            this.allPane.getChildren().add(rootNode);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    @FXML
    void btnHomeOnAction(ActionEvent event) {
        try {
            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));
            this.DashboardPane.getChildren().clear();
            this.DashboardPane.getChildren().add(rootNode);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    @FXML
    void btnInComeOnAction(ActionEvent event) {
        try {
            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/income_form.fxml"));
            this.allPane.getChildren().clear();
            this.allPane.getChildren().add(rootNode);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) {
        Parent rootNode = null;
        try {
            rootNode = FXMLLoader.load(this.getClass().getResource("/view/Login1_form.fxml"));
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.DashboardPane.getScene().getWindow();

        stage.setTitle("Login_page");
        stage.centerOnScreen();
        stage.setScene(scene);

        stage.show();
    }

    @FXML
    void btnMonthlyRevOnAction(ActionEvent event) {
        try {
            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/monthlyRevenue_form.fxml"));
            this.allPane.getChildren().clear();
            this.allPane.getChildren().add(rootNode);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    @FXML
    void btnPaymentOnAction(ActionEvent event) {
        try {
            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/payment_form.fxml"));
            this.allPane.getChildren().clear();
            this.allPane.getChildren().add(rootNode);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    @FXML
    void btnSpairPartsOnAction(ActionEvent event) {
        try {
            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/spairParts_form.fxml"));
            this.allPane.getChildren().clear();
            this.allPane.getChildren().add(rootNode);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    @FXML
    void searchOnAction(ActionEvent event) {

    }
    @FXML
    void cancalOnAction(MouseEvent event) {

    }

    @FXML
    void minimizeOnAction(MouseEvent event) {

    }
}
