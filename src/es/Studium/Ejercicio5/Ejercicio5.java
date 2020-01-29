package es.Studium.Ejercicio5;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/**
 * @author alvaro
 *
 */
public class Ejercicio5 extends Frame implements WindowListener, ItemListener
{
	private static final long serialVersionUID = 1L;
	// Creaci�n de una lista con 4 elementos visibles y que no
	// permite multiselección
	Choice choLista = new Choice(); //Esto indica la cantidad de elementos que seran visibles, el false indica si podemos o no marcar mas de un elemento de la lista.
	public Ejercicio5()
	{
		setLayout(new FlowLayout());
		setTitle("Lista"); //Titulo de la ventana
		//Añadimos los elementos de la lista
		choLista.add("Elegir una");
		choLista.add("�lava");
		choLista.add("Albacete");
		choLista.add("Alicante");
		choLista.add("Zaragoza");
		add(choLista); //A�adimos la lista
		setLocationRelativeTo(null);
		setSize(150,150);

		choLista.addItemListener(this);
		this.addWindowListener(this);
		

		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio5(); //Mostramos la lista
	}
	@Override
	public void itemStateChanged(ItemEvent ie) {
		// TODO Auto-generated method stub
		String gentilicio= new String();
		if ("�lava".equals(ie.getItem())) {
			gentilicio = "Alav�s y Alavesa";
		}
		if ("Albacete".equals(ie.getItem())) {
			gentilicio = "Albacete�o y Albacete�a";
		}
		if ("Alicante".equals(ie.getItem())) {
			gentilicio = "Alicantino y Alicantina";
		}
		if ("Zaragoza".equals(ie.getItem())) {
			gentilicio = "Zaragozano y Zaragozana";
		}
		System.out.println(gentilicio);	
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0); 
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}