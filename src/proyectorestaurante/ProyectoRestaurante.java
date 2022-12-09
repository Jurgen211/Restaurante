/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorestaurante;

import javax.swing.JOptionPane;

/**
 **Proyecto Ingeniería Informatica
 * Universidad 
 * PROYECTO PROGRAMADO No.1
 * Profesar@:
 * Estudiante: 
 * Version: 1.0
 * Nombre Poryecto: Hardware Store Application(Apliccón de Restaurante);
 * Fecha de Creación: 28 de Setiembre del 2021
 * Fecha de Modificación: 30 de Setiembre del 2021
 * Nombre del Metodo : AppRestaurante.
 * Proposito del Metodo : Despliega un Menu del App Restaurante con las opciones a escoger.
 * Parametros de Entrada : Ninguno. 
 * Parametros de Salida: Return.
 * Estructuras de datos principales que utiliza : Java Frame
 * Métodos que lo llaman :  Frm Principal.
 * Métodos que llama : Carpeta APP.Categorias   
 * Descripción: Menu para Sistemas de Restaurante 
 * @author 
 * Copyright © 2021 AJP.
 *
 */
public class ProyectoRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Bienvenida al Sistema
         JOptionPane.showMessageDialog(null,"Ha Ingresado  al Sistema Aplicación de Restaurantes \n "
                + "Si Posse Credenciales Ingrese Adminisrador \n");
        
        //Inicializamos para hacer el llamado al método Principal
        InicioApp Inicio = new InicioApp();    
       //Ubicación de nuestro Jframe
        Inicio.setLocationRelativeTo(null);
        //muestre el Método
        Inicio.show();
        
        
    }//Final del Método Main
    
}//Final de la clase Proyecto Restaurante
