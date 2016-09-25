package hw;
/*
 * Topic: 
 * Date: 2016/09/19
 * Author: 105021059  王俊鑌
 *請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，
 *每一個值都取四捨五入後輸出這 6 個數中的最小值
 */
 import java.util.Scanner;
public class hw03_105021059 {
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println(/*請輸入六個數字:*/);
		float a = scn.nextFloat();
		float b = scn.nextFloat();
		float c = scn.nextFloat();
		float d = scn.nextFloat();
		float e = scn.nextFloat();
		float f = scn.nextFloat();
		Math.round(a);
		Math.round(b);
		Math.round(c);
		Math.round(d);
		Math.round(e);
		Math.round(f);
		System.out.println(Math.round(a)+" "+ Math.round(b)+" "+ Math.round(c)+" "+ Math.round(d)+" "+ Math.round(e)+" "+ Math.round(f));
		System.out.println("最小值是:" + Math.min(( Math.min( Math.min(a,b),(Math.min(c,d)))),(Math.min(e,f))));  
		
	      

	}

}
