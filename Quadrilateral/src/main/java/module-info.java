module com.example.quadrilateral {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.quadrilateral to javafx.fxml;
    exports com.example.quadrilateral;
}