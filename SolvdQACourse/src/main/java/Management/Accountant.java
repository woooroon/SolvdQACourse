package Management;

import java.util.Objects;



public class Accountant extends Management {
    private final String position;
    private static int age;
    public Accountant(String position, int age){
        this.position = position;
        this.age = age;
    }
    @Override
    public void itsManagementStuff() {
        super.itsManagementStuff();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Accountant acc = (Accountant) obj;
        return position.equals(acc.position);
    }
    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
    protected void doAccounting() {
        System.out.println("Accountant now is doing accounting");
    }
}
