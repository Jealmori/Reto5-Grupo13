/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Clases.Consulta3;
import java.sql.*;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jealm_000
 */
public class MdConsulta3 {
    public static ResultSet consulta(){
        Statement stmt= null;
        ResultSet rs=null;
        try {
            
            Connection conn=Dbdata.getConnection();
            String csql="""
            SELECT id_compra AS "ID Compra" ,constructora, banco_vinculado AS Banco
            FROM Proyecto  
            INNER JOIN Compra ON Proyecto.id_proyecto = Compra.id_proyecto
            WHERE proveedor = "Homecenter" AND ciudad = "Salento" """;
            stmt=conn.createStatement();
            rs=stmt.executeQuery(csql);

        } catch (SQLException e) {
            //TODO: handle exception
            System.out.println(e);
        }
        return rs;
    }  
    public static LinkedList<Consulta3> ListaConsulta3(){
        LinkedList<Consulta3> listaConsulta3 = new LinkedList<>();
        try{
            ResultSet rs= consulta();
            while (rs.next()) {
                int idCompra = rs.getInt(1);     
                String constructora = rs.getString(2);                
                String banco= rs.getString(3);
                
                Consulta3 c = new Consulta3(idCompra, constructora,banco);
                listaConsulta3.add(c);
            }
            return listaConsulta3;
        } catch(SQLException e){
        System.out.println(e);
        }        
     return listaConsulta3;  
    }
    
    public static DefaultTableModel MostrarConsulta3(){
            LinkedList<Consulta3> lista = ListaConsulta3();
            DefaultTableModel modelo = new DefaultTableModel();
            Object[] fila = new Object[3];
            modelo.addColumn("ID COMPRA");
            modelo.addColumn("CONSTRUCTORA");
            modelo.addColumn("BANCO");

            for(int i=0;i<lista.size();i++){
                fila[0]=lista.get(i).getIdCompra();
                fila[1]=lista.get(i).getConstructora();
               fila[2]=lista.get(i).getBancoVinculado(); 
                modelo.addRow(fila);
            }
       return modelo;        
    }    
}
