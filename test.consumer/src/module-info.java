import test.spi.TestServiceSPI;

module test.consumer {
  requires test.spi;
  uses TestServiceSPI;
}