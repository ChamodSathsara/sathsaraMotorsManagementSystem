package lk.ijse.SathsaraMoters.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MonthlyRevenueFormController {
    @FXML
    private AnchorPane monthlyIncomePane;

    @FXML
    private TableView<?> tableMonthlyIncome;

    @FXML
    private TableColumn<?, ?> columnDate;

    @FXML
    private TableColumn<?, ?> columnRepair;

    @FXML
    private TableColumn<?, ?> ColumnSpairPart;

    @FXML
    private TableColumn<?, ?> ColumnOther;

    @FXML
    private DatePicker txtStartDate;

    @FXML
    private DatePicker txtEndDate;

    @FXML
    private TextField txtAllTotalIncome;

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }
}
