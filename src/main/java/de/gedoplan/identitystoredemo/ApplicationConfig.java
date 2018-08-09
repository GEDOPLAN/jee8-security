package de.gedoplan.identitystoredemo;

import javax.enterprise.context.ApplicationScoped;
import javax.security.enterprise.authentication.mechanism.http.BasicAuthenticationMechanismDefinition;
import javax.security.enterprise.identitystore.DatabaseIdentityStoreDefinition;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * @author GEDOPLAN, Dominik Mathmann
 */
@ApplicationScoped
@BasicAuthenticationMechanismDefinition()
@DatabaseIdentityStoreDefinition(
        dataSourceLookup = "java:jboss/datasources/DemoDS",
        callerQuery = "select PASSWORD from USER where USERNAME=?",
        groupsQuery = "select GROUPNAME from USERGROUPS where USERNAME=?",
        hashAlgorithm = PlainTextPasswordHash.class
)
@ApplicationPath("resources")
public class ApplicationConfig extends Application {
}
