/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.*;
/**
 *
 * @author jealm_000
 */
public class Dbdata {
    private static final String UBICACION_BD = "ProyectosConstruccion.db";
    public static Connection getConnection() throws SQLException {
    String url = "jdbc:sqlite:" + UBICACION_BD;
    return DriverManager.getConnection(url);
}
   
}
