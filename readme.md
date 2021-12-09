## Create a new PluginInterface

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
 public ArrayList<Button> getButtonArray() { return null; }  
 
 @Override  
 /* used to give one or more buttons a action when clicked */
 public void setButtonAction(Button button) { }  
 
 @Override  
 /* used to asign each button an individual text */
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
