
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
		System.out.println("ÿѧ��ѧ��Ϊ:"+s);
		int y=9000*2;
		System.out.println("һ���ѧ��Ϊ:"+y);
		int s1=9000;
	}
	public void mxueqi2() {
		int s1=9000;
		System.out.println("��һλ��ʿÿѧ��ѧ��Ϊ:"+s1);
		int y1=9000*2;
		System.out.println("��һλ��ʿ��ѧ��Ϊ:"+y1);
	}
	public void xuefei() {
			int x=10;
			int sum=1000;
			for(int i=1;i<x;i++) {		
			if(9==i) {
				sum*=i;
				System.out.println("ѧ�����ɵ�ѧ��Ϊ:"+sum);		
			}
			}
		}
	public void xuefei2() {
		int x=10;
		int sum=1000;
		for(int i=1;i<x;i++) {		
		if(9==i) {
			sum*=i;
			System.out.println("��һ��ѧ�����ɵ�ѧ��Ϊ:"+sum);	
		}
		}
	}
	public void chaxun() {
		int x=9000;
		System.out.println("ѧ�Ѳ�ѯ���Ϊ:"+x);
		int many=10000;
		System.out.println("нˮ��ѯ���Ϊ:"+many);
	}
	public void chaxun2() {
		int x1=9000;
		System.out.println("ѧ�Ѳ�ѯ���Ϊ:"+x1);
		int many1=10000;
		System.out.println("нˮ��ѯ���Ϊ:"+many1);
	}
	public void xinshui() {
		int q=10000;
		System.out.println("ÿ��нˮΪ:"+q);
		int z=q*12;
		System.out.println("ÿ��нˮΪ:"+z);
		System.out.println("Ӧ��˰���:"+(z-q)*tex);
	}
	public void xinshui2() {
		int q1=10000;
		System.out.println("ÿ��нˮΪ:"+q1);
		int z1=q1*12;
		System.out.println("ÿ��нˮΪ:"+z1);
		System.out.println("Ӧ��˰���:"+(z1-q1)*tex);
	}
}
