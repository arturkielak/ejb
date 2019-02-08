package com.ejb;

import com.security.AuthorizeException;
import com.security.AuthorizeService;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {

  public static void main(String[] args) throws NamingException, AuthorizeException {
    Properties properties = new Properties();
    properties.setProperty(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
    properties.setProperty(Context.PROVIDER_URL, "t3://127.0.0.1:7001");
    properties.setProperty(Context.SECURITY_PRINCIPAL, "gore2s");
    properties.setProperty(Context.SECURITY_CREDENTIALS, "gore2s+++");

    Context ctx = new InitialContext(properties);
    AuthorizeService authorizeService = (AuthorizeService) ctx.lookup("security#com.security.AuthorizeService");
    authorizeService.authorize();
    System.out.println("Authorize success");
    ctx.close();
  }
}
