package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] irgs) {
		hello("world");
		hello("user");
		hello("Dima");

		Square s=new Square(5);

		System.out.println("Площадь квадрата со стороной "+s.l+" = "+s.area());

		Rectangle r=new Rectangle(4,6);

		System.out.println("Площадь прямоугольника со сторонами "+r.a+" и "+r.b+" = "+r.area());

		Point p=new Point(4,6,8,10);

		System.out.println("Расстояние между точками (" + p.toString() + ") и (" + p.toString1() + ") = " + p.distance());
	}



	public static void hello(String somebody){
		System.out.println ("Hello, "+somebody+"!!");
	}


}