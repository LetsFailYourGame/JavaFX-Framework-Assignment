/**
 * @author Max Randhahn | 108 019 211 207
 * @author Marvin Roj   | 108 018 213 300
 * @author Lena Hortz   | 108 019 211 133
 * */

package com.se.max.seha8;

import javafx.application.Application;
import javafx.stage.Stage;

public class mainApp extends Application{
    static Stage stage;

    @Override
    public void start(Stage stage) {
        new PluginHandler(new CalcPlugin());
        //new PluginHandler(new PingPlugin());
        //new PluginHandler(new FileUploadPlugin());
    }

    public static void main(String[] args) {
        launch(args);
    }
}