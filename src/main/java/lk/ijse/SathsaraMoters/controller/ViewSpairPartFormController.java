package lk.ijse.SathsaraMoters.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
public class ViewSpairPartFormController {
    @FXML
    private AnchorPane AddingSpairPartPane;

    @FXML
    private TextField txtVehicleNumber;

    @FXML
    private TextField txtSpairPartId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtQty;

    @FXML
    private TextField txtTotalAmount;

    @FXML
    private TableView<?> tableAdingSpairPart;

    @FXML
    private TableColumn<?, ?> columnSpairPartId;

    @FXML
    private TableColumn<?, ?> columnSpairPartName;

    @FXML
    private TableColumn<?, ?> columnAmount;

    @FXML
    private TableColumn<?, ?> columnqty;

    @FXML
    private TableColumn<?, ?> columnDeleteButtons;

    @FXML
    private TextField txtAmount;

    @FXML
    private TextField txtCountOfItems;

    @FXML
    private TextField txtBillNumber;

    @FXML
    void btnAddOnAction(ActionEvent event) {

    }

    @FXML
    void btnCanselOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void txtSearchSpairPartsOnAction(ActionEvent event) {

    }
}
