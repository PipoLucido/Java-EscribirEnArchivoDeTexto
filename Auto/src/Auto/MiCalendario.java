/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auto;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Emili
 */
public abstract class MiCalendario extends GregorianCalendar{

    public MiCalendario(int d, int m, int a) throws MiCalendarException
    {
        super(a, m, d);
        
        if (d != this.get(Calendar.DAY_OF_MONTH) || m != this.get(Calendar.MONTH) || a != this.get(Calendar.YEAR))
            throw new MiCalendarException();
    }
    
    @Override
    public String toString() {
        return Integer.toString(this.get(Calendar.DAY_OF_MONTH)) +
                "-" +
                Integer.toString(this.get(Calendar.MONTH)) +
                "-" +
                Integer.toString(this.get(Calendar.YEAR));
    }
}
