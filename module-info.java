module com.example.springboot {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.springboot to javafx.fxml;
    exports com.example.springboot;
}