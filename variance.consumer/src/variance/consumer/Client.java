/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 10: Services in Modular Application
Topic:  Service Extras
*/

package variance.consumer;

import variance.spi.MyService1SPI;
import variance.spi.MyService2SPI;

import java.util.ServiceLoader;

public class Client {
    public static void main(String[] args) {

        MyService2SPI s1 = ServiceLoader.load(MyService2SPI.class)
                                        .findFirst()
                                        .get();

        MyService1SPI s2 = ServiceLoader.load(MyService1SPI.class)
                                        .findFirst()
                                        .get();

        s1.doSomething();
        s2.doSomething();
    }
}