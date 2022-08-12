/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jealm_000
 */
public class Consulta1 {
    
    private int idLider;
    private String nombreLider;
    private String apellidoLider;
    private String ciudadLider;

    public Consulta1() {
    }

    public Consulta1(int idLider, String nombreLider, String apellidoLider, String ciudadLider) {
        this.idLider = idLider;
        this.nombreLider = nombreLider;
        this.apellidoLider = apellidoLider;
        this.ciudadLider = ciudadLider;
    }
     
   

    /**
     * @return the idLider
     */
    public int getIdLider() {
        return idLider;
    }

    /**
     * @param idLider the idLider to set
     */
    public void setIdLider(int idLider) {
        this.idLider = idLider;
    }

    /**
     * @return the nombreLider
     */
    public String getNombreLider() {
        return nombreLider;
    }

    /**
     * @param nombreLider the nombreLider to set
     */
    public void setNombreLider(String nombreLider) {
        this.nombreLider = nombreLider;
    }

    /**
     * @return the apellidoLider
     */
    public String getApellidoLider() {
        return apellidoLider;
    }

    /**
     * @param apellidoLider the apellidoLider to set
     */
    public void setApellidoLider(String apellidoLider) {
        this.apellidoLider = apellidoLider;
    }

    /**
     * @return the ciudadLider
     */
    public String getCiudadLider() {
        return ciudadLider;
    }

    /**
     * @param ciudadLider the ciudadLider to set
     */
    public void setCiudadLider(String ciudadLider) {
        this.ciudadLider = ciudadLider;
    }

}
