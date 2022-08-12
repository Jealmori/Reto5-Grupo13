/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.LinkedList;
import Clases.Consulta1;
import Modelo.MdConsulta1;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author jealm_000
 */
public class CtConsulta1 {

   static MdConsulta1 MdConsulta1 ;

    public CtConsulta1() {
        this.MdConsulta1 = new MdConsulta1();
    }

    public static DefaultTableModel MostrarConsulta1() {
        return MdConsulta1.MostrarConsulta1();
    }
    
    public static LinkedList<Consulta1> listaConsulta1() {
        LinkedList<Consulta1> resultado = new LinkedList();
        try {
            resultado = MdConsulta1.ListaConsulta1();
        } catch (Exception e) {

        }
        return resultado;
    }
    

}
    
