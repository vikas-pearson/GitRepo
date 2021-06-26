package Section15;

import java.util.ArrayList;

public class JavaStreams1 {
    public static void main(String[] args)
    {
        System.out.println("Hello JavaStream1");
        // Count the number of names that start with A in a List
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alekhya");
        names.add("Adam");
        names.add("Ram");

        long c=names.stream().filter(s->s.startsWith("A")).count();
        System.out.println(c);

        // print all the names of list with length greater than 4
        names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));

        // print first names from the list with length greater than 4
        names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
    }
}
