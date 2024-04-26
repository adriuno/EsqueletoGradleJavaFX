package org.iesalandalus.programacion.javafx.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HolaMundo {

    @FXML
    private Label lbSaludo;

    @FXML
    void saludar() throws IOException {
        HBox raiz = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vistas/Saludo.fxml")));
        Scene escena = new Scene(raiz);
        escena.getStylesheets().add(getClass().getResource("/estilos/aplicacion.css").toExternalForm());
        Stage escenarioSaludo = new Stage();
        escenarioSaludo.setTitle("Saludo");
        escenarioSaludo.setScene(escena);
        escenarioSaludo.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/imagenes/iconoSaludar.png"))));
        escenarioSaludo.show();
    }

}