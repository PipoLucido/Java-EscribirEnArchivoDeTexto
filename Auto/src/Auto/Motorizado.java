/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auto;

/**
 *
 * @author Rodrigo
 */
public class Motorizado {
    
    private final static Short VIN_LONG = 17;
    private MiCalendario fechaFab;
    private String vin;

    public Motorizado() {
        // Empty
    }
    // Constructor motorizado
    public Motorizado(String v, MiCalendario f) throws MotorizadoExeption {
        this.vin = v;
        this.fechaFab = f;
    }

    public void setVin(String v) throws MotorizadoExeption {
        if(v == null || v.trim().isEmpty()){
            throw new MotorizadoExeption("El VIN no puede ser vacio");
            //para lanzar exeption hay que agregar throws
        }
        
        if(v.length() != VIN_LONG)
            throw new MotorizadoExeption("El VIN debe contener " + VIN_LONG + " caracteres");
        
        this.vin = v;
    }
    
    public void setFechaFab(MiCalendario f) {
        this.fechaFab = f;
    }
    
    public String getVin() {
        return vin;
    }
    
    public MiCalendario getFechaFab() {
        return fechaFab;
    }
}
