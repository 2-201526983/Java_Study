package test_1102;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex3_1 {
	Scanner scanner=new Scanner(System.in);
	ArrayList<Student> studentList=new ArrayList<Student>();
	
	public void input() {
		System.out.println("학생의 이름,학과,학번,학점의 평균을 입력하세요");
		for(int i=0; i<5; i++) {
			System.out.print(">>");
			String str=scanner.nextLine();
			StringTokenizer st=new StringTokenizer(str," ");
			String name=st.nextToken();
			String dept=st.nextToken();
			String id=st.nextToken();
			double grade=Double.parseDouble(st.nextToken());
			Student student=new Student(name, dept,id,grade);
			studentList.add(student);
		}
	}
	public void printAll() {
		for(int i=0; i<studentList.size();i++) {
			Student student=studentList.get(i);
			System.out.println(student);
		}
	}
	
	public void processQuery() {
		while(true) {
			System.out.print("학생이름 입력>>");
			String name=scanner.next();
			if(name.equals("그만")) {
				return;
			}
			
			for(int i=0; i<studentList.size();i++) {
				Student student=studentList.get(i);
				if(student.getName().equals(name)) {
					System.out.println(name+":"+student.getGrade());
					break;
				}
			}
		}
		
	}
	public void run() {
		input();
		printAll();
		processQuery();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3_1 studmanager=new Ex3_1();
		studmanager.run();
	}

}
