package io.jans.configapi.plugin.scim.rest;

import io.jans.configapi.plugin.scim.rest.ScimResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


@ApplicationPath("/scim")
public class ApiApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        HashSet<Class<?>> classes = new HashSet<Class<?>>();

        // General
        classes.add(ScimResource.class);

        return classes;
    }
}
