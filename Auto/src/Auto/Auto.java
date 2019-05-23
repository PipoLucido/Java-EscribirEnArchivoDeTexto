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
public class Auto extends Motorizado{
    
     public Auto(){
        super();
    }

    public Auto(String vin, Calendar fechaFab) throws MotorizadoExeption {
        super(vin, fechaFab);
        
    }

    
    
    private String marca;
    
    private String modelo;
    
    private String patente;
    
    private Calendar fechaDePatentamiento;
    
    private Double precio;
    
    private Integer anio;

    


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Calendar getFechaDePatentamiento() {
        return fechaDePatentamiento;
    }

    public void setFechaDePatentamiento(Calendar fechaDePatentamiento) {
        this.fechaDePatentamiento = fechaDePatentamiento;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    
   
}
