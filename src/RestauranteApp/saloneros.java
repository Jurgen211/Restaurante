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
public class saloneros {
    private String codigo;
    private String nombre;
    private String numeromesa;

    public saloneros(String codigo, String nombre, String numeromesa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeromesa = numeromesa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeromesa() {
        return numeromesa;
    }

    public void setNumeromesa(String numeromesa) {
        this.numeromesa = numeromesa;
    }

 
}
