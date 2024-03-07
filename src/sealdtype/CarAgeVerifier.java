package sealdtype;

import java.util.logging.Logger;

class CarAgeVerifier {

    private static final Logger LOGGER = Logger.getLogger(CarAgeVerifier.class.getName());

    void verify(Car car) {
        switch (car) {
            case SportCar sportCar when sportCar.productionYear() < 2000 ->  LOGGER.info("Old car");
            case FamilyVan familyVan when familyVan.productionYear() < 2010 -> LOGGER.info("Old car");
            case LuxuryCar luxuryCar when luxuryCar.productionYear() < 2019 -> LOGGER.info("Old car");
            default -> LOGGER.info("Unknown car type");
        }
    }
}
