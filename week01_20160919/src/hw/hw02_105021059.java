package hw;
/*
 * Topic: 
 * Date: 2016/09/19
 * Author: 105021059  王俊鑌
 *2. 請寫一個程式讓使用者輸入 n 並產生 6 個
 *介於 1~n 之間的亂數 (輸出的亂數可重覆)
 */
import java.util.Random;
import java.util.Scanner;
public class hw02_105021059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran =new Random();
		Scanner scn =new Scanner(System.in);
		 System.out.println("請輸入數字:");
		int n = scn.nextInt();
		int a = ran.nextInt(n)+1;
		int b = ran.nextInt(n)+1;
		int c = ran.nextInt(n)+1;
		int d = ran.nextInt(n)+1;
		int e = ran.nextInt(n)+1;
		int f = ran.nextInt(n)+1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		
		
		
		
		
	}

}
