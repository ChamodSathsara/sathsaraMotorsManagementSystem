package lk.ijse.SathsaraMoters.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
public class CustomerFormController {
    @FXML
    private AnchorPane customerPane;

    @FXML
    private TableView<?> tableCustomers;

    @FXML
    private TableColumn<?, ?> columnBillNumber;

    @FXML
    private TableColumn<?, ?> columnCustomerName;

    @FXML
    private TableColumn<?, ?> columnVehicleNumber;

    @FXML
    private TableColumn<?, ?> columnRepairCost;

    @FXML
    private TableColumn<?, ?> columnSpairPartsCost;

    @FXML
    private TableColumn<?, ?> ColumnDate;

    @FXML
    private TableColumn<?, ?> columnDeleteButtons;

    @FXML
    private TextField txtSearchBar;

    @FXML
    private DatePicker txtDate;

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }

    @FXML
    void txtSearchVehiNoBillNoCustomerNameOnAction(ActionEvent event) {

    }
}
