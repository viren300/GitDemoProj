
public class Recurssion_2 {
	static int[] arr = {2,4,36, 46, 100};
public static void main(String[] args) {
	
	int value = SumOfDigit(arr.length-1);
	System.out.println(value);
	
	int val_fact = Fact(5);
	System.out.println(val_fact);
	
	int fib = Fib(7);
	System.out.println(fib);
	
}

	
private static int Fib(int n) {
	// TODO Auto-generated method stub
	if(n==0 || n==1)
	return n ;
	return Fib(n-1)+Fib(n-2);

}


private static int Fact(int i) {
	// TODO Auto-generated method stub
	if(i==1)
	return 1;
	return i*Fact(i-1);
	
}


private static int SumOfDigit(int n) {
	// TODO Auto-generated method stub
	if(n==0)
	return arr[n];
	return arr[n]+SumOfDigit(n-1);
}
private static int SumOfDigit2(int n) {
	// TODO Auto-generated method stub
	if(n==0)
	return arr[n];
	return arr[n]+SumOfDigit(n-1);
}

}
