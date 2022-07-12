package test.impl;

import test.spi.TestServiceSPI;

public class TestProvider implements TestServiceSPI {
  public void provideTheService() {
    System.out.println("TestProvider");    }
}