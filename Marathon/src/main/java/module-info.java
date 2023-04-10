module com.example.marathon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.marathon to javafx.fxml;
    exports com.example.marathon;
}