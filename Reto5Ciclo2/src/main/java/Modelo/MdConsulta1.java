/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Clases.Consulta1;
import java.sql.*;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jealm_000
 */
public class MdConsulta1 {

    public static ResultSet consulta(){
        Statement stmt= null;
        ResultSet rs=null;
        try {
            
            Connection conn=Dbdata.getConnection();
            String csql="""
            SELECT id_lider AS ID , nombre AS Nombre , primer_apellido AS Apellido ,ciudad_residencia as Ciudad
            FROM Lider
            ORDER BY Ciudad """;
            stmt=conn.createStatement();
            rs=stmt.executeQuery(csql);

        } catch (SQLException e) {
            //TODO: handle exception
            System.out.println(e);
        }
        return rs;
    }  
    public  static LinkedList<Consulta1> ListaConsulta1(){
        LinkedList<Consulta1> listaConsulta1 = new LinkedList<>();
        try{
            ResultSet rs= consulta();
            while (rs.next()) {
                int idLider = rs.getInt(1);     
                String nombre = rs.getString(2);                
                String apellido= rs.getString(3);
                String ciudad = rs.getString(4);
                
                Consulta1 c = new Consulta1(idLider, nombre, apellido,ciudad);
                listaConsulta1.add(c);
            }
            return listaConsulta1;
        } catch(SQLException e){
        System.out.println(e);
        }        
     return listaConsulta1;  
    }
    
    public static DefaultTableModel MostrarConsulta1(){
            LinkedList<Consulta1> lista = ListaConsulta1();
            DefaultTableModel modelo = new DefaultTableModel();
            Object[] fila = new Object[4];
            modelo.addColumn("ID");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("CIUDAD");
            for(int i=0;i<lista.size();i++){
                fila[0]=lista.get(i).getIdLider();
                fila[1]=lista.get(i).getNombreLider();
               fila[2]=lista.get(i).getApellidoLider();
               fila[3]=lista.get(i).getCiudadLider(); 
                modelo.addRow(fila);
            }
       return modelo;        
    }

}
