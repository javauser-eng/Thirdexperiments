#  2020322086 郑强 计G202 
# Java-LabReport
## 一.实验目的

+1.掌握Java中抽象类和抽象方法的定义；   
+2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法  
+3.了解异常的使用方法，并在程序中根据输入情况做异常处理  


## 二.实验要求
+1.在博士研究生类中实现各个接口定义的抽象方法;  
+2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；  
+3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，  
&emsp;考虑如何用static  final修饰定义。  
+4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，  
&emsp;也可采用Scanner类实现运行时交互式输入。  
+5.根据输入情况，要在程序中做异常处理。  


## 三.实验内容  
+1.设计两个管理接口：学生管理接口和教师管理接口。  
&emsp;学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。  
+2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、  
&emsp;每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）  
+3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。    
&emsp;根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。


## 四.实验设计

1.创建了Studentjiekou类，并设置了xuefei,chaxun两个方法；
```
public interface Studentjiekou {
	public static void xuefei() {
		
	}

	public static void chaxun() {

	}
}
```
2.创建了Teacherjiekou类，并设置了xinshui,chaxun两个方法；
```
public interface Teacherjiekou {
	public static void xinshui() {

	}

	public static void chaxun() {

	}
}

```
3.创建了Doctor类,实例化了接口中的方法;
```
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
```
```
		public void chaxun() {
		int x=9000;
		System.out.println("学费查询结果为:"+x);
		int many=10000;
		System.out.println("薪水查询结果为:"+many);
	}
```
```
public void xinshui() {
		int q=10000;
		System.out.println("每月薪水为:"+q);
		int z=q*12;
		System.out.println("每年薪水为:"+z);
		System.out.println("应纳税金额:"+(z-q)*tex);
	}
```
4.创建了Test类,运用了Scanner方法,实现了输入交互；
```
System.out.println("请输入博士生姓名:");
		String nambr = scanner.next();
		System.out.println("请输入性别");
		String sex1 = scanner.next();
		System.out.println("请输入博士生年龄:");
		int age1 = scanner.nextInt();
```
5.运用try,catch方法实现了异常处理；
```
try {
			 age = scanner.nextInt();
		}catch(Exception s){
			System.out.println("检测到您的输入异常，请重新输入:");
			System.exit(1);
		}
		
```
## 五.核心方法  
1.这里实现了学生缴费；
```
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
```

2.这里实现了查询功能；
```
	public void chaxun() {
		int x=9000;
		System.out.println("学费查询结果为:"+x);
		int many=10000;
		System.out.println("薪水查询结果为:"+many);
	}
```
3.  这里计算出了纳税额；
```
public void xinshui() {
		int q=10000;
		System.out.println("每月薪水为:"+q);
		int z=q*12;
		System.out.println("每年薪水为:"+z);
		System.out.println("应纳税金额:"+(z-q)*tex);
	}
```  
4.  这里调用Doctor类中接口的方法和输出；
```
Doctor s=new Doctor();
		s.mxueqi();
		Doctor xuefei=new Doctor();
		xuefei.xuefei();				  
		Doctor xinshui=new Doctor();
		xinshui.xinshui();
		Doctor chaxun=new Doctor();
		chaxun.chaxun();
```
## 六.实验结果及流程图  
https://github.com/javauser-eng/Thirdexperiments/blob/main/%E5%AE%9E%E9%AA%8C%E8%BF%90%E8%A1%  
8C%E5%BC%82%E5%B8%B8%E5%A4%84%E7%90%86%E7%BB%93%E6%9E%9C.png  
https://github.com/javauser-eng/Thirdexperiments/blob/main/%E5%AE%9E%E9%AA%8C%  
E8%BF%90%E8%A1%8C%E5%BC%82%E5%B8%B8%E5%A4%84%E7%90%86%E7%BB%93%E6%9E%9C.png  
## 七.实验感想  
1.通过这次实验我学习了接口方法和异常处理方法；  
2.加深了对书中内容的理解；  
3.学习了Scanner类实现了简单交互；
4.加深了方法调用的运用；
5.加深了学习兴趣。
