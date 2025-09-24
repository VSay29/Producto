module com.example.producto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.producto to javafx.fxml;
    exports com.example.producto;
}