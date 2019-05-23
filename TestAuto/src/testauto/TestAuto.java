/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testauto;

import Auto.Auto;
import Auto.Motorizado;
import Auto.MotorizadoExeption;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Rodrigo
 */
public class TestAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motorizado auto = new Auto();
        
        try {
            auto.setVin("1234567890A234523");
        } catch (MotorizadoExeption ex) {
            Logger.getLogger(TestAuto.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        //////////////////////////////////////
        
       
        Auto auto2;
        try {
            
            Calendar fechaFab = new GregorianCalendar(2019,5,44);
              auto2 = new Auto("12345671231231234",fechaFab);   
              
        } catch (MotorizadoExeption ex) {
            Logger.getLogger(TestAuto.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
        System.out.println("Todo OK!\n");
        
    }
    
}

