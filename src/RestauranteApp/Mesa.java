/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteApp;

/**
 *
 * @author
 */
public class Mesa {
    private String numeroMesa;
    private String CantidadPersonas;
    
  //Constructor 
    public Mesa(String numeroMesa, String CantidadPersonas) {
        this.numeroMesa = numeroMesa;
        this.CantidadPersonas = CantidadPersonas;
        
    }

    //metodos de GET Y SET
    public String getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getCantidadPersonas() {
        return CantidadPersonas;
    }

    public void setCantidadPersonas(String CantidadPersonas) {
        this.CantidadPersonas = CantidadPersonas;
    }
}
