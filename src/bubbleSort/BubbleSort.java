package bubbleSort;

import java.util.Arrays;

public class BubbleSort {
    int [] arr;
    int length;

    public BubbleSort(int arr[]){
        this.arr = arr;
        this.length = arr.length;
        //according SOLID principles we shouldn`t do like this but in this case we can)
        sort();
    }

    public void sort() {
        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(i, i+1);
                    flag = true;
                }
            }
            length--;
        } while (flag);
        System.out.println(Arrays.toString(arr));
    }

    public void swap (int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
