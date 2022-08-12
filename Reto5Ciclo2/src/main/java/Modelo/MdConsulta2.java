/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Clases.Consulta2;
import java.sql.*;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jealm_000
 */
public class MdConsulta2 {
     public static ResultSet consulta(){
        Statement stmt= null;
        ResultSet rs=null;
        try {
            
            Connection conn=Dbdata.getConnection();
            String csql="""
            SELECT id_proyecto , constructora , numero_habitaciones , ciudad 
            FROM Proyecto
            Where Proyecto.clasificacion = "Casa Campestre" AND ciudad in ( "Santa Marta", "Cartagena","Barranquilla")
                        """;
            stmt=conn.createStatement();
            rs=stmt.executeQuery(csql);

        } catch (SQLException e) {
            //TODO: handle exception
            System.out.println(e);
        }
        return rs;
    }  
    public static LinkedList<Consulta2> ListaConsulta2(){
        LinkedList<Consulta2> listaConsulta2 = new LinkedList<>();
        try{
            ResultSet rs= consulta();
            while (rs.next()) {
                int idProyecto = rs.getInt(1);     
                String constructora = rs.getString(2);                
                double habitaciones = rs.getDouble(3);
                String ciudad = rs.getString(4);
                
                Consulta2 c = new Consulta2(idProyecto, constructora, habitaciones,ciudad);
                listaConsulta2.add(c);
            }
            return listaConsulta2;
        } catch(SQLException e){
        System.out.println(e);
        }        
     return listaConsulta2;  
    }
    
    public static DefaultTableModel MostrarConsulta2(){
            LinkedList<Consulta2> lista = ListaConsulta2();
            DefaultTableModel modelo = new DefaultTableModel();
            Object[] fila = new Object[4];
            modelo.addColumn("ID PROYECTO");
            modelo.addColumn("CONSTRUCTORA");
            modelo.addColumn("HABITACIONES");
            modelo.addColumn("CIUDAD");
            for(int i=0;i<lista.size();i++){
                fila[0]=lista.get(i).getIdProyecto();
                fila[1]=lista.get(i).getConstructora();
               fila[2]=lista.get(i).getNumeroHabitaciones();
               fila[3]=lista.get(i).getCiudad(); 
                modelo.addRow(fila);
            }
       return modelo;        
    }   
}
