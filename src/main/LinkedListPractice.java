package main;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LinkedListPractice {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("1");
        //arr.remove("1");
        int index=arr.indexOf("1");

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");


        //Stack
        Stack<String> stack = new Stack<>();
        stack.push("test");

        int inde=stack.search("test");
stack.get(1).contains("");
        HashSet<String> seeet= new HashSet<>();
    StringBuilder sb= new StringBuilder();
    sb.length();

        Queue<String> q = new LinkedList<>();

        "".chars().filter(c -> c=='h').count();

        String str="";
        str.indexOf('c');
        str.toCharArray();

String.valueOf('c');
        str.substring(0,str.length());

        List<String> arrayList = new ArrayList<>(Arrays.asList("1"));
        String[] arrstr= arrayList.toArray(new String[arrayList.size()]);

        Arrays.asList(arrstr);
        String[] strarr=arrayList.toArray(new String[arrayList.size()]);

        Collections.sort(arrayList);
        arrayList.sort(String:: compareToIgnoreCase);
        Collections.sort(arrayList, Collections.reverseOrder());
        arrayList.sort(Comparator.comparing(Function.identity(), String:: compareToIgnoreCase).reversed());
        System.out.println(cars);
        new HashSet<>(arrayList).equals(new HashSet<>(arr));

       String res= arrayList.stream().collect(Collectors.joining(","));

       res.chars().filter(c->c=='g').count();
       arrayList.stream().filter(s-> s.equals("hello")).count();


    }
}
