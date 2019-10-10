
package parcialedatos;

import javax.swing.JOptionPane;

public class ParcialMenu {
    public static void main (String[] args){
        
        ParcialEDatos datos = new ParcialEDatos();
        String commit = "Hola";
        String push = "";
        String pull = "";
        String clase = "";
        String objeto = "";
        
        JOptionPane.showMessageDialog(null, datos.Commit(commit));
        JOptionPane.showMessageDialog(null, datos.push(push));
        JOptionPane.showMessageDialog(null, datos.pull(pull));
        JOptionPane.showMessageDialog(null, datos.clase(clase));
        JOptionPane.showMessageDialog(null, datos.objeto(objeto));
        
    }
    

}
