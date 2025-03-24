package designpatterns.creational.prototype;

import designpatterns.creational.prototype.LicenseForm;

public class MainWithPrototype {
    public static void main(String[] args) {

        // "Şablon" formamızı yaradaraq deyək ki, müəyyən default konfiqurasiya veririk:
        LicenseForm baseForm = new LicenseForm("Default Name", "Default Model", "XX-XX-000");

        // Klon vasitəsilə yeni formalar yaradıb, yalnız fərqli sahələri dəyişirik:
        LicenseForm form1 = (LicenseForm) baseForm.clone();
        form1.setOwnerName("Ali");
        form1.setCarModel("Toyota");
        form1.setPlateNumber("90-AA-123");

        LicenseForm form2 = (LicenseForm) baseForm.clone();
        form2.setOwnerName("Veli");
        form2.setCarModel("Hyundai");
        form2.setPlateNumber("10-BB-456");

        System.out.println(form1);
        System.out.println(form2);
    }
    }