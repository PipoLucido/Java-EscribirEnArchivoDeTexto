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
public class MotorizadoExeption extends Exception {

    public MotorizadoExeption(String mensaje) {
        super(mensaje); // super invoca a la clase padre, en este caso Exeption
    }
    
}
