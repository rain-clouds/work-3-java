module com.example.pa6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pa6 to javafx.fxml;
    exports com.example.pa6;
}