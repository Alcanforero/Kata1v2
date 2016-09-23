package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final String surname1;
    private final String surname2;
    private final Calendar birthdate;
    private static final long MILLISECONDS_PER_YEAR = (long)(1000*60*60*24*365.25);

    public Person(String name, String surname1, String surname2, Calendar birthdate) {
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getSurname1() {
        return surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }
    
    public int getAge() {
        Calendar today = GregorianCalendar.getInstance();
        return (int)milliSecondsToYear(today.getTimeInMillis()-birthdate.getTimeInMillis());
    }
    private long milliSecondsToYear(long milles) {
        return milles/MILLISECONDS_PER_YEAR;
    }
}
