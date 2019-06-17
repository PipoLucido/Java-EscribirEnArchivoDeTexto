/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdao;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Emili
 */
public class MiCalendario extends GregorianCalendar{

    public MiCalendario(int d, int m, int a) throws MiCalendarioException
    {
        super(a, m, d);
        
        if (this.get(Calendar.DAY_OF_MONTH) != d || this.get(Calendar.MONTH) != m || this.get(Calendar.YEAR) != a)
            throw new MiCalendarioException();
    }
    
    @Override
    public String toString() {
        
        String day,month;
        
        if(this.get(Calendar.DAY_OF_MONTH) < 10 ){
            day = "0"+Integer.toString(this.get(Calendar.DAY_OF_MONTH));
        }else{
            day = Integer.toString(this.get(Calendar.DAY_OF_MONTH));
        }
        
        if(this.get(Calendar.MONTH) < 10 ){
            month = "0"+Integer.toString(this.get(Calendar.MONTH));
        }else{
            month = Integer.toString(this.get(Calendar.MONTH));
        }
        
        
        return day +
                "-" +
                month +
                "-" +
                Integer.toString(this.get(Calendar.YEAR));
    }
}