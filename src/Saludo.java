import javax.swing.JOptionPane;

/**
 * 
 * @author Luis Garcia
 * @version 0.0.1
 * Clase principal del proyecto, la cual muestra los datos de los String 'nombre' y 'edad'.
 *
 */

public class Saludo {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String nombre="abc";
		String edad="21";
		//System.out.print("hola "+ nombre);
		//%s para concatenar en lugar del +
		//System.out.printf("hola: %s", nombre);
		JOptionPane.showMessageDialog(null,String.format("Hola: %s tu edad es de %s años de edad.", nombre,edad));
	}
}
