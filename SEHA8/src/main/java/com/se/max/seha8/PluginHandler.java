package com.se.max.seha8;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class PluginHandler implements InputProviderInterface {
    private PluginInterface plugin;
    static TextField inputField;

    @Override
    public String getInput() {
        return "MyCalcApp";
    }

    public PluginHandler(PluginInterface plugin) {
        this.plugin = plugin;
        plugin.setApplication(this);
        configStage();
    }

    public void configStage() {
        Stage stage = new Stage();
        HBox hbox = new HBox();
        Scene scene = new Scene(hbox, 425, 100);

        inputField = new TextField();
        inputField.setPromptText(plugin.getInititalText());
        inputField.setFocusTraversable(false);
        hbox.getChildren().add(inputField);

        if(plugin.getButtonArray() != null) // if were using multiple buttons
        {
            for(Button button : plugin.getButtonArray()) {
                HBox.setMargin(button, new Insets(0, 5, 0, 10));
                HBox.setMargin(inputField, new Insets(0, 0, 0, 20));
                HBox.setHgrow(inputField, Priority.ALWAYS);
                plugin.setButtonText(button);
                hbox.setAlignment(Pos.CENTER);
                hbox.getChildren().add(button);
            }
            plugin.setButtonAction(new Button());

        } else { // handling only single buttons
            Button button = new Button();

            HBox.setMargin(button, new Insets(0, 5, 0, 10));
            HBox.setHgrow(inputField, Priority.ALWAYS);
            HBox.setMargin(inputField, new Insets(0, 0, 0, 20));
            hbox.setAlignment(Pos.CENTER);
            hbox.getChildren().add(button);

            plugin.setButtonText(button);
            plugin.setButtonAction(button);
        }


        stage.setTitle(plugin.getApplicationTitle());
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

}
