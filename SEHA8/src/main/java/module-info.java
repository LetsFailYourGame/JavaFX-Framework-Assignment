module com.se.max.seha8 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.scripting;


    opens com.se.max.seha8 to javafx.fxml;
    exports com.se.max.seha8;
}