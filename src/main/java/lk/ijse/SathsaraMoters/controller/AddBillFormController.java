package lk.ijse.SathsaraMoters.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AddBillFormController {

        @FXML
        private AnchorPane addBillPane;

        @FXML
        private TextField txtCustomerName;

        @FXML
        private TextField txtVehicleNo;

        @FXML
        private TextField txtRapairCost;

        @FXML
        private TextField txtBillNo;

        @FXML
        private TextField txtSpairPartCost;

        @FXML
        private TableView<?> TableBills;

        @FXML
        private TableColumn<?, ?> columnBillNomber;

        @FXML
        private TableColumn<?, ?> ColumnCustomerName;

        @FXML
        private TableColumn<?, ?> columnVehicleNumber;

        @FXML
        private TableColumn<?, ?> columnRaapairCost;

        @FXML
        private TableColumn<?, ?> columnSpairPartCost;

        @FXML
        private TableColumn<?, ?> ColumnDate;

        @FXML
        private TableColumn<?, ?> columnAddBillButtons;

        @FXML
        private TextField txtDate;

        @FXML
        void SearchBillNo(ActionEvent event) {

        }

        @FXML
        void btnAddOnAction(ActionEvent event) {

        }

        @FXML
        void btnDelete(ActionEvent event) {

        }

        @FXML
        void btnSave(ActionEvent event) {

        }

        @FXML
        void btnViewSpairParts(ActionEvent event) {
                try {
                        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/viewSpairPart_form.fxml"));
                        Scene scene = new Scene(rootNode);
                        Stage stage = new Stage();

                        stage.centerOnScreen();
                        stage.setScene(scene);
                        stage.setTitle("Veiw_customer/"+"s Added_Spair_Parts_form");

                        stage.show();
                } catch (IOException e) {
                        new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
                }
        }

        @FXML
        void radioCashOnAction(ActionEvent event) {

        }

        @FXML
        void radioCreditOnAction(ActionEvent event) {

        }
}
