package sealdtype;

record FamilyVan(String registrationNumber,
                 int power,
                 double averageCombustion,
                 int productionYear) implements Car {

    @Override
    public String registrationNumber() {
        return "FAMILY:" + registrationNumber;
    }

    double acceleration() {
        return power / (power - 50.0);
    }
}
