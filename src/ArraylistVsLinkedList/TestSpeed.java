package ArraylistVsLinkedList;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TestSpeed {
    public static void addTest (List<Integer> list){
        Date start = new Date();
        for(int i = 0; i < 100000; i++) {
            list.add(i);
        }
        Date end = new Date();
        long resultTime = end.getTime() - start.getTime();
        System.out.println("Test insert in the list of " + list.getClass());
        System.out.println("Time of work " + resultTime);
        System.out.println();
    }

    public static void addToTheMiddleTest (List<Integer> list){
        Date start = new Date();
        for(int i = 0; i < 100000; i++) {
            list.add(i,list.size() / 2);
        }
        Date end = new Date();
        long resultTime = end.getTime() - start.getTime();
        System.out.println("Test insert in the middle of "+ list.getClass());
        System.out.println("Time of work: " + resultTime);
        System.out.println();
    }

    public static void addToStartArrayList (ArrayList<Integer> list){
        Date start = new Date();
        for(int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        Date end = new Date();
        long resultTime = end.getTime() - start.getTime();
        System.out.println(list.getClass());
        System.out.println("Test insert in the start: " + resultTime);
        System.out.println();
    }

    public static void addToStartLinkedListy (LinkedList<Integer> list){
        Date start = new Date();
        for(int i = 0; i < 100000; i++) {
            list.addFirst(i);
        }
        Date end = new Date();
        long resultTime = end.getTime() - start.getTime();
        System.out.println("Test insert in the start: " + list.getClass());
        System.out.println("Time of work " + resultTime);
    }
}
