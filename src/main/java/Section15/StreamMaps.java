package Section15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMaps {
    public static void main(String[] args)
    {
        System.out.println("Hello StreamMaps");
        // Print names that ends with a in Uppercase
        /*
        Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
                .forEach(s->System.out.println(s));

        //Print names starting with a in sorted manner and in uppercase
        List<String> names = Arrays.asList("Azbhijeet","Don","Alekhya","Adam","Rama");
        names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
        */

        List<String> list1 = new ArrayList<String>();
        list1.add("Man");
        list1.add("Don");
        list1.add("Women");

        List<String> list2 = Arrays.asList("Azbhijeet","Don","Alekhya","Adam","Rama");

        Stream<String> newStream = Stream.concat(list1.stream(),list2.stream());
        //newStream.sorted().forEach(s->System.out.println(s));

        boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
        System.out.println(flag);

    }

    public void streamCollect()
    {
        List<String> ls = Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
                .collect(Collectors.toList());
    }
}
