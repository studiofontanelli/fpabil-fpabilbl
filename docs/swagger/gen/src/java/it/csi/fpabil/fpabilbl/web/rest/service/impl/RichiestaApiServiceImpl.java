package it.csi.fpabil.fpabilbl.web.rest.service.impl;

import it.csi.fpabil.fpabilbl.web.rest.service.*;
import it.csi.fpabil.fpabilbl.web.rest.dto.*;


import it.csi.fpabil.fpabilbl.web.rest.dto.ComuneArray;
import it.csi.fpabil.fpabilbl.web.rest.dto.GenericResponse;
import it.csi.fpabil.fpabilbl.web.rest.dto.SalvaRichiestaRequest;
import it.csi.fpabil.fpabilbl.web.rest.dto.SalvaRichiestaResponse;
import it.csi.fpabil.fpabilbl.web.rest.dto.TestRequest;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.SecurityContext;


public class RichiestaApiServiceImpl implements RichiestaApi {
      public Response getRichiesta(String codiceRichiesta,String codiceOperatore,String gruppoOperatore,SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return Response.ok().build();
  }
      public Response saveRequest(SalvaRichiestaRequest request,SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return Response.ok().build();
  }
      public Response testPost(TestRequest request,SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return Response.ok().build();
  }
}
