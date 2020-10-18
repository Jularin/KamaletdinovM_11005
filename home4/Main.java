public class Main{
    public static void main(String[] args){
        System.out.println("First problem");
        System.out.println(multipleRecursion(3));
        System.out.println("Second problem");
        outAll(2, 5);
        System.out.println("Third problem");
        System.out.println(fibo(10));
        System.out.println("Fourth problem");
        System.out.println(acerman(1, 0));
    }

    public static int multipleRecursion(int n){ // multiple nums from 1 to n
        if(n == 1)
            return 1;
        else
            return n * multipleRecursion(n - 1);
    }

    public static void outAll(int a, int b){ // otput all integer nums from a to b
        System.out.println(a);
        if (a != b){
            outAll(a+1, b);
        }
    }

    public static int fibo(int n){
        if (n < 2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    public static int acerman(int m, int n){
        if (m == 0){
            return n + 1;
        }
        else{
            if ((m > 0) && (n == 0)){
                return acerman(m - 1, 1);
            }
            else{
                if ((m > 0) && (n > 0)){
                    return acerman(m - 1, acerman(m, n -1));
                }
            }
        }
        return -1;
    }
}