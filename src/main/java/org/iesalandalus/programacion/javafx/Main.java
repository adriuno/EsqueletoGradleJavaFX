package org.iesalandalus.programacion.javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import org.iesalandalus.programacion.javafx.controladores.Controlador;
import org.iesalandalus.programacion.javafx.controladores.Controladores;

public class Main extends Application {

	@Override
	public void start(Stage escenarioPrincipal) {
		try {
			Controlador ventanaPrincipal = Controladores.get("/vistas/HolaMundo.fxml", "Hola mundo desde JavaFX", null);
			ventanaPrincipal.addHojaEstilos("/estilos/aplicacion.css");
			ventanaPrincipal.addIcono("/imagenes/iconoSaludar.png");
			ventanaPrincipal.getEscenario().show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		launch(args);
	}
}
