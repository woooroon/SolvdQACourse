package Management;
public class MainDoctor extends Management{
    private final String name;
    private static int age;
    private final short experience;
    @Override
    public void itsManagementStuff() {
        super.itsManagementStuff();
    }
    public MainDoctor(String name, int age, short experience){
        this.name = name;
        this.age = age;
        this.experience = experience;

    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MainDoctor doctor = (MainDoctor) obj;
        return name.equals(doctor.name);
    }
    @Override
    public String toString() {
        return "name ='" + name + '\''
                + ", age = " + age
                + ", experience = " + experience;
    }


}
