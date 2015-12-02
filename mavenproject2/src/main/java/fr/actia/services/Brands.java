/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.actia.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author yyadine
 */
@Path("brands")
public class Brands {
    
    @Path("getMethod/{id}")
    @GET
    public Response getBrands(@PathParam("name") String name)
    {
        String message = "le paramètre saisi est : " + name;
        
        return Response.status(200).entity(message).build();
    }
    
}
