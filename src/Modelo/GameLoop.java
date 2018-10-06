/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Estudiante
 */
public class GameLoop extends AnimationTimer {

    private GraphicsContext gc; //Vista
    private Carro carro; //Modelo
    private Llanta[] llantas;
    private Chasis chasis;
    private Image fondo;
    private Image gato;
    private Image person;
    private int cont=0;
    private int camb=1;
    private int bajar=1;

    public GameLoop(GraphicsContext gc) {
        this.gc = gc;
        this.carro = new Carro (0,200);
        this.fondo=new Image("Images/fondo.png");
        this.gato= new Image ("Images/cats.gif");
        this.person =  new Image ("Images/down0.png");
    }
    
    
    
    @Override
    public void handle(long l) {
        gc.clearRect(0, 0, 1024, 512); //borrando el tablero
        /*gc.fillRect(this.carro.getX(), this.carro.getY(), 60, 20); // Dibujando el escenario
        gc.fillOval(this.carro.getX()+5, this.carro.getY()+19, 15, 15);
        gc.fillOval(this.carro.getX()+35, this.carro.getY()+19, 15, 15);
        double xpoints[] = {this.carro.getX()+7, this.carro.getX()+14,this.carro.getX()+43,this.carro.getX()+50, this.carro.getX()+7}; // La ultima coordenada es la misma que la primera, para que cierre el triangulo
        double ypoints[] = {this.carro.getY(), this.carro.getY()-15,this.carro.getY()-15,this.carro.getY() , this.carro.getY()};
       
        gc.fillPolygon(xpoints, ypoints, xpoints.length); //El ultimo es cuantos puntos se van a dibujar
       
        this.carro.mover();*/
        gc.drawImage(fondo,0,0);
        gc.drawImage(gato, 132*cont, 0, 132, 80, 20+camb, 350, 132, 80);
        gc.drawImage(person, 600, 380);
        gc.strokeRect(20+camb, 350, 132, 80);
        gc.strokeRect(600,380, 30, 39);
        
        gc.fillOval(0, 0+(bajar*4), 15, 15);
        gc.fillOval(190, 0+(bajar*4), 15, 15);
        gc.fillOval(380, 0+(bajar*4), 15, 15);
        gc.fillOval(570, 0+(bajar*4), 15, 15);
        gc.fillOval(760, 0+(bajar*4), 15, 15);
        gc.fillOval(900, 0+(bajar*4), 15, 15);
        gc.fillOval(1005, 0+(bajar*4), 15, 15);
        
        gc.strokeRect(0, 0+(bajar*4), 15, 15);
        gc.strokeRect(190, 0+(bajar*4), 15, 15);
        gc.strokeRect(380, 0+(bajar*4), 15, 15);
        gc.strokeRect(570, 0+(bajar*4), 15, 15);
        gc.strokeRect(760, 0+(bajar*4), 15, 15);
        gc.strokeRect(900, 0+(bajar*4), 15, 15);
        gc.strokeRect(1005, 0+(bajar*4), 15, 15);
        
        
        Shape alienRectangulo=new Rectangle(20+camb, 350, 132, 80);
        Shape naveRectangulo=new Rectangle(600,380,30,39);
        Shape interseccion=SVGPath.intersect(alienRectangulo, naveRectangulo);
        
        if(interseccion.getBoundsInLocal().getWidth()!=-1){
          stop();
        }
        
        camb++;
        bajar++;
        
        if(bajar==128){
            bajar=0;
        }
        
        if(camb%10==0){
            cont++;
        }
        if(cont==6){
            cont=0;
        }
        
    }
    
    
}
