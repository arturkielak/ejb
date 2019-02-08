package com.ejb;

import com.test.TestService;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {

  public static void main(String[] args) throws NamingException {
    Context ctx = new InitialContext();
    TestService testService = (TestService) ctx.lookup("TestService");
    System.out.println(testService.test() + " success.");
    ctx.close();
  }
}
