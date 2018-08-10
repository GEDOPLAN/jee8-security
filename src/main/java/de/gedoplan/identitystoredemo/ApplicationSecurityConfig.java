package de.gedoplan.identitystoredemo;

import javax.enterprise.context.ApplicationScoped;
import javax.security.enterprise.authentication.mechanism.http.FormAuthenticationMechanismDefinition;
import javax.security.enterprise.authentication.mechanism.http.LoginToContinue;
import javax.security.enterprise.identitystore.DatabaseIdentityStoreDefinition;

@FormAuthenticationMechanismDefinition(
        loginToContinue = @LoginToContinue(
                loginPage = "/login.html",
                errorPage = "/error.html"))
@DatabaseIdentityStoreDefinition(
        dataSourceLookup = "java:jboss/datasources/DemoDS",
        callerQuery = "select PASSWORD from USER where USERNAME=?",
        groupsQuery = "select GROUPNAME from USERGROUPS where USERNAME=?",
        hashAlgorithm = PlainTextPasswordHash.class
)
@ApplicationScoped
public class ApplicationSecurityConfig {
}
