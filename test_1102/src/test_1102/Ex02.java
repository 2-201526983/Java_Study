package test_1102;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Ex02 {
	
	public static void print(Vector<Integer> v) {
		int sum=0;
		//Iterator<Integer> it=v.iterator();
		for(int i=0; i<v.size();i++) {
			int n=v.get(i);
			System.out.println(n);
			sum+=n;
		}
		System.out.println("현재 강수량 평균:"+ sum/v.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Vector<Integer> v=new Vector<Integer>();
		while(true) {
			System.out.print("강수량 입력(0 입력시 종료)>>");
			int n=scanner.nextInt();
			if(n==0)break;
			v.add(n);
			print(v);
		}
		scanner.close();

	}

}
