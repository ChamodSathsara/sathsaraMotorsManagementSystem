package lk.ijse.SathsaraMoters.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
public class SpairPartsIncomeFormController {
    @FXML
    private AnchorPane spairPartsIncomePane;

    @FXML
    private TableView<?> tableSpairPartsIncome;

    @FXML
    private TableColumn<?, ?> columnBillNumber;

    @FXML
    private TableColumn<?, ?> columnCustomerName;

    @FXML
    private TableColumn<?, ?> columnVehicleNumber;

    @FXML
    private TableColumn<?, ?> columnDate;

    @FXML
    private TableColumn<?, ?> columnAmount;

    @FXML
    private TableColumn<?, ?> columnMethod;

    @FXML
    private TableColumn<?, ?> columnViewButtons;

    @FXML
    private DatePicker txtDate;

    @FXML
    private Label txtTotalSpairPartsIncome;

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }


}
