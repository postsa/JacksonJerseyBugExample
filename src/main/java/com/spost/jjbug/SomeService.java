package com.spost.jjbug;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.inject.Inject;
import org.springframework.stereotype.Component;

@Component
public class SomeService {

  public SomeService() { }

  @Inject
  private ObjectMapper objectMapper;

  ResponseModel getModel() throws Exception{
    return new ResponseModel("hello", "filtered");
  }


  ResponseModel getModel2() throws Exception{
    objectMapper.writeValueAsString(new ResponseModel("", ""));
    return new ResponseModel("hello", "filtered");
  }

}
