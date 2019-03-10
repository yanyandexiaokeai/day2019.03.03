public class Test2{
	public static void main(String[] args){
		int n=100;
		int sum=sum(n);
		System.out.println("1+2+3+…+"+n +"="+sum);
	}
	public static int sum(int n){
		if(n==1){
			return 1;
		}else{
			return n+sum(n-1);//递归
		}
	}
}