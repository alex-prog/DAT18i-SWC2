import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person implements Comparable<Person> {
    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("ddMMyyyy");
    private String name;
    private String cpr;

    public Person(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }

    public int getAge() {
        LocalDate dob = LocalDate.parse(createDOB(this.cpr), DTF);
        LocalDate now = LocalDate.now();
        int age = Period.between(dob, now).getYears();
        return age;
    }

    private String createDOB(String cpr) {
        String dob = "";
        switch (cpr.charAt(6)) {
            case '0':
            case '1':
            case '2':
            case '3':
                dob = cpr.substring(0, 4) + "19" + cpr.substring(4, 6);
                break;
            default:
                dob = cpr.substring(0, 4) + "20" + cpr.substring(4, 6);
        }


//        char epochNo = cpr.charAt(6);
//        if(epochNo <= 3){
//            dob = cpr.substring(0, 4) + "19" + cpr.substring(4, 6);
//        } else {
//            dob = cpr.substring(0, 4) + "20" + cpr.substring(4, 6);
//
//        }

        return dob;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cpr='" + cpr + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.getName());
    }
}
