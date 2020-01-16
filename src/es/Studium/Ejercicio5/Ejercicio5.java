package es.Studium.Ejercicio5;
import java.awt.*;
/**
 * @author alvaro
 *
 */
public class Ejercicio5 extends Frame
{
	private static final long serialVersionUID = 1L;
	// Creación de una lista con 4 elementos visibles y que no
	// permite multiselección
	Choice choLista = new Choice(); //Esto indica la cantidad de elementos que seran visibles, el false indica si podemos o no marcar mas de un elemento de la lista.
	public Ejercicio5()
	{
		setLayout(new FlowLayout());
		setTitle("Lista"); //Titulo de la ventana
		//Añadimos los elementos de la lista
		choLista.add("Álava");
		choLista.add("Albacete");
		choLista.add("Alicante");
		choLista.add("Zaragoza");
		add(choLista); //Añadimos la lista
		setLocationRelativeTo(null);
		setSize(150,150);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio5(); //Mostramos la lista
	}
}