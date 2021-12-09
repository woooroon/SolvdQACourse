package Exceptions;

public class WrongFormat {
    public void wrongFormat() {
        try {
            int num = Integer.parseInt ("Doctor") ;

            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }
}
