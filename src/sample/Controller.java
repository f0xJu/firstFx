package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private Label helloLabel;

    @FXML
    private TextField userTextField;

    public void changeText(ActionEvent event){
        helloLabel.setText("Im saying Hi");
    }

    public void changeUserName(ActionEvent event){
        String name = userTextField.getText();
        userTextField.setText("");
        helloLabel.setText(name);
    }


    }

