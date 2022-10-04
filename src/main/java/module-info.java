module com.example.changelisteners {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.changelisteners to javafx.fxml;
    exports com.example.changelisteners;
}