//1 题 复数定义（形如z=a+bi（a,b均为实数）的数称为复数，其中a称为实部，b称为虚部，i称为虚数单位。
当z的虚部等于零时，常称z为实数；当z的虚部不等于零时，实部等于零时，常称z为纯虚数。
加法法则：设z1=a+bi，z2=c+di是任意两个复数。两者和的实部是原来两个复数实部的和，
它的虚部是原来两个虚部的和。两个复数的和依然是复数。即z1+z2=(a+c)+(b+d)i）
/*class complex
{
	int realPart,imagPart;
	complex()
	{
		realPart=0;
		imagPart=0;
	}
	complex(int realPart,int imagPart)
	{
		this.realPart=realPart;
		this.imagPart=imagPart;
	}
	
	void add(complex c1,complex c2)
	{
		realPart=c1.realPart+c2.realPart;
		imagPart=c1.imagPart+c2.imagPart;
	}
	void sub(complex c1,complex c2)
	{
		realPart=c1.realPart-c2.realPart;
		imagPart=c1.imagPart-c2.imagPart;
	}
	void printResult()
	{
		if(realPart==0 & imagPart==0)
			System.out.println("运算结果= 0");
		else if(realPart==0)
			System.out.println("运算结果= "+imagPart+"i");
		else if(imagPart==0)
			System.out.println("运算结果= "+realPart);
		else if(imagPart<0)
			System.out.println("运算结果= "+realPart+imagPart+"i");
		else
			System.out.println("运算结果= "+realPart+"+"+imagPart+"i");
	}
	
	public static void main(String[] args)
	{
		complex c0=new complex();
		c0.printResult();
		complex c1=new complex(18,2);
		//c1.printResult();
		complex c2=new complex(19,-13);
		//c2.printResult();
		c0.add(c1,c2);
		c0.printResult();
		c0.sub(c1,c2);
		c0.printResult();
		
	}
	
}*/
//第2题 计算二维坐标系中圆面积
/*class point
{
	double x,y;
	point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
}
class circleClass
{
	final static double PI=3.14;
	point mp,cp;
	circleClass(point mp,point cp)
	{
		this.mp=mp;
		this.cp=cp;
	}
	
	void area()
	{
		System.out.println("圆的面积="
		+(PI*(Math.pow((mp.x-cp.x),2)+Math.pow((mp.y-cp.y),2))));//Math.pow(x底数,y几次方) ,x 的 y 次幂。
	}
	
	public static void main(String[] args)
	{
		point p10,p11,p20,p21;
		circleClass circle1,circle2;
		
		p10=new point(0,0);
		p11=new point(8.5,9);
		
		p20=new point(2,3.5);
		p21=new point(9,6);
		
		circle1=new circleClass(p10,p11);
		circle2=new circleClass(p20,p21);
		
		circle1.area();
		circle2.area();
	}
}*/

//第3题 计算长方形面积
/*class point
{
	double x,y;
	point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
}
class rectangleClass
{
	point rp,lp;
	rectangleClass(point rp,point lp)
	{
		this.rp=rp;
		this.lp=lp;
	}
	
	void area()
	{
		System.out.println("长方形的面积="
		+(Math.abs((rp.x-lp.x)*(rp.y-lp.y))));//abs求绝对值
	}
	
	public static void main(String[] args)
	{
		point p10,p11,p20,p21;
		rectangleClass rect1,rect2;
		
		p10=new point(0,0);
		p11=new point(8.5,9);
		
		p20=new point(2,3.5);
		p21=new point(9,6);
		
		rect1=new rectangleClass(p10,p11);
		rect2=new rectangleClass(p20,p21);
		
		rect1.area();
		rect2.area();
	}
}*/

