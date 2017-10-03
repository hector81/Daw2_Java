/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoRecordatorio;

import java.util.Comparator;
import java.util.GregorianCalendar;

/**
 *
 * @author user
 */
public class OrdenarHoraAsunto implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        int aux;
        Apunte apunte1=(Apunte)o1;
        Apunte apunte2=(Apunte)o2;
        
        apunte1.getFecha().set(GregorianCalendar.HOUR, apunte2.getFecha().get(GregorianCalendar.HOUR));
        apunte1.getFecha().set(GregorianCalendar.MINUTE, apunte2.getFecha().get(GregorianCalendar.MINUTE));
        apunte1.getFecha().set(GregorianCalendar.SECOND, apunte2.getFecha().get(GregorianCalendar.SECOND));
        
        aux=apunte1.getFecha().compareTo(apunte2.getFecha());
        return aux;
    
    }

    
}
