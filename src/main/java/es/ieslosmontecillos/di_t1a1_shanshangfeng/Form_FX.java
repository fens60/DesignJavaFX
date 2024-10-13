package es.ieslosmontecillos.di_t1a1_shanshangfeng;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Form_FX extends Application {
    /*
     * @author: Shangfeng Shan
     * @date:  ${date}
     * */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Formularios");

        // Crear el GridPane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.BASELINE_CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 700, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Texto de bienvenida
        Text texto = new Text("Bienvenido");
        texto.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(texto, 0, 0, 2, 1);

        // Etiqueta de nombre de usuario
        Label nombre_usuario = new Label("Nombre de usuario:");
        grid.add(nombre_usuario, 0, 1);

        TextField texto_usuario = new TextField();
        grid.add(texto_usuario, 1, 1);

        Label contrasena = new Label("Password:");
        grid.add(contrasena, 0, 2);

        PasswordField texto_contrasena = new PasswordField();
        grid.add(texto_contrasena, 1, 2);

        // Botón de Sign In
        Button btn = new Button("Sign in");
        HBox caja_brt = new HBox(10);
        caja_brt.setAlignment(Pos.BOTTOM_RIGHT);
        caja_brt.getChildren().add(btn);
        grid.add(caja_brt, 1, 4);

        // Texto que se mostrará al hacer clic en el botón
        final Text bien_venido = new Text();
        grid.add(bien_venido, 1, 6);

        // Evento del botón
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                bien_venido.setFill(Color.FIREBRICK);
                bien_venido.setText("Sign in button pressed");
            }
        });
    }
}