module com.example.javafx_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_app to javafx.fxml;
    exports com.example.javafx_app;
}