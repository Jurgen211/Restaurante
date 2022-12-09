/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Vector;
import RestauranteApp.Menus;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author 
 */
public class Metodos {
    
    Vector vPrincipal = new Vector();
    
   //Procedimiento para Guardar datos en un vector
    public void Guardar(Menus unMenu){
     
        vPrincipal.addElement(unMenu);
    }
    
    
    //Procedimiento para Guardar en un archivo de txt
    public void GuardarArchivo(Menus Menu) {
        try {

            FileWriter fw = new FileWriter("Menu.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(Menu.getNmesa());
            pw.print("|"+Menu.getEntrada());
            pw.print("|"+Menu.getPentrada());
            pw.println("|"+Menu.getCentrada());

            pw.print(Menu.getNmesa());
            pw.print("|"+Menu.getBebida());
            pw.print("|"+Menu.getPbebida());
            pw.println("|"+Menu.getCbebida());

            pw.print(Menu.getNmesa());
            pw.print("|"+Menu.getPostre());
            pw.print("|"+Menu.getPpostres());
            pw.println("|"+Menu.getCpostres());

            pw.print(Menu.getNmesa());
            pw.print("|"+Menu.getNuevos());
            pw.print("|"+Menu.getPnuevos());
            pw.println("|"+Menu.getCnuevos());
            pw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//final del método GuardarArchivo
    
    
    //Funcion para mostrar los datos en un jTable1
    public DefaultTableModel listaMenu(){
        
        Vector Cabeceras = new Vector();
        Cabeceras.addElement("Mesa");
        Cabeceras.addElement("Nombre");
        Cabeceras.addElement("Precio");
        Cabeceras.addElement("Cantidad");
        //creamos un vector que contenga Mesa,Nombre,Precio,Cantidad
        DefaultTableModel mdlTabla = new DefaultTableModel(Cabeceras,0);
        
        try{
            FileReader fr = new FileReader("Menu.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d = br.readLine())!=null){ 
                StringTokenizer dato = new StringTokenizer(d,"|");
                Vector x = new Vector();
                while(dato.hasMoreTokens()){
                   x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
        return mdlTabla;
        
    } 
    
    public void borrarArchivo(String Path){
        File file = new File(Path);
        if (file.delete()) {
            System.out.println("Archivo Eliminado");   
        }else{
            System.out.println("Archivo No Eliminado");
        }
                
        
    }
}
