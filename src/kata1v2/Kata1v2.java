package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1v2 {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1994,12,21);
        Person person = new Person("Benjamín", "Medina", "Cabrera", date);
        System.out.println(person.getName() + " " + person.getSurname1() + " " + person.getSurname2() + " tiene " + person.getAge() + " años.");
    }
}
