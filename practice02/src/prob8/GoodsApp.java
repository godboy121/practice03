package prob8;

import java.util.Scanner;

public class GoodsApp {
	String name;
	int price;
	int StockNum;

	

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		GoodsApp a=new GoodsApp();
		GoodsApp b=new GoodsApp();
		GoodsApp c=new GoodsApp();
		System.out.println("실행결과: ");
		a.name=abc.next();
		a.price=abc.nextInt();
		a.StockNum=abc.nextInt();
		b.name=abc.next();
		b.price=abc.nextInt();
		b.StockNum=abc.nextInt();
		c.name=abc.next();
		c.price=abc.nextInt();
		c.StockNum=abc.nextInt();
	
		System.out.println(a.name+"(가격:"+a.price+"원)이 "+a.StockNum+"개 입고 되었습니다.");
		System.out.println(b.name+"(가격:"+b.price+"원)이 "+b.StockNum+"개 입고 되었습니다.");
		System.out.println(c.name+"(가격:"+c.price+"원)이 "+c.StockNum+"개 입고 되었습니다.");
		
		
		
		
	}

}
