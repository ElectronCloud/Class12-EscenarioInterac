package Class11;

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
        
        /*gc.setFill(Color.BLUE);
        gc.fillRect(10, 10, 20, 20); // Posicon x, posicion y, ancho, alto, dibuja un rectangulo
        
        Color color = new Color (0.2,0.2,0.5,0); // Color en rgb
        
        gc.setFill(Color.RED);
        gc.fillOval(30, 30, 50, 50); // """"", """", radio en x, radio en y
        
        gc.strokeLine(15, 15, 40, 40); // x inicial, y inicial, x final, y final
        
       double xpoints[] = {10,30,20,10}; // La ultima coordenada es la misma que la primera, para que cierre el triangulo
       double ypoints[] = {30,30,15,30};
       
       gc.strokePolygon(ypoints, ypoints, xpoints.length); //El ultimo es cuantos puntos se van a dibujar
       
       //stroke queda sin relleno
       // fill tiene relleno*/
        
        LoopJuego loop = new LoopJuego (gc);
        loop.start();
        
        stage.setTitle("Ejemplo Canvas");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
