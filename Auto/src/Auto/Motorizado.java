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
    
    public final static Short VIN_LONG = 17;
    
    public Motorizado(){
    }
    //constructor motorizado
    public Motorizado(String vin,Calendar fechaFab) throws MotorizadoExeption{
        setVin(vin);
        setFechaFab(fechaFab);
    }
    
    private String vin;
    
    private Calendar fechaFab;

    public String getVin() {
        return vin;
    }

    public final void setVin(String vin) throws MotorizadoExeption {
        if(vin == null || vin.trim().isEmpty()){
            throw new MotorizadoExeption("El VIN no puede ser vacio");
            //para lanzar exeption hay que agregar throws
        }
        
        if(vin.length() != VIN_LONG){
            throw new MotorizadoExeption("El VIN debe contener "+VIN_LONG+" caracteres");
        }
            
        
        
        this.vin = vin;
    }

    public Calendar getFechaFab() {
        return fechaFab;
    }

    public void setFechaFab(Calendar fechaFab) {
        this.fechaFab = fechaFab;
        
        toString(fechaFab);
    }

    private void toString(Calendar fechaFab) {
      
    }

    
}
