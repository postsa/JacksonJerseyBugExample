package com.spost.jjbug;

import javax.annotation.security.DenyAll;

public class ResponseModel {
  public String response;
  public String sensitive;

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  @DenyAll
  public String getSensitive() {
    return sensitive;
  }

  public void setSensitive(String sensitive) {
    this.sensitive = sensitive;
  }

  public ResponseModel(String response, String sensitive) {
    this.response = response;
    this.sensitive = sensitive;
  }
}
