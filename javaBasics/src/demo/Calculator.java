package demo;

public class Calculator {
	public static void main(String[] args) {
		Calculator basicCal=new Calculator();
		basicCal.addNumbers(20, 55);
		basicCal.subtractNumbers(125, 68);
		basicCal.divideNumbers(100, 3);
	}
	//test
public void addNumbers(int num1,int num2) {
	int sum =num1+num2;
	System.out.println(sum);
}

public void subtractNumbers(int num1,int num2) {
	int diff =num1-num2;
	System.out.println(diff);
}

public void multilyNumbers(int num1,int num2) {
	int product= num1*num2;
	System.out.println(product);
}

public void divideNumbers(double num1, double num2) {
	double division=num1/num2;
	System.out.println(division);
}

}
