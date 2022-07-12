/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 10: Services in Modular Application
Topic:  Service Extras
*/

package variance.impl;

import variance.spi.MyService1SPI;
import variance.spi.MyService2SPI;

public class SameServiceImpl implements MyService1SPI, MyService2SPI {

    public void doSomething() {
        System.out.println("MyServiceImpl is Doing Something");
    }
}