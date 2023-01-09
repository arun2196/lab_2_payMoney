package com.gl.lab_2_paymoney;
import java.util.Scanner;
public class TargetDeterminatorTest {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of transaction array\n ");

        n=sc.nextInt();
        int dailyTarget;
        int[] transactions = new int[n];
        System.out.println("enter the values of array\n ");
        for(int i=0; i<n; i++)
        {
            transactions[i]=sc.nextInt();
        }
        System.out.println("Enter the target that needs to be achieved");
        dailyTarget = sc.nextInt();

        TargetDeterminator determinator = new TargetDeterminator(transactions, dailyTarget);
        determinator.determine();
    }
}
