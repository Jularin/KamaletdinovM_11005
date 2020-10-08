import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        array.add(33);
        array.add(10);
        array.add(15);
        array.add(7);
        for (Integer integer : array) {
            System.out.print(integer + " ");
        }

        System.out.println();
        array = mergesort(array);
        for (Integer integer : array) {
            System.out.print(integer + " ");
        }

        System.out.println();
        int find = in.nextInt();
        System.out.println(binary_search(array, find));
        int[] arr = {51, 235, 58, 92};
        int low = 0;
        int high = arr.length - 1;
        System.out.println(Arrays.toString(arr));
        quickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));

        System.out.println(strSort("acd abc")); //str sorting
    }

    static ArrayList<Integer> mergesort(ArrayList<Integer> array) {
        if (array.size() < 2){
            return array;
            }
        else{
            int pivot = array.get(0);
            ArrayList<Integer> less = new ArrayList<Integer>();
            ArrayList<Integer> greater = new ArrayList<Integer>();
            for(int i = 1; i < array.size(); i++) {
                if (array.get(i) < pivot) {
                    less.add(array.get(i));
                } else {
                    greater.add(array.get(i));
                }
            }
            less.add(pivot);
            less = mergesort(less);
            less.addAll(mergesort(greater));
            return less;
        } 
    }

    static int binary_search(ArrayList<Integer> array, int find) {
        int low = 0;
        int high = array.size() - 1;
        while (low <= high){
            int middle = (low + high) / 2;
            int guess = array.get(middle);
            if (guess == find){
                return middle;
            }
            if (guess > find){
                high = middle - 1;
            }
            else{
                low = middle + 1;
            }
        }
        return -1;
    }

    static String strSort(String string){
        String[] arr = string.split(" ");
        List<String> array  = Arrays.asList(arr);
        Collections.sort(array);
        String result = String.join(" ", array);
        return result;
    }


    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int pivot = array[middle];
        int i = low, j = high;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j){
            quickSort(array, low, j);
        }
        if (high > i) {
            quickSort(array, i, high);
        }
    }
}