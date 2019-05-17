
public class Fibonaci {
	public static int fibo(int n) {
		int f0=0;
		int f1=1;
		int fn=1;
		if (n<0) {
			return -1;
		}
		else if(n==0 || n==1)
		{
			return n;
		}
		else if(n>2) {
			for (int i = 0; i < n; i++) {
				f0=f1;
				f1=fn;
				fn=f0+f1;
			}
		}
		return n;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {
			System.out.println(fibo(i)+" ");	
		}
		
	}

}
