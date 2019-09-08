
package ascensor;

import javax.swing.JOptionPane;

public class Ascensor {
    
    private int numeroPisos, numeroSotanos;

    public Ascensor(int NumeroPisos, int numeroSotanos) {
        this.numeroPisos = NumeroPisos;
        this.numeroSotanos = numeroSotanos;
    }
    public void pisoSiguiente(int pisoActual){
       int pisoArriba = pisoActual + 1;
       if(pisoActual == numeroPisos){
           JOptionPane.showMessageDialog(null, "Te encuentras en el piso mas alto, solo puedes bajar");
          
           // colocar metodo para mostrar piso mas bajo           
       } else if(pisoArriba == 0){
           JOptionPane.showMessageDialog(null, "El  piso de arriba es el numero 1");
       } else {
           JOptionPane.showMessageDialog(null, "El siguiente piso es el numero " + pisoArriba);
       }
           
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public int getNumeroSotanos() {
        return numeroSotanos;
    }
    public void pisoAnterior(int pisoActual){
       int pisoAbajo = 0;
       if(pisoActual > 0){
       pisoAbajo = (pisoActual - 1);
       } else if (pisoActual < 0){
       pisoAbajo = (pisoActual - 1)*-1;
       }
       
        
       if(pisoActual == numeroSotanos){
           JOptionPane.showMessageDialog(null, "Te encuentras en el piso mas bajo, solo puedes subir");  
       } else if(pisoAbajo == 0){
           JOptionPane.showMessageDialog(null, "El piso de abajo es el sotano 1.");
       } else if(pisoActual > 1) {
           JOptionPane.showMessageDialog(null, "El piso de abajo es el " + pisoAbajo);
       } else if(pisoActual == 1 || pisoActual < 0 ){
           JOptionPane.showMessageDialog(null, "El piso de abajo es el sotano " + pisoAbajo);
       }
           
    }
    public void cantidadPisosDeServicio(){
            
        JOptionPane.showMessageDialog(null,"El asensor puede servir a " + (numeroPisos + numeroSotanos ) + " pisos.");
    }
}
