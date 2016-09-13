package prob5;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        int intArray[] = new int[5];
        double sum = 0;
        System.out.println("다섯개의 숫자를 입력하세요");
        for(int i=0;i<5;i++){
        	intArray[i]=in.nextInt();
        	sum+=intArray[i];
        }
        System.out.println("평균은 "+sum/5+"입니다");
        
        
	}
	

}
