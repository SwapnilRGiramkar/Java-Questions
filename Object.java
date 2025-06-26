//Que.1)Write a Java class Car with attributes like model, color, and speed. Create objects and display their details.
//Answer-
package practice;

public class Car 
{
	String brand;
	String model;
	double price;
	String color;
	int topSpeed;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	Car(String brand,String model,double price,String color,int topSpeed)
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.color=color;
		this.topSpeed=topSpeed;
	}
	public void displayCar()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Price : "+price);
		System.out.println("Color : "+color);
		System.out.println("Top Speed : "+topSpeed);
		System.out.println("--------------------------------");;
	}

}
//-------------------------------------------------------------------------------------
package practice;

public class CarDriver
{
	public static void main(String[] args)
	{
		Car c1= new Car("Suzuki", "Dzire", 450000.0, "black", 140);
		c1.displayCar();
	}

}
//---------------------------------------------------------------------------------------
//Que.2)Create a class Student with a method to calculate average marks. Create multiple objects and call the method.
//Answer-
package practice;
//Create a class Student with a method to calculate average marks. Create multiple objects and call the method.
public class Student
{
	String name;
	int science;
	int math;
	int cs;
	int os;
	int networking;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	Student(String name,int science,int math,int cs,int os,int networking )
	{
		this.name=name;
		this.science=science;
		this.math=math;
		this.cs=cs;
		this.os=os;
		this.networking=networking;

	}
	public int calculateAverage()
	{
		    return (science+math+cs+os+networking)/5;

	}
	public void displayStudent()
	{
		System.out.println("name : "+name);
		System.out.println("Scienece : "+science);
		System.out.println("Math : "+math);
		System.out.println("Computer : "+cs);
		System.out.println("Operating System : "+os);
		System.out.println("Networking : "+networking);
		System.out.println("Average Marks : "+calculateAverage());
		System.out.println("----------------------------------");
	}

}
//---------------------------------------------------------------------------------------
package practice;
//Create a class Student with a method to calculate average marks. Create multiple objects and call the method.
public class StudentDriver
{
	public static void main(String[] args)
	{
		Student s1=new Student("Swapnil", 45, 85,45,78,98);
		Student s2=new Student("Swapnil", 45, 75,78,56,90);
		Student s3=new Student("Swapnil", 45, 100,95,45,98);
		s1.displayStudent();
		s2.displayStudent();
		s3.displayStudent();
	}

}
//----------------------------------------------------------------------------------------
//Que.3)Implement constructor overloading in a Book class.
//Answer-
package practice;
//Implement constructor overloading in a Book class.
public class Book
{
	String brand;
	int pages;
	double price;
	String type;
	String rim;

	public Book() {
		// TODO Auto-generated constructor stub
	}
	Book(String brand,int pages,double price)
	{
		this.brand=brand;
		this.pages=pages;
		this.price=price;
	}
	Book(String brand,int pages,double price,String type)
	{
		this(brand,pages,price);
		this.type=type;
	}
	Book(String brand,int pages,double price,String type,String rim)
	{
		this(brand,pages,price,type);
		this.rim=rim;
	}
	public void displayBook()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Pages : "+pages);
		System.out.println("Price : "+price);
		System.out.println("type : "+type);
		System.out.println("rim : "+rim);
		System.out.println("---------------------------");
	}
}
//---------------------------------------------------------------------------
package practice;
//Implement constructor overloading in a Book class.
public class BookDriver
{
	public static void main(String[] args) {
		Book b1=new Book("classmate", 200, 400);
		b1.displayBook();
		Book b2=new Book("Camelin", 400, 200, "ruled", "good");
		b2.displayBook();
	}

}
//---------------------------------------------------------------------------
//Que.4)Write a program to show how multiple objects can share the same static variable.
//Answer-
package practice;
//Write a program to show how multiple objects can share the same static variable.
public class Watch 
{
	static String brand;
	double price;
	String color;
	String type;
	
	public Watch() {
		// TODO Auto-generated constructor stub
	}
	Watch(double price,String color,String type)
	{
		this.price=price;
		this.color=color;
		this.type=type;
	}
	
	public void displayWatch()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Color : "+color);
		System.out.println("type  :"+type);
		System.out.println("---------------------------");
	}
}
//---------------------------------------------------------------------
package practice;

public class WatchDriver 
{
	public static void main(String[] args) 
	{
		Watch w1=new Watch(4500.0, "maroon", "Analog");
		w1.displayWatch();
		
		w1.brand="Rolex";
		
		w1.displayWatch();
		
		Watch w2=new Watch(25000.0, "black", "Digital");
		w2.displayWatch();
		
		w2.brand="Titan";
		
		w2.displayWatch();
	}
}
//--------------------------------------------------------------------------------
//Que.5)Create a class Rectangle with methods to calculate area and perimeter. Create objects and demonstrate usage.
//Answer-
package practice;
//Create a class Rectangle with methods to calculate area and perimeter. Create objects and demonstrate usage.
public class Rectangle
{
	double length;
	double width;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}

	public double calculateArea()
	{
		return length*width;
	}
	public double calculatePerimeter()
	{
		return 2*(length+width);
	}
	public void displayRectangle()
	{
		System.out.println("Area of rectangle : "+ calculateArea());
		System.out.println("Perimeter of Rectangle : "+ calculatePerimeter());
		System.out.println("-----------------------------------");
	}

}
//-----------------------------------------------------------------------------------------
package practice;

public class RectangleDriver
{
	public static void main(String[] args)
	{
		Rectangle r1=new Rectangle(12.2,22.0);
		r1.displayRectangle();
	}
}
//---------------------------------------------------------------------------------------------
