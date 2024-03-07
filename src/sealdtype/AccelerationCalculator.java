package sealdtype;

class AccelerationCalculator {

    double calculate(Car car) {
       return switch (car) {
            case SportCar sportCar -> sportCar.acceleration();
            case FamilyVan familyVan -> familyVan.acceleration();
            case LuxuryCar luxuryCar -> luxuryCar.acceleration();
        };
    }
}
