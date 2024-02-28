package lk.ijse.SathsaraMoters.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class IncomeRepairFormController {

    @FXML
    private AnchorPane repairIncomePane;

    @FXML
    private TableView<?> tableRepierIncome;

    @FXML
    private TableColumn<?, ?> columnCustomerBillNumber;

    @FXML
    private TableColumn<?, ?> columnVehicleNumber;

    @FXML
    private TableColumn<?, ?> columnCustomerName;

    @FXML
    private TableColumn<?, ?> columnDate;

    @FXML
    private TableColumn<?, ?> columnAmount;

    @FXML
    private TableColumn<?, ?> columnMethod;

    @FXML
    private DatePicker txtDate;

    @FXML
    private TextField txttotalRepierIncome;

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void txtOtherIncomeIdSearchOnAction(ActionEvent event) {

    }

}
