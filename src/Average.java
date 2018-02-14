
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 6;
int b = 72;
int c = 91;
int d = 200;
int e = 1;
int f = 117;
double g = averagenumbers(a,b,c);
double h = averagenumbers(d,e,f);
System.out.println("The average is "+ g);
System.out.println("The average is" + h );

	}
public static double averagenumbers(int num1, int num2, int num3){
	double average = (num1 + num2 + num3)/3;
	return average;
}
}
