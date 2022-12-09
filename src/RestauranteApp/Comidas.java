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
public class Comidas {
    private String nombreComida;
    private String precioComida;

    public Comidas(String nombreComida, String precioComida) {
        this.nombreComida = nombreComida;
        this.precioComida = precioComida;
    }

    public String getNombreComida() {
        return nombreComida;
    }

    public void setNombreComida(String nombreComida) {
        this.nombreComida = nombreComida;
    }

    public String getPrecioComida() {
        return precioComida;
    }

    public void setPrecioComida(String precioComida) {
        this.precioComida = precioComida;
    }
    
    
}
