package lk.ijse.SathsaraMoters.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
public class PaymentFormController {
    @FXML
    private AnchorPane paymentPane;

    @FXML
    private TextField txtPaymentId;

    @FXML
    private TextField txtDescription;

    @FXML
    private DatePicker txtDate;

    @FXML
    private TextField txtAmount;

    @FXML
    private TableView<?> tablePayment;

    @FXML
    private TableColumn<?, ?> columnPaymentId;

    @FXML
    private TableColumn<?, ?> columnDescription;

    @FXML
    private TableColumn<?, ?> colunDate;

    @FXML
    private TableColumn<?, ?> columnAmount;

    @FXML
    private TableColumn<?, ?> columnDelete;

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void txtPaymentIdSearchOnAction(ActionEvent event) {

    }
}
