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

   /* public Auto(String vin, Calendar fechaFab) throws MotorizadoExeption {
        super(vin, fechaFab);
        
    }*/
     
     public Auto(String vin, String marca, String modelo, String patente,Calendar fechaFab ) throws MotorizadoExeption
	{
            //Auto("123456G7891234567", "fiat","modelo","4646",fechaX);
		super( vin, marca, modelo, patente,fechaFab );
		this.marca = marca;
                this.modelo = modelo;
                this.patente = patente;
	}

    
    
   
    
    private Double precio;
    
    private Integer anio;

    
    
    




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
