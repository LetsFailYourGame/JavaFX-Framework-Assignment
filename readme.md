## Create a new Plugin

#### Overview

| MainClass                                                      | PluginManger         | PluginInterface        |
| -------------------------------------------------------------- | -------------------- | ---------------------- |
| Create a new Plugin here: new PluginHandler(new PluginName()); | Framwork for Plugins | Interface for a Plugin |

* To create a new Plugin the #PluginInterface  interface has to be implemented in your Plugin Class
* The Framework will then grab all information needed from the methods provieded by the Plugin Class you create

```java 
/* PluginInterface */

public interface PluginInterface 
{   
   ArrayList<Button> getButtonArray();  
   String getApplicationTitle();  
   String getInititalText(); 
   void setButtonAction(Button button);  
   void setButtonText(Button button);  
   void setApplication(InputProviderInterface app);  
}
```

```java
/* Sample Plugin Class */

public class Sample implements PluginInterface {  

 @Override
 /* used if you want to use multiple buttons on your scene */
 /* Sample use for multiple buttons: 
    Button button1 = new Button();
    Button button2 = new Button();
    private ArrayList<Button> buttons = new ArrayList<>(Arrays.asList(button1, button2));
 */
 public ArrayList<Button> getButtonArray() { return null; }  
 
 @Override  
 /* used to give one or more buttons a action when clicked */
 /* Sample use for multiple buttons:       
    getButtonArray().get(0).setOnAction(actionEvent -> { System.out.println("I'm button 1"); });
    getButtonArray().get(1).setOnAction(actionEvent -> { System.out.println("I'm button 2"); });
 */
 public void setButtonAction(Button button) { }  
 
 @Override  
 /* used to asign each button an individual text */
 /* Sample use for multiple buttons:
    getButtonArray().get(0).setText("button1");
    getButtonArray().get(1).setText("button2");
 */
 public void setButtonText(Button button) { }  
 
 @Override  
 /* used to set the application title */
 public String getApplicationTitle() { return null; }  
 
 @Override  
 /* used to set the placeholder text of the default textField */
 public String getInititalText() { return null; }  
 
 @Override  
 /* used to set the application */
 public void setApplication(InputProviderInterface app) { }
 
 }
 ```
#### Build
* Just open the SEHA8 as a project folder in IntelliJ and run /SEHA8/src/main/java/com.se.max.seha8/mainApp
* Every plugin provided is fully functional
