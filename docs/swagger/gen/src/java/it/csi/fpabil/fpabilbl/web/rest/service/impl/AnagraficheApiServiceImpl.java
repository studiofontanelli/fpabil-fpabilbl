package it.csi.fpabil.fpabilbl.web.rest.service.impl;

import it.csi.fpabil.fpabilbl.web.rest.service.*;
import it.csi.fpabil.fpabilbl.web.rest.dto.*;


import it.csi.fpabil.fpabilbl.web.rest.dto.ComuneArray;
import it.csi.fpabil.fpabilbl.web.rest.dto.ProvinciaArray;
import it.csi.fpabil.fpabilbl.web.rest.dto.StatoArray;
import it.csi.fpabil.fpabilbl.web.rest.dto.TipoDocumentoArray;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.SecurityContext;


public class AnagraficheApiServiceImpl implements AnagraficheApi {
      public Response getComuni(SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getComuniByProvincia(String codprovincia,SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getProvince(SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getStatiEsteri(SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getTipiDocumento(SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return Response.ok().build();
  }
}
