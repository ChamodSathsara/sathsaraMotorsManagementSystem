package lk.ijse.SathsaraMoters.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
public class ViewBillNoSoairPartsFormController {
    @FXML
    private AnchorPane viewBillNoSpairPartsPane;

    @FXML
    private TextField txtVehicleNumber;

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
    private TextField txtBillNumber;
}
