package it.csi.fpabil.fpabilbl.web.rest.service.impl;

import it.csi.fpabil.fpabilbl.web.rest.service.*;
import it.csi.fpabil.fpabilbl.web.rest.dto.*;


import it.csi.fpabil.fpabilbl.web.rest.dto.GenericResponse;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.SecurityContext;


public class TestApiServiceImpl implements TestApi {
      public Response testResources(SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return Response.ok().build();
  }
}
