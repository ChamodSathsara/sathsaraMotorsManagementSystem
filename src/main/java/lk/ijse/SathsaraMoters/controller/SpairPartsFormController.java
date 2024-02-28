package lk.ijse.SathsaraMoters.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SpairPartsFormController {
    @FXML
    private AnchorPane spairPartsPane;

    @FXML
    private TextField txtSpairPartsId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtQuantity;

    @FXML
    private TextField btnDate;

    @FXML
    private TextField txtPurchasePrice;

    @FXML
    private TextField txtSellingPrice;

    @FXML
    private TextField txtSuppliersName;

    @FXML
    private TableView<?> tableSpairParts;

    @FXML
    private TableColumn<?, ?> columnSpairPartsId;

    @FXML
    private TableColumn<?, ?> columnSpairPartsName;

    @FXML
    private TableColumn<?, ?> columnqty;

    @FXML
    private TableColumn<?, ?> columnPurchasePrice;

    @FXML
    private TableColumn<?, ?> columnSellPrice;

    @FXML
    private TableColumn<?, ?> columnLastUpdatedDate;

    @FXML
    private TextField txtInvoiceNo;

    @FXML
    void btnDaytoDayListOnAction(ActionEvent event) {
        try {
            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/dayToDaySpairParts_form.fxml"));
            Scene scene = new Scene(rootNode);
            Stage stage = new Stage();

            stage.centerOnScreen();
            stage.setScene(scene);
            stage.setTitle("Day_to_Day_List");

            stage.show();
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }

    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void radioBtnCashOnAction(ActionEvent event) {

    }

    @FXML
    void radioCreditOnAction(ActionEvent event) {

    }

    @FXML
    void txtNameSearchOnAction(ActionEvent event) {

    }

    @FXML
    void txtSearchSpairPartsIdOnAction(ActionEvent event) {

    }
}
