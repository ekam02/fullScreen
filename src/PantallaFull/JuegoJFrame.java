package PantallaFull;
/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Ejemplo Completo - Mover Rectangulo
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;


@SuppressWarnings("serial")
/*Ventana del Juego*/
public class JuegoJFrame extends JFrame implements Runnable {
	
	
	static final int ANCHO=400,LARGO=400; //ancho y largo de la ventana
	
	Rectangulo rect; //nuestro rectangulo
	
	boolean condicion;
	Thread threadprincipal;
	
	public JuegoJFrame(){
		this.setTitle("Chelin's Rect 1.0 ");
		this.setBounds(100, 100, ANCHO, LARGO);
		this.setVisible(true);
		this.setResizable(false);
		this.setIgnoreRepaint(true);//
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//Agregamos los Oyentes
		this.addWindowListener(new OyenteVentana(this));
		this.addKeyListener(new OyenteTeclado(this));
		this.addMouseMotionListener(new OyenteMouseMovimiento(this));
		this.addMouseListener(new OyenteMouse(this));
		
		
		rect = new Rectangulo(); //creo un nuevo rectangullo
		
		threadprincipal = new Thread(this);
		threadprincipal.start();
		
				
	}
	
	/*Game Loop*/
	public void run() {
		System.out.println("Juego Iniciado..");
		condicion=true;
		
		while(condicion){
			
			update();
			render();
			
			//dormir()
			try {Thread.sleep(20);} //luego vamos a regular
			catch (InterruptedException e) {}
		}
		
		System.exit(0);
		

		
	}
	public void terminarjuego(){
		condicion=false;
	}

	/*Funcion encargada de actualizar el estado del juego*/
	private void update(){
		
		rect.update();
	}
	
	/*Funcion encargada de dibujar en pantalla el estado del juego*/
	private void render(){
		
		Graphics g;
		g= this.getGraphics(); //Agarramos los graficos de la ventana
		
		//Dibujamos algunas cosas
		if (g!=null){
			g.setColor(Color.white);
			g.fillRect(0, 0, ANCHO, LARGO);
			
			rect.render(g);  //LAMADA AL RECT RENDER
			
				
			Toolkit.getDefaultToolkit().sync(); //syncronizar con la pantalla
				
			g.dispose(); //borramos la variable g
		}
	}
	
	public Rectangulo getRect() {
		return rect;
	}
	

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		JuegoJFrame ventana = new JuegoJFrame();
	}





}
