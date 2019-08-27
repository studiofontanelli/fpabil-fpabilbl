package it.csi.fpabil.fpabilbl.web.rest.service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import it.csi.fpabil.fpabilbl.web.rest.service.impl.TestApiServiceImpl;

@ApplicationPath("/")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(TestApiServiceImpl.class);

        return resources;
    }




}