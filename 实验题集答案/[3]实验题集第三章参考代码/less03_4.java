//13题
/*abstract class Student
{
	String name;
	int age;
	String degree;
	
	Student(String name,int age,String degree)
	{
		this.name=name;
		this.age=age;
		this.degree=degree;
	}
	abstract void show();
}

class Undergraduate extends Student
{
	String specialty;
	
	Undergraduate(String name,int age,String degree,String specialty)
	{
		super(name,age,degree);
		this.specialty=specialty;
	}
	void show()
	{
		System.out.println(name+":"+age+","+degree+","+specialty);
	}
	
}

class Graduate extends Student
{
	String direction;
	
	Graduate(String name,int age,String degree,String direction)
	{
		super(name,age,degree);
		this.direction=direction;
	}
	void show()
	{
		System.out.println(name+":"+age+","+degree+","+direction);
	}
	
	public static void main(String[] args)
	{
		Undergraduate ug1=new Undergraduate("张三",20,"本科","计算机科学");
		Undergraduate ug2=new Undergraduate("李四",21,"本科","物联网");
		Graduate g1=new Graduate("王五",25,"硕士","软件工程");
		Graduate g2=new Graduate("刘六",36,"博士","通信工程");
		
		ug1.show();
		ug2.show();
		g1.show();
		g2.show();
		
		
	}
	
}*/
//14题

/*abstract class Graphics
{
	String name;	
	Graphics(String name)
	{
		this.name=name;
	}
	abstract void parameter();
	abstract void area();	
}

class rectange extends Graphics
{
	int height,weigth;
	rectange(String name,int height,int weigth)
	{
		super(name);
		this.height=height;
		this.weigth=weigth;
	}
	void parameter()
	{
		System.out.println(name+"\t长："+height+",宽："+weigth);
	}
	
	void area()
	{
		System.out.println("面积："+(height*weigth));
	}
	
}

class Circle extends Graphics
{
	String color;
	double r;
	final static double PI=3.14;
	
	Circle(String name,String color,double r)
	{
		super(name);
		this.color=color;
		this.r=r;
	}
	
	void parameter()
	{
		System.out.println(name+"\t颜色："+color+",半径："+r);
	}
	
	void area()
	{
		System.out.println("面积："+(PI*r*r));
	} 
	
	public static void main(String[] args)
	{
		rectange r=new rectange("长方形",3,2);
		r.parameter();
		r.area();
		
		Circle c=new Circle("圆形","红色",4);
		c.parameter();
		c.area();
		
	}
}*/
//15题
/*interface circleInterface
{
	double PI=3.14;
	void circleArea();
}

class circleClass implements circleInterface
{
	double r;
	double s;
	circleClass(double r)
	{
		this.r=r;
	}
	
	public void circleArea()
	{
		s=PI*r*r;
	}
	void show()
	{
		System.out.println("半径："+r+"的圆面积："+s);
	}
	
	public static void main(String[] args)
	{
		circleClass c1=new circleClass(3.5);
		c1.circleArea();
		c1.show();
		
		circleClass c2=new circleClass(5.0);
		c2.circleArea();
		c2.show();
	}
}*/

//16题
interface shape
{
	double area(double r);
}

class circle implements shape
{
	double r;
	final static double PI=3.14;
	circle(double r)
	{
		this.r=r;
	}
	
	public double area(double r)
	{
		return PI*r*r;
	}
	
	void show()
	{
		System.out.println("半径："+r+"的圆面积："+area(r));
	}
}
class square implements shape
{
	double weigth;
	
	square(double weigth)
	{
		this.weigth=weigth;
	}
	
	public double area(double r)
	{
		return r*r;
	}
	
	void show()
	{
		System.out.println("边长："+weigth+"的正方形面积："+area(weigth));
	}
}
	public class Test {
	public static void main(String[] args)
	{
		square s=new square(2);
		s.show();
		
		circle c=new circle(3);
		c.show();
	}
}



