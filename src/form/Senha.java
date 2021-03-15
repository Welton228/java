/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author welto
 */
public class Senha {
    
    private int  numero;
    private char tipo;
    
    public Senha() {
       
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
       
    return  tipo+" - "+numero  ;
    }

    void remove(int i) {
        
    }

 
    
}
   
    

  
      

    
        
    
   
    
    
    
    
    

