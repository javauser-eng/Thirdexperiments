package Package;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int age = 0;
	
		System.out.println("�����벩ʿ������:");
		String name = scanner.nextLine();
		System.out.println("�������Ա�");
		String sex = scanner.nextLine();
		System.out.println("�����벩ʿ������:");
		try {
			 age = scanner.nextInt();
		}catch(Exception s){
			System.out.println("��⵽���������쳣������������:");
			System.exit(1);
		}
		
		System.out.println("--------------------------------------");
		System.out.println("��ʿ������:"+name+" ��ʿ���Ա�:"+sex+"��ʿ������:"+age);
		System.out.println("----------------��һ��ʿ��-------------------");
		System.out.println("�����벩ʿ������:");
		String nambr = scanner.next();
		System.out.println("�������Ա�");
		String sex1 = scanner.next();
		System.out.println("�����벩ʿ������:");
		int age1 = scanner.nextInt();
		System.out.println("--------------------------------------");
		System.out.println("��ʿ������:"+nambr+" ��ʿ���Ա�:"+sex1+"��ʿ������:"+age1);
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