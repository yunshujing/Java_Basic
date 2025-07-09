import java.util.Scanner;
class less02_2
{
	
	//6 角谷猜想
  /* public static void main(String[] args)
   {
   	   int tmp=0;
   	   for (int n=3; n<=10000; n++) {
   	    	tmp=n;
   	    	while(tmp!=1)
   	    	{
   	    	   if(tmp%2==1)
   	    	      tmp=tmp*3+1;
   	    	   else
   	    	      tmp=tmp/2;		
   	    	}
   	    	System.out.println(n+"符合角谷猜想！");
   	   }
   }*/

   //7 掷骰子
  /* public static void main(String[] args)
   {   
   	//  方法一
   	   int r1=0,r2=0;
   	   int sum=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0,sum9=0,sum10=0,sum11=0,sum12=0;
   	   
   	   for (int n=0; n<3600; n++) {
   	    	r1=(int)(Math.random()*6+1);  //random() 方法可返回介于 0（包含） ~ 1（不包含） 之间的一个随机数。
   	    	r2=(int)(Math.random()*6+1);
   	    	sum=r1+r2;
   	    	
   	    	switch(sum)
   	    	{
   	    		case 2:sum2++;break;
   	    		case 3:sum3++;break;
   	    		case 4:sum4++;break;
   	    		case 5:sum5++;break;
   	    		case 6:sum6++;break;
   	    		case 7:sum7++;break;	
   	    		case 8:sum8++;break;
   	    		case 9:sum9++;break;
   	    		case 10:sum10++;break;	
   	    		case 11:sum11++;break;
   	    		case 12:sum12++;break;		
   	    	}	
   	   }
   	   System.out.println("和为2的次数："+sum2);
   	   System.out.println("和为3的次数："+sum3);
   	   System.out.println("和为4的次数："+sum4);
   	   System.out.println("和为5的次数："+sum5);
   	   System.out.println("和为6的次数："+sum6);
   	   System.out.println("和为7的次数："+sum7);
   	   System.out.println("和为8的次数："+sum8);
   	   System.out.println("和为9的次数："+sum9);
   	   System.out.println("和为10的次数："+sum10);
   	   System.out.println("和为11的次数："+sum11);
   	   System.out.println("和为12的次数："+sum12);
   	         
   	
   	//方法2
   	   int r1=0,r2=0,sum=0;
   	   int[] res=new int[13];
   	   
   	   for (int n=0; n<3600; n++) {
   	    	r1=(int)(Math.random()*6+1);
   	    	r2=(int)(Math.random()*6+1);
   	    	sum=r1+r2;
   	    	res[sum]++;
   	    	
   	   }
   	   for(int n=2;n<=12;n++)
   	   {
   	   	System.out.println("和为 "+n+" 的次数："+res[n]);
   	   }
   }
   */
   
   //8 读取星号数
   
   //定义一个打印n个星号的方法
 public class Tx {
  static void pStar(int n)
   {
   	  for (int i=0; i<n; i++) {
   	   	System.out.print("*");
   	  }
   	
   }
   //定义一个打印n个空格的方法
   static void pSpace(int n)
   {
   	  for (int i=0; i<n; i++) {
   	   	System.out.print(" ");
   	  }
   	
   }
   //定义一个换行的方法
   static void pEnter()
   {
   	   	System.out.println();   	
   }
  } 

package cn.itcast.chapter03;
import java.util.Scanner;
public class Example02 {
public static void main(String[] args)
   {
   	 Scanner sc=new Scanner(System.in);
   	 System.out.print("请输入星号数：");
   	 int n=sc.nextInt();
   	  
   	  //图形1
   	  /*for(int i=1;i<=n;i++)
   	  {
   	     Tx.pSpace(n-i);
   	     Tx.pStar(i);
   	     Tx.pEnter();	
   	  }*/
   	  
   	   //图形2
   	 /* for(int i=1;i<=n;i++)
   	  {
   	      Tx.pStar(i);
   	      Tx.pEnter();	
   	  }
   	  for(int i=n-1;i>=1;i--)
   	  {
   	  	Tx.pStar(i);
   	  	Tx.pEnter();
   	  }*/
   	  //图形3
   	 /*  for(int i=1;i<=n;i++)
   	  {
   	  	Tx.pStar(i);
   	        Tx.pEnter();	
   	  }
   	  for(int i=1;i<n;i++)
   	  {
   	  	Tx.pSpace(i);
   	  	Tx.pStar(n-i);
   	  	Tx.pEnter();
   	  }*/
   	  //图形4
   	/*  for(int i=0;i<=(n-1)/2;i++)
   	  {
   	  	Tx.pSpace((n-1)/2-i);
   	  	Tx.pStar(i*2+1);
   	  	Tx.pEnter();
   	  }
   	*/
   	//图形5
   	 /* for(int i=0;i<=(n-1)/2;i++)
   	  {
   	  	Tx.pSpace((n-1)/2-i);
   	  	Tx.pStar(i*2+1);
   	  	Tx.pEnter();
   	  }
   	  for(int i=1;i<=(n-1)/2;i++)
   	  {
   	  	Tx.pSpace(i);
   	  	Tx.pStar(n-i*2);
   	  	Tx.pEnter();
   	  }*/
   	  
   	  // 9 读取一个矩形长度
   	  
   	  
   	  /*	Tx.pStar(n);
   	  	Tx.pEnter();
   	  	for(int i=0;i<n-2;i++)
   	  	{
   	  		Tx.pStar(1);
   	  		Tx.pSpace(n-2);
   	  		Tx.pStar(1);
   	  		Tx.pEnter();
   	  	}
   	  	Tx.pStar(n);
   	  */
	  //10 题 读取矩形内外边长
	    Scanner sc=new Scanner(System.in);
   	    System.out.print("请输入外边长：");
   	    int n=sc.nextInt();
		System.out.print("请输入内边长：");
   	    int m=sc.nextInt();
		
		for(int i=0;i<=((n-m)/2);i++)
		{
			Tx.pStar(n);
			Tx.pEnter();
		}
		
		for(int i=0;i<m;i++)
		{
			Tx.pStar((n-m)/2);
			Tx.pSpace(m);
			Tx.pStar((n-m)/2);
			Tx.pEnter();	
		}
		
		
		for(int i=0;i<=((n-m)/2);i++)
		{
			Tx.pStar(n);
			Tx.pEnter();
		}
		
	  
   	}
   
   
  
}

通过new Scanner(System.in)创建一个Scanner，控制台会一直等待输入，直到敲回车键结束，把所输入的内容传给Scanner，作为扫描对象。
要获取输入的内容，则只需要调用Scanner的nextLine()方法
举例：
public class TestScanner { 
public static void main(String[] args) { //定义main方法
Scanner s = new Scanner(System.in); //定义scanner，等待输入
System.out.println("请输入字符串："); 
while (true) { 
String line = s.nextLine(); //读取输入内容
if (line.equals("exit")) break; //如果读取到exit，则退出输入
System.out.println(">>>" + line); //打印输入内容
} 
} 
}