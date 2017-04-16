/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intesasanpaolo.fvc.resource;

import com.intesasanpaolo.fvc.model.Utente;
import com.intesasanpaolo.fvc.service.UtenteBean;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author IG01788
 */
@Path("/utentes")
//@RequestScoped
@Stateless
public class UtentesResource {

    @EJB
    private UtenteBean utenteBean;
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UtentesResource
     */
    public UtentesResource() {
    }

    /**
     * Retrieves representation of an instance of com.intesasanpaolo.fvc.resource.UtentesResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Utente getJson() {
        return utenteBean.getUtente();
    }

    /**
     * POST method for creating an instance of UtenteResource
     * @param content representation for the new resource
     * @return an HTTP response with content of the created resource
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postJson(Utente content) {
        //TODO
        return Response.created(context.getAbsolutePath()).build();
    }


}
