package com.se.max.seha8;
import javafx.scene.control.Button;
import java.util.ArrayList;

public class CalcPlugin implements PluginInterface {
    private InputProviderInterface application;

    @Override
    public void setButtonText(Button button) {
        button.setText("Calculate");
    }

    @Override
    public String getApplicationTitle() {
        return "my great calculator!";
    }

    @Override
    public String getInititalText() {
        return "10 / 6 + 3";
    }

    @Override
    public void setApplication(InputProviderInterface app) {
        this.application = app;
    }

    @Override
    public void setButtonAction(Button button) {
        button.setOnAction(actionEvent -> {
            String input = PluginHandler.inputField.getText().strip().replaceAll("\\s","");
            if(input.length() >= 3) { // valid expression like 3*3, 5/2..
                PluginHandler.inputField.setText(String.valueOf(EvaluateString.evaluate(input)));
            }
        });
    }

    @Override
    public ArrayList<Button> getButtonArray() {
        return null;
    }
}
