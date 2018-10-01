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

    public GameLoop(GraphicsContext gc) {
        this.gc = gc;
        this.carro = new Carro (0,200);
        
        
    }
    
    
    
    @Override
    public void handle(long l) {
        gc.clearRect(0, 0, 300, 300); //orrando el tablero
        gc.fillRect(this.carro.getX(), this.carro.getY(), 20, 20); // Dibujando el escenario
        
        //this.carro.mover();
               
    }
    
    
}
