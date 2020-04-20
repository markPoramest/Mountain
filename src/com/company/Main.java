package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        char[][] mountain = new char[max][sum*2+max];
        int j = 0;
        for (int a : arr) {
            boolean end = false;
            int i = max - 1;
            while (true) {

                if(end){
                    i++;
                    j++;
                    if(i==max || j == sum*2+max){
                        break;
                    }
                    mountain[i][j] = '\\';

                }
                else {
                    mountain[i][j] = '/';
                    j++;
                    i--;
                    if (i == max - a - 1 || i < 0) {
                        end = true;
                    }
                }
            }
        }

        for(int i=0;i<max;i++){
            for(int k=0;k<sum*2+max;k++){
                System.out.print(mountain[i][k]);
            }
            System.out.println();

        }
    }
}
