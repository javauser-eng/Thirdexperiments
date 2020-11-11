package Package;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int age = 0;
	
		System.out.println("请输入博士生姓名:");
		String name = scanner.nextLine();
		System.out.println("请输入性别");
		String sex = scanner.nextLine();
		System.out.println("请输入博士生年龄:");
		try {
			 age = scanner.nextInt();
		}catch(Exception s){
			System.out.println("检测到您的输入异常，请重新输入:");
			System.exit(1);
		}
		
		System.out.println("--------------------------------------");
		System.out.println("博士生姓名:"+name+" 博士生性别:"+sex+"博士生年龄:"+age);
		System.out.println("----------------另一博士生-------------------");
		System.out.println("请输入博士生姓名:");
		String nambr = scanner.next();
		System.out.println("请输入性别");
		String sex1 = scanner.next();
		System.out.println("请输入博士生年龄:");
		int age1 = scanner.nextInt();
		System.out.println("--------------------------------------");
		System.out.println("博士生姓名:"+nambr+" 博士生性别:"+sex1+"博士生年龄:"+age1);
		Doctor s=new Doctor();
		s.mxueqi();
		Doctor xuefei=new Doctor();
		xuefei.xuefei();				  
		Doctor xinshui=new Doctor();
		xinshui.xinshui();
		Doctor chaxun=new Doctor();
		chaxun.chaxun();
		Doctor s2=new Doctor();
		s2.mxueqi2();
		Doctor xuefei2=new Doctor();
		xuefei2.xuefei2();				  
		Doctor xinshui2=new Doctor();
		xinshui2.xinshui2();
		Doctor chaxun2=new Doctor();
		chaxun2.chaxun2();
	}
}