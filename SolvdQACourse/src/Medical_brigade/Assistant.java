package Medical_brigade;

public class Assistant extends Medical_brigade{
    private final String name;
    private static int age;

    public Assistant(int age, String name){
        this.age = age;
        this.name = name;

    }
    @Override
    public void itsFromMedicalBrigade() {
        super.itsFromMedicalBrigade();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Assistant assistant = (Assistant) obj;
        return name.equals(assistant.name);
    }
}
