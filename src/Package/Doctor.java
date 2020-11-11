
package Package;

import java.util.Scanner;


class Doctor implements Studentjiekou, Teacherjiekou {
	String Name;
	String Sex;
	String Age;
	String xuefei;
	String xinshui;	
	final double tex=0.03;
	public void mxueqi() {
		int s=9000;
		System.out.println("每学期学费为:"+s);
		int y=9000*2;
		System.out.println("一年的学费为:"+y);
		int s1=9000;
	}
	public void mxueqi2() {
		int s1=9000;
		System.out.println("另一位博士每学期学费为:"+s1);
		int y1=9000*2;
		System.out.println("另一位博士的学费为:"+y1);
	}
	public void xuefei() {
			int x=10;
			int sum=1000;
			for(int i=1;i<x;i++) {		
			if(9==i) {
				sum*=i;
				System.out.println("学生缴纳的学费为:"+sum);		
			}
			}
		}
	public void xuefei2() {
		int x=10;
		int sum=1000;
		for(int i=1;i<x;i++) {		
		if(9==i) {
			sum*=i;
			System.out.println("另一名学生缴纳的学费为:"+sum);	
		}
		}
	}
	public void chaxun() {
		int x=9000;
		System.out.println("学费查询结果为:"+x);
		int many=10000;
		System.out.println("薪水查询结果为:"+many);
	}
	public void chaxun2() {
		int x1=9000;
		System.out.println("学费查询结果为:"+x1);
		int many1=10000;
		System.out.println("薪水查询结果为:"+many1);
	}
	public void xinshui() {
		int q=10000;
		System.out.println("每月薪水为:"+q);
		int z=q*12;
		System.out.println("每年薪水为:"+z);
		System.out.println("应纳税金额:"+(z-q)*tex);
	}
	public void xinshui2() {
		int q1=10000;
		System.out.println("每月薪水为:"+q1);
		int z1=q1*12;
		System.out.println("每年薪水为:"+z1);
		System.out.println("应纳税金额:"+(z1-q1)*tex);
	}
}
