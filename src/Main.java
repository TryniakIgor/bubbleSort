import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,7,23,76,4,8,};
        bubbleSort(arr);
//        for (int item: arr) {
//            System.out.println(item);
//        }

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        addTest(arrayList);
        addTest(linkedList);

        addToTheMiddleTest(arrayList);
        addToTheMiddleTest(linkedList);

        arrayList.clear();
        linkedList.clear();

        addToStartArrayList((ArrayList<Integer>) arrayList);
        addToStartLinkedListy((LinkedList<Integer>) linkedList);
    }

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

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
