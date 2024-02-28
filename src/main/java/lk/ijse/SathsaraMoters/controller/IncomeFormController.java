package lk.ijse.SathsaraMoters.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class IncomeFormController implements Initializable {
    @FXML
    private AnchorPane incomePane;

    @FXML
    private AnchorPane allofOtherIncomePane;

    @FXML
    void btnAllIncomeOnAction(ActionEvent event) {
        try {
            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/allIncome_form.fxml"));
            this.allofOtherIncomePane.getChildren().clear();
            this.allofOtherIncomePane.getChildren().add(rootNode);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    @FXML
    void btnOtherIncomeOnAction(ActionEvent event) {
        try {
            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/OtherIncome_form.fxml"));
            this.allofOtherIncomePane.getChildren().clear();
            this.allofOtherIncomePane.getChildren().add(rootNode);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    @FXML
    void btnRapierIncomeOnAction(ActionEvent event) {
        try {
            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/incomeRepair_form.fxml"));
            this.allofOtherIncomePane.getChildren().clear();
            this.allofOtherIncomePane.getChildren().add(rootNode);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    @FXML
    void btnSpairPartIncomeOnAction(ActionEvent event) {
        try {
            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/spairPartsIncome_form.fxml"));
            this.allofOtherIncomePane.getChildren().clear();
            this.allofOtherIncomePane.getChildren().add(rootNode);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/incomeRepair_form.fxml"));
            this.allofOtherIncomePane.getChildren().clear();
            this.allofOtherIncomePane.getChildren().add(rootNode);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }
}
