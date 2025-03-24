package designpatterns.creational.prototype;

// Form sinfi
class LicenseForm implements Prototype {
    private String ownerName;
    private String carModel;
    private String plateNumber;

    public LicenseForm(String ownerName, String carModel, String plateNumber) {
        this.ownerName = ownerName;
        this.carModel = carModel;
        this.plateNumber = plateNumber;
    }

    // Klonlama metodumuz
    @Override
    public Prototype clone() {
        try {
            return (LicenseForm) super.clone();
        } catch (CloneNotSupportedException e) {
            // real layihədə müvafiq istisnanı atmaq
            return null;
        }
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setPlateNumber(String plateNumber) {
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