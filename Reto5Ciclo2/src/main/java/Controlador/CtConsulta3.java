/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Consulta3;
import Modelo.MdConsulta3;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jealm_000
 */
public class CtConsulta3 {

   static MdConsulta3 MdConsulta3 ;

    public CtConsulta3() {
        this.MdConsulta3 = new MdConsulta3();
    }

    public static DefaultTableModel MostrarConsulta3() {
        return MdConsulta3.MostrarConsulta3();
    }
    
    public static LinkedList<Consulta3> listaConsulta3() {
        LinkedList<Consulta3> resultado = new LinkedList();
        try {
            resultado = MdConsulta3.ListaConsulta3();
        } catch (Exception e) {

        }
        return resultado;
    }
        
}