//第4题 
class Piont 
{
      private int x,y;     //私有成员变量
      static int pCount=0;     //静态成员变量
      static final double pi=3.14159;  //全局常量
      //重载的构造方法
      public Piont( )  {  }
      public Piont(int x,int y) {this.x=x;this.y=y;}
      //其它成员方法
      public int getx( ){ return this.x;}
      public void setx(int x) { this.x=x; }
      public int gety( ){ return this.y; }
      public void sety(int y) { this.y=y; }
      public double angle( ){ return (180/pi)*Math.atan2(y,x); }//Math.atan2()接受两个参数x和y,方法如下:
angel=Math.atan2(y,x)
x 指定点的 x 坐标的数字。
y 指定点的 y 坐标的数字。
计算出来的结果angel是一个弧度值,也可以表示相对直角三角形对角的角，其中 x 是临边边长，而 y 是对边边长。

      public double radius ( ){ return Math.sqrt(x*x+y*y);  }//sqrt() 方法可返回一个数的平方根。
      public double ppdistance ( Piont p) //方法的参数是对象
      { double distance；
        distance= Math.sqrt((double)((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)));
        return distance;
      }
      //静态成员方法
     static void setpCount( ) { pCount+=1;}
     static int getpCount( ) { return pCount;}
}
public class MDPoint3
{ public static void main (String args[])
  { double distance1,distance2；
    Piont p1=new Piont( );
    p1.setpCount( );
    System.out.println("当前点的总数为："+p1.getpCount)( ));
    Piont p2=new Piont( 2,2);
    p2.setpCount( );
    System.out.println("当前点的总数为："+p2.getpCount)( ));
    Piont p3=new Piont( 3,5);
    p3.setpCount( );
    System.out.println("当前点的总数为："+p3.getpCount)( ));
    distance1=p1.ppdistance ( p2);
    distance2=p3.ppdistance ( p1);
    System.out.println("p1,p2两点间的距离为："+distance1);
    System.out.println("p3,p1两点间的距离为："+distance2);
    System.out.println("p3点的极坐标：angle="+p3.angle()+"，radius="+p3.radius());
   }
}
程序运行结果：
当前点的总数为：1
当前点的总数为：2
当前点的总数为：3
p1,p2两点间的距离为：2.8284271247461903
p3,p1两点间的距离为：5.830951894845301
p3点的极坐标：angle=59.03629333375019，radius=5.830951894845301

//第5题 图书的Book类
/*public class Book
{
	String bookName;
	String author;
	int sales;
	
	Book()
	{
		bookName="abc";
		author="test";
		sales=0;
	}
	Book(String bookName,String author,int sales)
	{
		this.bookName=bookName;
		this.author=author;
		this.sales=sales;
	}
	void setBook(String bookName,String author,int sales)
	{
		this.bookName=bookName;
		this.author=author;
		this.sales=sales;
	}
	void printBook()
	{
		System.out.println("书名："+bookName);
		System.out.println("作者："+author);
		System.out.println("月销量："+sales);
	}
	
	public static void main(String[] args)
	{
		Book b1=new Book();
		b1.printBook();
		Book b2=new Book("西游记","吴承恩",1000);
		b2.printBook();
		
		b1.setBook("红楼梦","曹雪芹",2000);
		b1.printBook();
	}
	
}*/

//第6题
/*public class Bank
{
	String userName;
	String account;
	double  balance;
	Bank()
	{
		userName="银行测试号";
		account="1000000000";
		balance=1000000;
	}
	
	Bank(String userName,String account,double  balance)
	{
		this.userName=userName;
		this.account=account;
		this.balance=balance;
	}
	void query()
	{
		System.out.println("用户名："+userName+"\n"
		                   +"账号："+account+"\n"
							+"余额："+balance);
	}
	
	void deposit(double numb)
	{
		balance +=numb;
	}
	
	void withdraw(double numb)
	{
		if(balance<numb)
			System.out.println("账上余额不足，操作失败！");
		else
			balance -=numb;
	}
	
	public static void main(String[] args)
	{
		Bank b1=new Bank();
		b1.query();
		Bank b2=new Bank("张三疯","1000000002",20000);
		b2.query();
		b2.deposit(500000);
		b2.query();
		b2.withdraw(100000);
		b2.query();
	}
}*/






