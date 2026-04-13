//program to demonstrate interface in java
class_interface area
rectangle
{
	final static double pi=3.142;
	double compute(double x,double y);
}
class rectangle empliment area
{
	public double compute(double x,double y);
	{
		return(x*x);
	}
}
class circle impliment circle
{
	public static compute(double x,double y);
	{
		return(pi*x*x);
	}
}
class interface_demo
{
	public static void main(String args[])
	{
		rectangle rect=new rectangle();
		circle cir=new circle();
		area=area1;
		area1=rect;
		System.out.println("area of the rectangle="+area1.compute(2.5,3.5)
		area1=cir;
		System.out.println("area of the circle="+area1.compute(8));
	}
}
