/***********************************************************************
 * Module:  Agenda.java
 * Author:  Adamantium
 * Purpose: Defines the Class Agenda
 ***********************************************************************/

package model;

import java.util.*;

/** @pdOid e98ad5a0-63cd-4435-be10-8e700fcd9743 */
public class Agenda {
   /** @pdOid 00d1aeb4-ded9-4319-9297-e204bf106cca */
   private int id;
   /** @pdOid e2b80fae-e3e1-4077-b0da-b47719afe780 */
   private Map <GregorianCalendar, Dia> dias;

    public Agenda(int id, Map<GregorianCalendar, Dia> dias) {
        this.id = id;
        this.dias = dias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<GregorianCalendar, Dia> getDias() {
        return dias;
    }

    public void setDias(Map<GregorianCalendar, Dia> dias) {
        this.dias = dias;
    }

}