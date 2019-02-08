package com.test;

import javax.ejb.Remote;

@Remote
public interface TestService {

  public String test();
}
