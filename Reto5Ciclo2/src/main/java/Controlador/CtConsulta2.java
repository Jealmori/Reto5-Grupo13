/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Consulta2;
import Modelo.MdConsulta2;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jealm_000
 */
public class CtConsulta2 {

   static MdConsulta2 MdConsulta2 ;

    public CtConsulta2() {
        this.MdConsulta2 = new MdConsulta2();
    }

    public static DefaultTableModel MostrarConsulta2() {
        return MdConsulta2.MostrarConsulta2();
    }
    
    public static LinkedList<Consulta2> listaConsulta2() {
        LinkedList<Consulta2> resultado = new LinkedList();
        try {
            resultado = MdConsulta2.ListaConsulta2();
        } catch (Exception e) {

        }
        return resultado;
    }
        
}
