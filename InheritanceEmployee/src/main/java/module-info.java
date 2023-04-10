module com.example.inheritanceemployee {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.inheritanceemployee to javafx.fxml;
    exports com.example.inheritanceemployee;
}