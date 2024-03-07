package sealdtype;

record LuxuryCar(String registrationNumber,
                 int power,
                 double averageCombustion,
                 int productionYear) implements Car {

    @Override
    public String registrationNumber() {
        return "LUXURY:" + registrationNumber;
    }

    double acceleration() {
        return power / (power - 30.0);
    }
}
