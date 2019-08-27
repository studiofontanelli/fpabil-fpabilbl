/**********************************************
 * CSI PIEMONTE 
 **********************************************/
package it.csi.fpabil.fpabilbl.web.rest.service;



import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/test")


@io.swagger.annotations.Api(description = "the test API")

public interface TestApi  {
   
    @GET
    @Path("/resources")
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Test resources", notes = "Effettua il test dei servizi richiamati", response = Void.class, tags={ "test", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Test eseguito con successo", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Test unsuccessful", response = Void.class) })
    public Response testResources(@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
