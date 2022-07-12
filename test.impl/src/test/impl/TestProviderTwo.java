package test.impl;


public class TestProviderTwo implements EnhancedTestService {

  public TestProviderTwo() {
    System.out.println("TestProviderTwo constructor");    }

  public void provideTheService() {
    System.out.println("TestProviderTwo");
  }
}