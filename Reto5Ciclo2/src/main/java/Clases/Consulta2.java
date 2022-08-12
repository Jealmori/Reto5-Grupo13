/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jealm_000
 */
public class Consulta2 {
    
    private int idProyecto;
    private String constructora;
    private double numeroHabitaciones;
    private String ciudad;

    public Consulta2() {
    }

    public Consulta2(int idProyecto, String constructora, double numeroHabitaciones, String ciudad) {
        this.idProyecto = idProyecto;
        this.constructora = constructora;
        this.numeroHabitaciones = numeroHabitaciones;
        this.ciudad = ciudad;
    }

    /**
     * @return the idProyecto
     */
    public int getIdProyecto() {
        return idProyecto;
    }

    /**
     * @param idProyecto the idProyecto to set
     */
    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    /**
     * @return the constructora
     */
    public String getConstructora() {
        return constructora;
    }

    /**
     * @param constructora the constructora to set
     */
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    /**
     * @return the numeroHabitaciones
     */
    public double getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    /**
     * @param numeroHabitaciones the numeroHabitaciones to set
     */
    public void setNumeroHabitaciones(double numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
