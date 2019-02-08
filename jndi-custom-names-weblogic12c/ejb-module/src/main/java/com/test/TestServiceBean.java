package com.test;

import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

@Stateless
public class TestServiceBean implements TestService {

  private static Logger logger;

  @PostConstruct
  void init() {
    logger = Logger.getLogger("test");
  }

  @Override
  public String test() {
    logger.info("test");
    return "test";
  }
}
