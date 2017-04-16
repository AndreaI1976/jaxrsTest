/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intesasanpaolo.fvc.serviceb;

import com.intesasanpaolo.fvc.model.Utente;
import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author IG01788
 */
@Path("/us")
public class UtenteBsResource {
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UtenteBsResource
     */
    public UtenteBsResource() {
    }

    /**
     * Retrieves representation of an instance of com.intesasanpaolo.fvc.serviceb.UtenteBsResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Utente getXml() {
        UtenteClient client = new UtenteClient();
        Utente utente =client.getJson(Utente.class);
        utente.setCognome("Bianchi");
        return utente;
        
        
    }

    /**
     * POST method for creating an instance of UtenteBResource
     * @param content representation for the new resource
     * @return an HTTP response with content of the created resource
     */
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Response postXml(String content) {
        //TODO
        return Response.created(context.getAbsolutePath()).build();
    }

}
