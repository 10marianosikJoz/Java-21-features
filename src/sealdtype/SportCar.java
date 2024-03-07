package sealdtype;

record SportCar(String registrationNumber,
                int power,
                double averageCombustion,
                int productionYear) implements Car {

    @Override
    public String registrationNumber() {
        return "SPORT:" + registrationNumber;
    }

    double acceleration() {
        return power / (power - 10.0);
    }
}
