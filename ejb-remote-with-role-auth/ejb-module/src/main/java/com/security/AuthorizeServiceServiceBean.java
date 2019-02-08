package com.security;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

@Stateless
public class AuthorizeServiceServiceBean implements AuthorizeService {

  @Resource
  private SessionContext ctx;

  @Override
  public boolean authorize() throws AuthorizeException {
    //Principal principal = ctx.getCallerPrincipal();
    if (!ctx.isCallerInRole("gore2s")) {
      throw new AuthorizeException();
    }
    return true;
  }
}

