import variance.impl.SameServiceImpl;
import variance.spi.MyService1SPI;
import variance.spi.MyService2SPI;

module variance.impl {
    requires variance.spi;
    provides MyService1SPI with SameServiceImpl;
    provides MyService2SPI with SameServiceImpl;
}