package Doctors;

public class Proctologist extends Doctors {
    @Override
    public void itsFromDoctorStuff() {
        super.itsFromDoctorStuff();
    }
    protected void doReview() {
        System.out.println("Now doctor is doing medical review");
    }
}
