package com.se.max.seha8;

import javafx.scene.control.Button;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PingPlugin implements PluginInterface{
    private InputProviderInterface app;

    @Override
    public ArrayList<Button> getButtonArray() {
        return null;
    }

    private void runSystemCommand(String command) {
        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String s = "";
            // reading output stream of the command
            while ((s = inputStream.readLine()) != null) {
                PluginHandler.inputField.setText(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setButtonAction(Button button) {
        button.setOnAction(actionEvent -> {
            String cmd = "ping ";
            cmd += PluginHandler.inputField.getText();
            runSystemCommand(cmd);
        });
    }

    @Override
    public void setButtonText(Button button) {
        button.setText("Ping");
    }

    @Override
    public String getApplicationTitle() {
        return "Ping! Pong!";
    }

    @Override
    public String getInititalText() {
        return "google.de";
    }

    @Override
    public void setApplication(InputProviderInterface app) {
        this.app = app;
    }
}
