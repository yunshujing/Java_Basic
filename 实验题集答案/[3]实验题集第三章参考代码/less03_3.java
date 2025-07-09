//第三章第三次实验
//10题
package biology.animal;
public class human
{
  String name;
  double height,weight;
  
  public human(String name)
  {
	  this.name=name;
  }
  public void eat()
  {
	System.out.println(name+"is eating");
  }
  public void sleep()
  {
	System.out.println(name+"is sleeping");
  }
  public void work()
  {
	System.out.println(name+"is working");
  }
}

package biology.plant;
public class flower
{
   String name,color,smell;
   
   public flower(String name)
   {
	   this.name=name;
   }
   
   public void drink()
   {
		System.out.println(name+"is drinking");
   }
   
   public void blossom()
   {
		System.out.println(name+"is blossoming");
   }
}

package shool.garden;

import biology.animal.human;
import biology.plant.flower;
class packTest
{
   public static void main(String[] args)
   {
                   human h=new human("张三");
	   flower f=new flower("rose");
	   
	   h.eat();
	   h.sleep();
	   h.work();
	   
	   f.drink();
	   f.blossom();
   
   }

}

//11题
package computer.mainboard;
public class VGACard
{
   public void show()
   {
	  System.out.println("VGA checked success!");
   }

}
package server.mainboard;
import computer.mainboard.VGACard;
class ShowCard extends VGACard
{
   public static void main(String[] args)
   {
      ShowCard sc=new ShowCard();
	  sc.show();
   
   }

}

//12题
package com.graphic;
public class Cylinder
{
   private double r,h;
   private final static double PI=3.14;
   
   public Cylinder(double r,double h)
   {
      this.r=r;
	  this.h=h;
   }
   
   public void volume()
   {
      System.out.println("圆柱体体积："+(PI*r*r*h));
   }
}
package com.test;

import com.graphic.Cylinder;
class Cytest
{
   public static void main(String[] args)
   {
	   Cylinder cy=new Cylinder(5.34,2.0);
	   cy.volume();
  
   }

}


