package de.gedoplan.identitystoredemo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GEDOPLAN, Dominik Mathmann
 */
@WebServlet(urlPatterns = "/servlet")
@ServletSecurity(@HttpConstraint(rolesAllowed = "ADMIN"))
public class DemoServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Hello World");
    }
    
    

}
