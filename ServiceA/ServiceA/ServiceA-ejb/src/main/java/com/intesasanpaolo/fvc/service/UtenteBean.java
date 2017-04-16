/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intesasanpaolo.fvc.service;

import com.intesasanpaolo.fvc.model.Utente;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;


@Stateless
@LocalBean
public class UtenteBean {

    public Utente getUtente() {
        Utente ute = new Utente();
        ute.setCognome("Rossi");
        ute.setNome("Mario");
        return ute;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
