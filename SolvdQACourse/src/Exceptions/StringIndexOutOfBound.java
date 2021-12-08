package Exceptions;

public class StringIndexOutOfBound {
    public void stringIndexOutOfBound() {
        try {
            String a = "This is probably therapist! "; // length is 28
            char c = a.charAt(30); // accessing 31th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
