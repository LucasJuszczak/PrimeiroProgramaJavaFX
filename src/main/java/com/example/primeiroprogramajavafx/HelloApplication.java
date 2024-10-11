package com.example.primeiroprogramajavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label lblNome = new Label("Informe seu nome");

        TextField textNome = new TextField();
        textNome.setPrefSize(100, 50);

        Button btnOK = new Button();
        btnOK.setText("OK");

        Label lblMensagem = new Label();

        VBox layout = new VBox();
        layout.getChildren().addAll(lblNome, textNome, btnOK, lblMensagem);

        Scene scene = new Scene(layout, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}