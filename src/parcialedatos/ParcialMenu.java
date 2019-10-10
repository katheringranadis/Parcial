
package parcialedatos;

import javax.swing.JOptionPane;

public class ParcialMenu {
    public static void main (String[] args){
        
        ParcialEDatos datos = new ParcialEDatos();
        
        int i=1;
        while(i==1){
        try{
        int opc = Integer.parseInt(JOptionPane.showInputDialog(null,"PARCIAL\n"+
                                           "1. QUE ES UN COMMIT?\n"+
                                           "2. QUE ES UN PUSH?\n"+
                                           "3. QUE ES UN PULL?\n"+
                                           "4. QUE ES UNA CLASE?\n"+
                                           "5. QUE ES UN OBJETO?\n"+
                                           "6. NOMBRE\n"+
                                           "7. FECHA\n"+
                                           "8. SALIR"));
       
        switch(opc){
            case 1:
                datos.commit();
                break;
               
            case 2:
                datos.push();
                break;
               
            case 3:
                datos.pull();
                break;
               
            case 4:
                datos.clase();
                break;
               
            case 5:
                datos.objeto();
                break;
               
            case 6:
                datos.setNombre("Katherin Granada");
                JOptionPane.showMessageDialog(null, datos.getNombre());
                break;
               
            case 7:
                datos.setFecha("Octubre 10 , 2019.");
                JOptionPane.showMessageDialog(null, datos.getFecha());
                break;
               
            case 8:
                i=0;
                JOptionPane.showMessageDialog(null, "Saliendo...");
                break;
               
            default:
                JOptionPane.showMessageDialog(null, "ingrese un valor valido");
        }
       
    }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Ingrese un valor numerico");
            }
        }
   }
}