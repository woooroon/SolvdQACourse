import Management.MainDoctor;

public class Main {
    public static void main(String[] args) {
        MainDoctor doctor = new MainDoctor("Alisa",23,5);
        doctor.name = "Alisa";
        doctor.age = 23;
        doctor.experience = 5;
        doctor.toString();
    }
}