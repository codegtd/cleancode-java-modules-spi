
import test.impl.EnhancedTestService;
import test.impl.TestProviderFactory;
import test.impl.TestProviderTwo;
import test.spi.TestServiceSPI;

module test.impl {
  exports test.impl;
  requires test.spi;
  provides TestServiceSPI with TestProviderTwo, TestProviderFactory;
}