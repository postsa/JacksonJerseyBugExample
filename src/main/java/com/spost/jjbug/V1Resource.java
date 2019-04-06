package com.spost.jjbug;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/v1")
@Produces("application/json")
public class V1Resource {

  @Inject
  private SomeService service;

  @GET
  @Path("/model1")
  public ResponseModel getModel() throws Exception {
      return service.getModel();
  }

  @GET
  @Path("/model2")
  public ResponseModel getModel2() throws Exception {
    return service.getModel2();
  }
}