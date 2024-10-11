module com.example.primeiroprogramajavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primeiroprogramajavafx to javafx.fxml;
    exports com.example.primeiroprogramajavafx;
}