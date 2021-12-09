package com.se.max.seha8;

import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class FileUploadPlugin implements PluginInterface {
    private InputProviderInterface application;

    Button browse = new Button();
    Button upload = new Button();
    private ArrayList<Button> buttons = new ArrayList<>(Arrays.asList(browse,upload));

    @Override
    public ArrayList<Button> getButtonArray() {
        return buttons;
    }

    @Override
    public void setButtonAction(Button button) {
        File selectedFile = null;
        getButtonArray().get(0).setOnAction(actionEvent -> {
            FileChooser fileChooser = new FileChooser();
            Stage s = new Stage();

            File selectedFile1 = fileChooser.showOpenDialog(s);
            PluginHandler.inputField.setText(selectedFile1.getName());
        });
        getButtonArray().get(1).setOnAction(actionEvent -> {
            if(PluginHandler.inputField.getText().length() > 0) {
                PluginHandler.inputField.setText("Uploading..");
            }
        });
    }

    @Override
    public void setButtonText(Button button) {
        getButtonArray().get(0).setText("browse");
        getButtonArray().get(1).setText("upload");
    }

    @Override
    public String getApplicationTitle() {
        return "File Browser";
    }

    @Override
    public String getInititalText() {
        return "Browse a file first..";
    }

    @Override
    public void setApplication(InputProviderInterface app) {
        this.application = app;
    }
}
