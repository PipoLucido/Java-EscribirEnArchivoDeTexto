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
public class Auto extends Motorizado{
    
    private String marca;
    private String modelo;

    public Auto(){
        super();
    }
    public Auto(String vin, MiCalendario fechaFab) throws MotorizadoExeption {
        super(vin, fechaFab);
    }
    
    public Auto(String vin, MiCalendario fechaFab, String marca) throws MotorizadoExeption {
        super(vin, fechaFab);
        this.marca = marca;
    }
    
    public Auto(String vin, MiCalendario fechaFab, String marca, String modelo) throws MotorizadoExeption {
        super(vin, fechaFab);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
