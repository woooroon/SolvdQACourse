package Doctors;

public class Therapist extends Doctors {
    @Override
    public void itsFromDoctorStuff() {
        super.itsFromDoctorStuff();
    }
    protected void AcceptThePatient() {
        System.out.println("Now doctor is doing medical review of patient");
    }
}
