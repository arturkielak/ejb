package com.security;

import javax.ejb.Remote;

@Remote
public interface AuthorizeService {

  public boolean authorize() throws AuthorizeException;
}

