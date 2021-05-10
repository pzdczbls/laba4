package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input number");
        int n = in.nextInt();
        double sum = 0;
        double s = 0;
        for(int i=0; i<=n; i++){
            for(int j=0;j<=i; j++){
                sum= sum + Math.sin(j);
                s = 1 / sum;
            }
        }
        System.out.println(s);
	}
}
