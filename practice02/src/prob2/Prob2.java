package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		int sum=0;
		Scanner scanner = new Scanner( System.in );
		System.out.print( "숫자를 입력하세요: " );
		
		int inputNumber = scanner.nextInt();
		
		if(inputNumber%2==0)
		{
			for(int i=2;i<=inputNumber;i=i+2)
			{	
				sum=sum+i;
			}
		}
		else
		{
			for(int i=1;i<=inputNumber;i=i+2)
			{
				sum=sum+i;
			}
				
		}

		/* 여기에 구현 코드를 작성 합니다. */
		
		System.out.println("결과 값 :"+sum);
	}

}
