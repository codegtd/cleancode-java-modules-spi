package test.consumer;

import test.spi.TestServiceSPI;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class Client {
  public static void main(String[] args) {

    List<TestServiceSPI> providers = new ArrayList<>();

    ServiceLoader.load(TestServiceSPI.class).forEach(providers::add);

    TestServiceSPI serviceImpl;
    if (providers.size() > 0) {
      System.out.println("ServicesProvider Found: " + providers.size());

      providers.stream().forEach(a -> System.out.println("Service: "+a.getClass()));

      serviceImpl = providers.get(providers.size() - 1);

      serviceImpl.provideTheService();
    } else System.out.println("No provider provided");

  }
}