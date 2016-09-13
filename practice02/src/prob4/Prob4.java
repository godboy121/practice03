package prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		/* 구현코드 */
		int value;
		Scanner abc=new Scanner(System.in);
		System.out.print("금액: ");
		value=abc.nextInt();
		
		int one=value/50000;
		value=value%50000;
		int two=value/10000;
		value=value%10000;
		int three=value/5000;
		value=value%5000;
		int four=value/1000;
		value=value%1000;
		int five=value/500;
		value=value%500;
		int six=value/100;
		value=value%100;
		int seven=value/50;
		value=value%50;
		int eight=value/10;
		value=value%10;
		int nine=value/5;
		value=value%5;
		int ten=value/1;
		
		System.out.println("50000원: "+one+"개");
		System.out.println("10000원: "+two+"개");
		System.out.println("5000원: "+three+"개");
		System.out.println("1000원: "+four+"개");
		System.out.println("500원: "+five+"개");
		System.out.println("100원: "+six+"개");
		System.out.println("50원: "+seven+"개");
		System.out.println("10원: "+eight+"개");
		System.out.println("5원: "+nine+"개");
		System.out.println("1원: "+ten+"개");
		
		
		
	}
}

