//write a program for a static method that accept data and return the result 

class Sample{
	static double sum(double num1,double num2){
		double res=num1+num2;
		return res;
	}
}
class Met4{
	public static void main(String[] args){
		Sample s=new Sample();
		double x=s.sum(78,23.2);
		System.out.println("Sum="+x);
	}
}

//Sum=101.2