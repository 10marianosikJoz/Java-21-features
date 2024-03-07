package sealdtype;

class CombustionCalculator {

    double calculate(Car car) {
        return switch (car) {
            case SportCar sportCar -> sportCar.power() * sportCar.averageCombustion() / 200;
            case FamilyVan familyVan -> familyVan.power() * familyVan.averageCombustion() / 1000;
            case LuxuryCar luxuryCar -> luxuryCar.power() * luxuryCar.acceleration() / 500;
        };
    }
}
