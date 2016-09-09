package PantallaFull;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class OyenteTeclado implements KeyListener {

	JuegoJFrame juego;
	
	/*Basicamente si la tecla inversa sigue apretada entonces llamamos al mover de esa tecla
	 * Sino que no se mueva mas en ese eje
	INFO:
	LestaApretada -> Left Key
	RestaApretada -> Right Key
	TestaApretada -> Top Key
	DestaApretad -> Down Key
	*/
	
	//variables aux
	boolean LestaApretada=false, RestaApretada=false,UestaApretada=false, DestaApretada=false;
	
	
	OyenteTeclado(JuegoJFrame passjuego){
		juego=passjuego;
	}
	
	
	
	public void keyPressed(KeyEvent evento) {
		
		if(evento.getKeyCode()==KeyEvent.VK_LEFT){
			LestaApretada=true;
			juego.getRect().moverIzquierda();

		}
		if(evento.getKeyCode()==KeyEvent.VK_RIGHT){
			RestaApretada=true;
			juego.getRect().moverDerecha();
		}
		if(evento.getKeyCode()==KeyEvent.VK_UP){
			UestaApretada=true;
			juego.getRect().moverArriba();
		}
		if(evento.getKeyCode()==KeyEvent.VK_DOWN){
			DestaApretada=true;
			juego.getRect().moverAbajo();
		}
		
		
	}

	
	public void keyReleased(KeyEvent evento) {
		
		if(evento.getKeyCode()==KeyEvent.VK_LEFT){
			LestaApretada=false;
			
			if (RestaApretada) juego.getRect().moverDerecha();
			else juego.getRect().nomoverX();

		}
		
		if(evento.getKeyCode()==KeyEvent.VK_RIGHT){
			RestaApretada=false;
			
			if (LestaApretada) juego.getRect().moverIzquierda();
			else juego.getRect().nomoverX();
			
		}
		
		if(evento.getKeyCode()==KeyEvent.VK_UP){
			UestaApretada=false;
			
			if (DestaApretada) juego.getRect().moverAbajo();
			else juego.getRect().nomoverY();
			
		}
		
		if(evento.getKeyCode()==KeyEvent.VK_DOWN){
			DestaApretada=false;
			
			if (UestaApretada) juego.getRect().moverArriba();
			else juego.getRect().nomoverY();
		}
		

	}

	@Override
	public void keyTyped(KeyEvent evento) {

	}

}
