import Management.MainDoctor;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;

import java.util.ArrayDeque;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        final Logger LOGGER = Logger.getLogger(Main.class);
        BasicConfigurator.configure();

        MainDoctor doctor = new MainDoctor("Alisa",23,5);
        doctor.name = "Alisa";
        doctor.age = 23;
        doctor.experience = 5;
        doctor.toString();
        ArrayList<String> drivers_of_medical_brigade = new ArrayList<String>();
        drivers_of_medical_brigade.add("Serhii");
        drivers_of_medical_brigade.add("Vasyl");
        drivers_of_medical_brigade.add("Andrii");
        ArrayDeque<String> wards = new ArrayDeque<String>();

        wards.add("3 ward");
        wards.addFirst("1 ward");
        wards.push("2 ward");
        wards.addLast("10 ward");
        wards.add("5 ward");

        LOGGER.info("Name of second driver");
        System.out.println(drivers_of_medical_brigade.get(1));
        String ward = wards.getFirst();
        System.out.println(ward);

    }
}