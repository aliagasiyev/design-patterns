package designpatterns.creational.prototype;

class LicenseFormWithoutPrototype {
    private String ownerName;
    private String carModel;
    private String plateNumber;

    public LicenseFormWithoutPrototype(String ownerName, String carModel, String plateNumber) {
        this.ownerName = ownerName;
        this.carModel = carModel;
        this.plateNumber = plateNumber;
    }

    @Override
    public String toString() {
        return "LicenseForm{" +
                "ownerName='" + ownerName + '\'' +
                ", carModel='" + carModel + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                '}';
    }
}