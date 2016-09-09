package PantallaFull;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangulo {
	
	
	public static final int VELOCIDAD=7;
	public static final int ANCHO=10, LARGO=10;
	
	private int vx,vy; //velocidad
	private int x,y; //posicion
	
	
	public Rectangulo(){
		vx=0;
		vy=0;
		x=200;
		y=200;
		
	}
	/*Pinta el ractangulo en la pantalla*/
	public void render(Graphics g){
		g.setColor(Color.red);
		g.fillRect(x, y, ANCHO, LARGO);
	}
	
	/*Actualiza la posicion del Rectangulo*/
	public void update(){
		int viejax=x;
		int viejay=y;
		
		x+=vx;
		y+=vy;
		
		//si esta fuera del mapa volver a las anteriores
		if(estaFueraMapa()){
			x=viejax;
			y=viejay;
		}
		
	}
	/*Valida si esta fuera del mapa*/
	private boolean estaFueraMapa() {
		int espacioBordeArriba=20; //Solo para que quede bien dentro
		int espacioBordeDerecha=1; //En Modo Ventana tenemos los bordes de la JFrame
		//No tendremos este incoveniente en FULLSCREEN
		
		if (x>JuegoJFrame.ANCHO-ANCHO-espacioBordeDerecha)return true;
		if (x<0)return true;
		if (y>JuegoJFrame.LARGO-LARGO )return true;
		if (y<espacioBordeArriba)return true;
		
		return false;
	}

	public void moverIzquierda() {
		vx=-VELOCIDAD;
	}
	public void moverDerecha() {
		vx=VELOCIDAD;
		
	}

	public void moverAbajo() {
		vy=VELOCIDAD;
	}

	public void moverArriba() {
		vy=-VELOCIDAD;
	}
	
	public void nomoverX() {
		vx=0;
		
	}

	public void nomoverY() {
		vy=0;		
	}


	
	
	
	

}
