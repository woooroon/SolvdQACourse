package Medical_brigade;

public class Driver extends Medical_brigade{
    private final String name;
    private static int age;
    private final boolean ValidDriverLicense;
    private final short experience;


    public Driver(String name, int age, boolean ValidDriverLicense, short experience){
        this.name = name;
        this.age = age;
        this.ValidDriverLicense = ValidDriverLicense;
        this.experience = experience;

    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Driver driver = (Driver) obj;
        return name.equals(driver.name);
    }
    @Override
    public void itsFromMedicalBrigade() {
        super.itsFromMedicalBrigade();
    }

}
