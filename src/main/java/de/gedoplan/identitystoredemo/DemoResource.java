package de.gedoplan.identitystoredemo;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author GEDOPLAN, Dominik Mathmann
 */
@Path("demo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Stateless
public class DemoResource {

    @GET
    @PermitAll
    public DemoModel getDemo() {
        return new DemoModel("Hello World");
    }
    
    @GET
    @Path("admin")
    @RolesAllowed("ADMIN")
    public DemoModel getAdminDemo() {
        return new DemoModel("Hello Admin");
    }
}
