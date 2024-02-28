package lk.ijse.SathsaraMoters.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DayToDaySpairPartsFormController {

    @FXML
    private AnchorPane dayToDayListPane;

    @FXML
    private TextField txtSearchbar;

    @FXML
    private DatePicker txtDate;

    @FXML
    private TableView<?> TableDaytoDayList;

    @FXML
    private TableColumn<?, ?> ColumnSpairPartId;

    @FXML
    private TableColumn<?, ?> columnSpairPartName;

    @FXML
    private TableColumn<?, ?> ColumnInvoiceNumber;

    @FXML
    private TableColumn<?, ?> columnDate;

    @FXML
    private TableColumn<?, ?> ColumnQty;

    @FXML
    private TableColumn<?, ?> ColumnBuyingPrice;

    @FXML
    private TableColumn<?, ?> columnSellingPrice;

    @FXML
    private TableColumn<?, ?> ColumnSupplierNamed;

    @FXML
    private TableColumn<?, ?> columnPaymentMethod;

    @FXML
    private TableColumn<?, ?> columnDeleteButtons;


    @FXML
    void btnBackOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }

    @FXML
    void txtSearchbarOnAction(ActionEvent event) {

    }

}
