/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Tablero extends Application {
    
    @Override 
    public void start (Stage stage) throws Exception {
        
           
        Pane panel = new Pane(); // Layout 
        Canvas canvas = new Canvas (300, 300); // Dimension del canvas
        panel.getChildren().add(canvas);
        Scene scene = new Scene (panel, 300, 300, Color.WHITESMOKE);
        
        GraphicsContext gc = canvas.getGraphicsContext2D(); // Referencia del lapiz para dibujar sobre el canvas
        
        
        GameLoop loop = new GameLoop (gc);
        loop.start();
        
        stage.setTitle("Ejemplo Canvas");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
