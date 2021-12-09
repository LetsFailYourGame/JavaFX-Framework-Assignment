package com.se.max.seha8;

import javafx.scene.control.Button;

import java.util.ArrayList;

public interface PluginInterface
{

    /**
    An array containing buttons, which leads to the options to add infinite amount of buttons to the scene.
    @return The function just returns the array containing all the buttons.
    */
    ArrayList<Button> getButtonArray();

    /**
     * The functions map a given function to the button when clicked.
     * @param button if a only a single button shall be use, the button parameter can be used. If multiple buttons
     * need to be used, you can use the getButtonArray and assign each button a function that way with for example:
     * getButtonArray().get(X).setOnAction(..)
     */
    void setButtonAction(Button button);

    /**
     * This functions sets the text of a button.
     * @param button You can use the button.setText() function if you use a single button.
     * otherwise when multiple buttons are used, you can use the getButtonArray function again with:
     * getButtonArray().get(X).setText("")
     */
    void setButtonText(Button button);

    /**
     * This function sets the Application title.
     * @return Returns the application title.
     */
    String getApplicationTitle();

    /**
     * This function sets the initial placerholder text of the TextField.
     * @return Returns the placeholder strings
     */
    String getInititalText();

    
    void setApplication(InputProviderInterface app);
}
