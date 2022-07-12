import variance.spi.MyService1SPI;
import variance.spi.MyService2SPI;

module variance.consumer {
    requires variance.spi;
    uses MyService1SPI;
    uses MyService2SPI;
}