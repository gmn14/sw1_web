/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author Fernando
 */
public class Actividad {

    private String nombreActividad;
    private int idActividad;
    private Usuario delegadoActividad;
    private int delegado_codigoPucp;
    
    
    /**
     * @return the nombreActividad
     */
    public String getNombreActividad() {
        return nombreActividad;
    }

    /**
     * @param nombreActividad the nombreActividad to set
     */
    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    /**
     * @return the idActividad
     */
    public int getIdActividad() {
        return idActividad;
    }

    /**
     * @param idActividad the idActividad to set
     */
    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public Usuario getDelegadoActividad() {
        return delegadoActividad;
    }

    public void setDelegadoActividad(Usuario delegadoActividad) {
        this.delegadoActividad = delegadoActividad;
    }

    public int getDelegado_codigoPucp() {
        return delegado_codigoPucp;
    }

    public void setDelegado_codigoPucp(int delegado_Actividad) {
        this.delegado_codigoPucp = delegado_Actividad;
    }

}
