
package parcialedatos;

import javax.swing.JOptionPane;

public class ParcialEDatos {
    
    private int id;
    private String fecha;
    private String nombre;
   
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodo commit
    public void commit(){
        JOptionPane.showMessageDialog(null,"Que es Commit: Aqui deberia ir mas informacion pero por tiempo, lo siento!");
    }
    
    //metodo push
    public void push(){
        JOptionPane.showMessageDialog(null,"Que es Push: Aqui deberia ir mas informacion pero por tiempo, lo siento!");
    }
    
    //metodo pull
    public void pull(){
        JOptionPane.showMessageDialog(null,"Que es Pull: Aqui deberia ir mas informacion pero por tiempo, lo siento!");
    }
    
    //metodo clase
    public void clase(){
        JOptionPane.showMessageDialog(null,"Que es una Clase: Aqui deberia ir mas informacion pero por tiempo, lo siento!");
    }
    
    //metodo objeto
    public void objeto(){
        JOptionPane.showMessageDialog(null,"Que es un objeto: Aqui deberia ir mas informacion pero por tiempo, lo siento!");
    }
   
}
    
