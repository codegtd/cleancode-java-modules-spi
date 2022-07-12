/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 10: Services in Modular Application
Topic:  Service extras
*/

package test.impl;

import test.spi.TestServiceSPI;

import java.util.Random;

public class TestProviderFactory                         {

    public static TestServiceSPI provider() {
        System.out.println("TestProviderFactory method being executed");

        int choice = new Random().nextInt(2);

        if (choice == 1) return new TestProvider();
        return new TestProviderTwo();
    }
}