/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author javier
 */
public class sd {
    
    private int [][] matriz;
    
    public sd (int Nfilas, int Ncol){
        
        this.matriz = new int [Nfilas][Ncol];
        
    }
    
    public void setMatriz (int i, int j, int info){
        
        this.matriz[i][j] = info;
    }
    
    public int getMatriz (int i, int j){
        
        return matriz[i][j];
      
    }
    
}
