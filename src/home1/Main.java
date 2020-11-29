package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] matrix2 = new double[5][5];
        double[][] matrix = new double[5][5];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Math.round(Math.random()*1000);
                matrix2[i][j] = Math.round(Math.random()*1000);
            }
        }
        System.out.println("First matrix:");
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second matrix");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
               matrix2[i][j] += matrix[i][j];
            }
        }
        System.out.println("Sum of this two matrix:");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        double variable;
        System.out.println(":");
        for (int i = 0; i < matrix.length; i++){
            for (int j = i; j < matrix[i].length; j++){
                variable = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = variable;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        String str = in.nextLine();
        int result = 0;
        String[] arrStr;
        HashSet<Integer> strSet = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            strSet.add(Character.hashCode(str.charAt(i)));
        }
        System.out.println(strSet.size());
        boolean flag = true;
        for(int i = 0; i < str.length(); i ++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                flag = false;
            }
        }
        if(flag){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
        double[][] matrix3 = new double[5][10];
        double[][] matrixMultiple = new double[matrix.length][matrix3[0].length];
        for(int i = 0; i < matrix3.length; i++ ){
            for(int j = 0; j < matrix3[i].length; j++){
                matrix3[i][j] = Math.round(Math.random()*1000);
                matrix3[i][j] = 5;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = 5;
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix3[0].length; j++){
                for(int k = 0; k < matrix.length; k++){
                    matrixMultiple[i][j] += matrix[i][k]*matrix3[k][i];
                }
                System.out.print(matrixMultiple[i][j] + " ");
            }
            System.out.println();
        }
        int maximum = 0;
        int iteration = 0;
        String sentience = "fkask kfkk kk";
        for(int i = 0; i < sentience.length(); i++){
            if((sentience.charAt(i) == ' ') || (i == sentience.length() - 1)){
                if (i == sentience.length() - 1){
                    iteration += 1;
                }
                if (iteration > maximum) {
                    maximum = iteration;
                }
                iteration = 0;
            }
            else {
                iteration += 1;
            }
        }
        System.out.println(maximum);
        int determinant = 0;
        int[][] matrixDeter1 = new int[2][2];
        int[][] matrixDeter2 = new int[3][3];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                matrixDeter1[i][j] = 2;
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrixDeter2[i][j] = 3;
            }
        }
        System.out.println(matrixDeter1[0][0]*matrixDeter1[1][1] - matrixDeter1[0][1]*matrixDeter1[1][0]);
        System.out.println(matrixDeter2[0][0]*matrixDeter2[1][1]*matrixDeter2[2][2]+ matrixDeter2[0][1]*matrixDeter2[0][2]*matrixDeter2[2][0] + matrixDeter2[0][2] * matrixDeter2[1][0]*matrixDeter2[2][1]-matrixDeter2[0][0]*matrixDeter2[1][2]*matrixDeter2[2][1]-matrixDeter2[0][2]*matrixDeter2[1][1]*matrixDeter2[2][0]-matrixDeter2[0][1]*matrixDeter2[1][0]*matrixDeter2[2][2]);
    }
}
