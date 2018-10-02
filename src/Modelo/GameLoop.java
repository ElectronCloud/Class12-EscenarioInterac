/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Estudiante
 */
public class GameLoop extends AnimationTimer {

    private GraphicsContext gc; //Vista
    private Carro carro; //Modelo
    private Llanta[] llantas;
    private Chasis chasis;

    public GameLoop(GraphicsContext gc) {
        this.gc = gc;
        this.carro = new Carro (0,200);
        
        
    }
    
    
    
    @Override
    public void handle(long l) {
        gc.clearRect(0, 0, 300, 300); //borrando el tablero
        gc.fillRect(this.carro.getX(), this.carro.getY(), 60, 20); // Dibujando el escenario
        gc.fillOval(this.carro.getX()+5, this.carro.getY()+19, 15, 15);
        gc.fillOval(this.carro.getX()+35, this.carro.getY()+19, 15, 15);
        double xpoints[] = {this.carro.getX()+7, this.carro.getX()+14,this.carro.getX()+43,this.carro.getX()+50, this.carro.getX()+7}; // La ultima coordenada es la misma que la primera, para que cierre el triangulo
        double ypoints[] = {this.carro.getY(), this.carro.getY()-15,this.carro.getY()-15,this.carro.getY() , this.carro.getY()};
       
        gc.fillPolygon(xpoints, ypoints, xpoints.length); //El ultimo es cuantos puntos se van a dibujar
       
        this.carro.mover();
               
    }
    
    
}
