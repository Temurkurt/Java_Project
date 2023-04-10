module com.example.inheritance {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.inheritance to javafx.fxml;
    exports com.example.inheritance;
}