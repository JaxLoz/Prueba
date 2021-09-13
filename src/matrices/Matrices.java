/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author javier
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int Nfilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));;
        int Ncol = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de columnas"));
        
        sd matriz = new sd(Nfilas, Ncol);
        
        for (int i = 0; i < Nfilas; i++){
            for (int j = 0; j < Ncol; j++){
                
                int Info = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dato para la coordenada "+"("+(i+1)+","+(j+1)+")"+" de la matriz"
                        +"\n"+"Tamaño de la matriz: "+Nfilas+"x"+Ncol));
                
                matriz.setMatriz(i, j, Info);
            
            }  
        }
        
        System.out.println("Informacion de la Matriz:");
        for (int i = 0; i < Nfilas; i++){
            for (int j = 0; j < Ncol; j++){
                
                System.out.println(matriz.getMatriz(i, j));
                
            }
        }
        
        
    }
    
}
