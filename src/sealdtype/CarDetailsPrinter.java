package sealdtype;

import java.util.logging.Logger;

class CarDetailsPrinter {

    private static final Logger LOGGER = Logger.getLogger(CarDetailsPrinter.class.getName());

    void print(Car car) {
        switch (car) {
            case SportCar(String registrationNumber,
                          int power,
                          double averageCombustion,
                          int productionYear) -> aggregateInformation(registrationNumber, power, averageCombustion, productionYear);

            case FamilyVan(String registrationNumber,
                           int power,
                           double averageCombustion,
                           int productionYear) -> aggregateInformation(registrationNumber, power, averageCombustion, productionYear);

            case LuxuryCar(String registrationNumber,
                           int power,
                           double averageCombustion,
                           int productionYear) -> aggregateInformation(registrationNumber, power, averageCombustion, productionYear);
        }
    }

    void aggregateInformation(String registrationNumber,
                              int power,
                              double averageCombustion,
                              int productionYear) {

        LOGGER.info("RegistrationNumber: " + registrationNumber);
        LOGGER.info("Power: " + power);
        LOGGER.info("AverageCombustion: " + averageCombustion);
        LOGGER.info("ProductionYear: " + productionYear);
    }
}
