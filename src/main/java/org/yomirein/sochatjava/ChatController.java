package org.yomirein.sochatjava;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;


public class ChatController {


    @FXML
    private Label textLabel;

    @FXML
    private TextField textField;

    public void handleSubmitButtonAction(ActionEvent actionEvent) {
        if (textField.getText().equals("")) {return;}
        textLabel.setText(textLabel.getText() + "\n" + textField.getText());
        textField.setText("");
    }
    public void touch(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        button.setDisable(true);
    }

    public void connectServer(ActionEvent actionEvent) {
        textLabel.setText(textLabel.getText() + "\n" + "Connecting to server");
    }

    public void disconnectServer(ActionEvent actionEvent) {
        textLabel.setText(textLabel.getText() + "\n" + "Disconnecting from server");
    }
}