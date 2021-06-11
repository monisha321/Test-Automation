package com.sgtesting.day9;
class calculation
{
	int x,y,z;
	//x=10;y=50;//cant assign values here
	void addition()//method with no parameters
	{
		
		//int x,y,z;//--initialise here when not initialised outside method
		//this.x=x;cant be used here bcoz thr r no parameters x in method
		
		x=10;y=90;//these values override obj.x nd obj.y
		z=x+y;
		System.out.println("sum of x and y is "+z);
	}
}
public class MethodNoPara {

	public static void main(String[] args) {
		calculation obj= new calculation();
		obj.addition();//---when used before assigning values to x ,y (i.e., here),o/p will be shown as zero.
		obj.x=10;obj.y=20;//obj used when initialisation of x,y are done outside method
		obj.addition();
		//obj.z=40;
	}

}
