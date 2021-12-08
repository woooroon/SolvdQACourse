package Medical_brigade;

public class Nurse extends Medical_brigade{
    private final String name ;
    private final short experience;
    private static int age;

    public Nurse(String name, int age, short experience){
        this.age = age;
        this.name = name;
        this.experience = experience;

    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Nurse nurse = (Nurse) obj;
        return name.equals(nurse.name);
    }
    @Override
    public void itsFromMedicalBrigade() {
        super.itsFromMedicalBrigade();
    }

}
