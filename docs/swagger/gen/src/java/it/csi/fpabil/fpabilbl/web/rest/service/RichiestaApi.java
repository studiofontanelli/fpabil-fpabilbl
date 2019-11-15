/**********************************************
 * CSI PIEMONTE 
 **********************************************/
package it.csi.fpabil.fpabilbl.web.rest.service;

import it.csi.fpabil.fpabilbl.web.rest.dto.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.fpabil.fpabilbl.web.rest.dto.ComuneArray;
import it.csi.fpabil.fpabilbl.web.rest.dto.GenericResponse;
import it.csi.fpabil.fpabilbl.web.rest.dto.SalvaRichiestaRequest;
import it.csi.fpabil.fpabilbl.web.rest.dto.SalvaRichiestaResponse;
import it.csi.fpabil.fpabilbl.web.rest.dto.TestRequest;

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

@Path("/richiesta")


@io.swagger.annotations.Api(description = "the richiesta API")

public interface RichiestaApi  {
   
    @GET
    @Path("/search")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Recupera la richiesta", notes = "Recupera la richiesta", response = ComuneArray.class, tags={ "search richiesta", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ComuneArray.class) })
    public Response getRichiesta( @NotNull @QueryParam("codiceRichiesta") String codiceRichiesta, @NotNull @QueryParam("codiceOperatore") String codiceOperatore, @NotNull @QueryParam("gruppoOperatore") String gruppoOperatore,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/save")
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "salvataggio richiesta", notes = "Salva la richiesta", response = SalvaRichiestaResponse.class, tags={ "save", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = SalvaRichiestaResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Qualcosa è andato storto", response = Void.class) })
    public Response saveRequest(@ApiParam(value = "" ,required=true) SalvaRichiestaRequest request,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/testPost")
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Test post", response = GenericResponse.class, tags={ "save", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = GenericResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Qualcosa è andato storto", response = Void.class) })
    public Response testPost(@ApiParam(value = "" ,required=true) TestRequest request,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
