import CustomLinkedList.CustomLinkedList;
import bubbleSort.BubbleSort;



public class Main {
    public static void main(String[] args) {
        int[] arr = {3,7,-23,76,4,8,-4,0,500};

        BubbleSort bubbleSort = new BubbleSort(arr);
        System.out.println("********************************");

        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(4);
        customLinkedList.add(5);
        customLinkedList.add(9);

        System.out.println("Initial customLinkedList: "+ customLinkedList.toString());
        System.out.println("Test method add(55)");
        customLinkedList.add(55);
        System.out.println("Result: "+ customLinkedList.toString());
        System.out.println("********************************");

        System.out.println("Test method add(index:1, value:8)");
        customLinkedList.add(1,8);
        System.out.println("Result: "+ customLinkedList.toString());
        System.out.println("********************************");

        System.out.println("Test method contains(value:8)");
        System.out.println(customLinkedList.contains(8));
        System.out.println("********************************");

        System.out.println("Test method get(index:0)");
        System.out.println(customLinkedList.get(0));
        System.out.println("********************************");

        System.out.println("Test method remove(index:0)");
        customLinkedList.remove(0);
        System.out.println("Result: "+ customLinkedList.toString());
        System.out.println("********************************");











    }




}
