/**********************************************
 * CSI PIEMONTE 
 **********************************************/
package it.csi.fpabil.fpabilbl.web.rest.service;

import it.csi.fpabil.fpabilbl.web.rest.dto.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.fpabil.fpabilbl.web.rest.dto.ComuneArray;
import it.csi.fpabil.fpabilbl.web.rest.dto.ProvinciaArray;
import it.csi.fpabil.fpabilbl.web.rest.dto.StatoArray;
import it.csi.fpabil.fpabilbl.web.rest.dto.TipoDocumentoArray;

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
    @Path("/comuni/all")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Get All comuni", notes = "Restituisce l'elenco completo dei comuni", response = ComuneArray.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ComuneArray.class) })
    public Response getComuni(@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/comuni/byprovincia")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Get comuni By provicia", notes = "Restituisce l'elenco dei comuni della provincia passata come", response = ComuneArray.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ComuneArray.class) })
    public Response getComuniByProvincia( @NotNull @QueryParam("codprovincia") String codprovincia,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/province")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Get All province", notes = "Restituisce l'elenco completo delle province", response = ProvinciaArray.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ProvinciaArray.class) })
    public Response getProvince(@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/statiesteri")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Get Stati Esteri", notes = "Restituisce l'elenco degli stati esteri", response = StatoArray.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = StatoArray.class) })
    public Response getStatiEsteri(@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/tipidocumento")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Get All tipo documento", notes = "Restituisce l'elenco completo dei tipi documento", response = TipoDocumentoArray.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = TipoDocumentoArray.class) })
    public Response getTipiDocumento(@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
