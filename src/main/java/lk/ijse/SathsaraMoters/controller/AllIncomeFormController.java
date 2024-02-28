package lk.ijse.SathsaraMoters.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
public class AllIncomeFormController {
    @FXML
    private AnchorPane allIncomePane;

    @FXML
    private TableView<?> tableAllIncome;

    @FXML
    private TableColumn<?, ?> columnDate;

    @FXML
    private TableColumn<?, ?> columnRepair;

    @FXML
    private TableColumn<?, ?> columnSpairPart;

    @FXML
    private TableColumn<?, ?> columnOther;

    @FXML
    private DatePicker txtSearchDate;

    @FXML
    private TextField txtAllTotalIncome;

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }

}
