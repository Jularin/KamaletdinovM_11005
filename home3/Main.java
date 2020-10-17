public class Main{
    public static void main(String[] args){
        System.out.println(numberRank(15));
        System.out.println(stringReverse("abc")); // string reverse
        int[] array = {51, 523, 71, 713};
        System.out.println(maximum(array)); // find maximum in array
        int[] secondArray = {851, 643, 523};
        int[] concatedArray = arrayConcat(array, secondArray); //concat two arrays
        for(int i = 0; i < concatedArray.length; i++){
            System.out.print(concatedArray[i] + " ");
        }
        System.out.println();

    }

    public static int numberRank(int n){
        int result = 0;
        while (n > 0){
            result += 1;
            n /= 10;
        }
        return result;
    }
    public static String stringReverse(String stringToReverse){
        String reversedString = "";
        for (int i = stringToReverse.length() - 1; i >= 0; i--){
            reversedString = reversedString + stringToReverse.charAt(i);
        }
        return reversedString;
    }
    public static int maximum(int[] array){
        int result = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }
    public static int[] arrayConcat(int[] firstArray, int[] secondArray){
        int[] result = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++){
            result[i] = firstArray[i];
        }
        for (int i = firstArray.length; i < result.length; i++){
            result[i] = secondArray[i - firstArray.length];
        }
        return result;
    }

    public static 
}


