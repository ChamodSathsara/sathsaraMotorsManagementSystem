package lk.ijse.SathsaraMoters.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
public class OtherIncomeFormController {
    @FXML
    private AnchorPane otherIncomePane;

    @FXML
    private TableView<?> tableOtherIncome;

    @FXML
    private TableColumn<?, ?> columnOtherIncomeId;

    @FXML
    private TableColumn<?, ?> columnDescription;

    @FXML
    private TableColumn<?, ?> columnDatee;

    @FXML
    private TableColumn<?, ?> ColumnAmount;

    @FXML
    private TableColumn<?, ?> columnDeleteButtons;

    @FXML
    private TextField txtOtherIncomeId;

    @FXML
    private DatePicker txtDate;

    @FXML
    private TextField txtTotalOtherIncome;

    @FXML
    private TextField txtOtherIncomeDescription;

    @FXML
    private TextField txtOtherIncomeDate;

    @FXML
    private TextField txtOtherIncomeAmount;



}
