module com.example.counter {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.counter to javafx.fxml;
    exports com.example.counter;
}