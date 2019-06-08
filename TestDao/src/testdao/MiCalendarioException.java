/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdao;

/**
 *
 * @author Emili
 */
public class MiCalendarioException extends Exception {

    public MiCalendarioException() {
        super("Fecha introducida no válida");
    }
}
