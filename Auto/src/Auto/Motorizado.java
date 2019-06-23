/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auto;

import java.util.Calendar;

/**
 *
 * @author Rodrigo
 */
public class Motorizado {

    public final int vin_length = 17;
    private String vin;
    
    private Calendar fechaFab;

    public final int marca_length = 5;
    protected String marca;

    public final int modelo_length = 5;
    protected String modelo;

    public final int patente_length = 5;
    protected String patente;

    public Motorizado() {
    }

    //constructor motorizado
    /* public Motorizado(String vin,Calendar fechaFab) throws MotorizadoExeption{
        setVin(vin);
        setFechaFab(fechaFab);
    }*/
    public Motorizado(String vin, String marca, String modelo, String patente, Calendar fechaFab) throws MotorizadoExeption {
        setVin(vin);
        setMarca(marca);
        setModelo(modelo);
        setPatente(patente);
        setFechaFab(fechaFab);
    }

    //super( vin, marca, modelo, patente,fechaFab );
    public String getVin() {
        return vin;
    }

    public final void setVin(String vin) throws MotorizadoExeption {
        if (vin == null || vin.trim().isEmpty()) {
            throw new MotorizadoExeption("El VIN no puede ser vacio");
            //para lanzar exeption hay que agregar throws
        }

        if (vin.length() != vin_length) {
            throw new MotorizadoExeption("El VIN debe contener " + vin_length + " caracteres");
        }
        this.vin = vin;
    }

    public String getMarca() {
        return this.marca;
    }

    public final void setMarca(String marca) {
        if (marca.length() > marca_length)
            this.marca = marca.substring(marca_length - 1);
        else
            this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public final void setModelo(String modelo) {
        if (modelo.length() > modelo_length)
            this.modelo = modelo.substring(modelo_length - 1);
        else
            this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public final void setPatente(String patente) {
        if (patente.length() > patente_length)
            this.patente = patente.substring(patente_length - 1);
        else
            this.patente = patente;
    }

    public Calendar getFechaFab() {
        return fechaFab;
    }

    public final void setFechaFab(Calendar fechaFab) {
        this.fechaFab = fechaFab;
    }
}
