package de.gedoplan.identitystoredemo;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
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
@DeclareRoles({"ADMIN"})
@RolesAllowed("ADMIN")
public class DemoResource {

    @GET
    public DemoModel getDemo() {
        return new DemoModel("Hello World");
    }
}
