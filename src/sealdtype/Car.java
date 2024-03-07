package sealdtype;

sealed interface Car permits FamilyVan, LuxuryCar, SportCar {

    String registrationNumber();
}
