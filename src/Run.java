import java.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Run {

    public static void main(String[] args) {

//        Car c = new Car("BMW", 380.0, 2);
//        System.out.println(c.toString());

        // int null =7;

        Person p1 = new Person("Theo", "2807991234");
        Person p2 = new Person("Kryst", "0601271234");
        Person p3 = new Person("Bob", "0203741234");
        Person p4 = new Person("Alice", "1003941234");
        Person p5 = new Person("Alice2", "1003055234");

//        System.out.println(p5.getAge());

//        int oct = 007;
//        int dec = 7;
//        int bin = 0b111;
//        int hex = 0x007;
//
//
//
//        byte i = 2;
//        while (i>0){
//            System.out.println("Hello Dat18i " + i);
//            i++;
//        }
//        System.out.println(i);

//        byte b1 = 5;
//        byte b2 = 127;
//        byte b3 = (byte) (b1 + b2);
//        System.out.println(b3);

        /*
        int b1 = -5;
        int b2 = Integer.MIN_VALUE;
        int b3 = b1 + b2;
        System.out.println(b3);
        */
/*
        double d = .1;
        System.out.println(d); //0.10
        d += 0.1;
        System.out.println(d); //0.20
        d += 0.1;
        System.out.println(d); //0.30
        d += 0.1;
        System.out.println(d); //0.40
        d += 0.1;
        System.out.println(d); //0.50
        d += 0.1;
        System.out.println(d);
        d += 0.1;
        System.out.println(d);
        d += 0.1;
        System.out.println(d);
        d += 0.1;
        System.out.println(d);
        d += 0.1;
        System.out.println(d);
        d += 0.1;
        System.out.println(d);
        d += 0.1;
        System.out.println(d);
        */

//        double dd1 = 0.1;
//        double dd2 = 0.2;
//        double dd3 = (dd1 * 1000000 + dd2 * 1000000) / 100000;
//        System.out.println(dd3);
//
//        MyDouble d1 = new MyDouble(0, 1);
//        MyDouble d2 = new MyDouble(0, 2);
//        MyDouble d3 = d1+d2;


//        int[] numbers = new int[40];
//        numbers[1] = 5;
//        numbers[0] = 2;
//        numbers[2] = 4;
//        numbers[3] = 6;
//
//        Person[][] b = new Person[1][2];
//
//        System.out.println(b[0][0]);
//        System.out.println(numbers[0]);
//        int sum = 0;
//        for(int i=0; i < numbers.length; i++){
//            sum += numbers[i];
//        }
//        System.out.println(sum);


//        MyArrayList<Integer> num = new MyArrayList<>();
//        MyArrayList<String> colors = new MyArrayList<>();
//        colors.add("red");
//        colors.add("blue");
//        colors.add("green");
//        colors.add("pink");
//        System.out.println(colors.size());
//        System.out.println(colors.get(19));

//        System.out.println(true || false);
//        System.out.println(true | false);
//        System.out.println(10 ^ 3);
//        System.out.println(7 || 3);

//        ArrayList<ArrayList<Integer>> grades = new ArrayList<>();
//        ArrayList<Integer> alicesGrades = new ArrayList<>();
//        alicesGrades.add(12);
//        alicesGrades.add(10);
//        grades.add(alicesGrades);
//        ArrayList<Integer> bobsGrades = new ArrayList<>();
//        bobsGrades.add(7);
//        grades.add(bobsGrades);
////        ArrayList<Integer> charsGrades = new ArrayList<>();
////        grades.add(charsGrades);
//
//        for (ArrayList<Integer> r : grades) {
//            String line  ="name: ";
//            for (Integer g: r) {
//                line += g+", ";
//            }
//            System.out.println(line.substring(0, line.lastIndexOf(',')));
//        }
//
//
//        System.out.println(grades);
//
//        grades.forEach((R)->{
//            System.out.print("name: ");
//            R.forEach((G)->{
//                System.out.print(G+" ");
//            });
//            System.out.println();
//        });

//        TreeSet<Integer> nu = new TreeSet<>();
//        nu.add(8);
//        nu.add(2);
//        nu.add(3);
//        nu.add(3);
//        nu.add(5);
//        System.out.println(nu);

        TreeSet<Person> ps = new TreeSet<>();
        ps.add(p1);
        ps.add(p2);
        System.out.println(ps.size());
        System.out.println(ps);

    }
}
