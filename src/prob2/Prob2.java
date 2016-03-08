package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액: ");
		int money = scan.nextInt();
		
		System.out.println("오만 원권: "+money/50000+"매");
		System.out.println("만 원권: "+(money%50000)/10000+"매");
		System.out.println("오천 원권: "+(money%10000)/5000+"매");
		System.out.println("천 원권: "+(money%5000)/1000+"매");
		System.out.println("500원 동전: "+(money%1000)/500+"개");
		System.out.println("100원 동전: "+(money%500)/100+"개");
		System.out.println("50원 동전: "+(money%100)/50+"개");
		System.out.println("10원 동전: "+(money%50)/10+"개");
		System.out.println("1원 동전: "+(money%10)+"개");
		
		scan.close();
	}
}

