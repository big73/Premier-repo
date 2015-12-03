/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actia.services;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author yyadine
 */
@Path("brands")
public class BrandServices {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of BrandServices
     */
    public BrandServices() {
    }

    /**
     * Retrieves representation of an instance of com.actia.services.BrandServices
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        return "It works !";
    }

    
}
