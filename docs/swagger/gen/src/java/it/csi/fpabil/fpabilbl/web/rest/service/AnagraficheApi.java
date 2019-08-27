/**********************************************
 * CSI PIEMONTE 
 **********************************************/
package it.csi.fpabil.fpabilbl.web.rest.service;

import it.csi.fpabil.fpabilbl.web.rest.dto.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.fpabil.fpabilbl.web.rest.dto.ProvinciaArray;

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

@Path("/anagrafiche")


@io.swagger.annotations.Api(description = "the anagrafiche API")

public interface AnagraficheApi  {
   
    @GET
    @Path("/province")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Get All province", notes = "Restituisce l'elenco completo delle province", response = ProvinciaArray.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ProvinciaArray.class) })
    public Response getProvince(@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
