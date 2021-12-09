package Doctors;

public class Surgeon extends Doctors{
    @Override
    public void itsFromDoctorStuff() {
        super.itsFromDoctorStuff();
    }
    protected void surgeryOperation() {
        System.out.println("Now doctor is doing surgery operation");
    }
}
