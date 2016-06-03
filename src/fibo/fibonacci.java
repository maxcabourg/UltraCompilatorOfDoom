package fibo;

public class fibonacci {

	public static void main(String[] args) {

		System.out.println(fibIteratif(0)+" : 0 iteratif");
		System.out.println(fibRecursif(0)+" : 0 recursif");
		System.out.println(fibIteratif(1)+" : 1 iteratif");
		System.out.println(fibRecursif(1)+" : 1 recursif");
		System.out.println(fibIteratif(2)+" : 1 iteratif");
		System.out.println(fibRecursif(2)+" : 1 recursif");
		System.out.println(fibIteratif(5)+" : 5 iteratif");
		System.out.println(fibRecursif(5)+" : 5 recursif");
		System.out.println(fibIteratif(8)+" : 21 iteratif");
		System.out.println(fibRecursif(8)+" : 21 recursif");
		System.out.println(fibIteratif(16)+" : 987 iteratif");
		System.out.println(fibRecursif(16)+" : 987 recursif");
	}


	public static int fibIteratif(int n){
		int i,i_1,i_2,z;
		i=n;
		i_1=1;
		i_2=0;
		if(i>1){
			for(i=2;i<=n;i++){
				z = i;
				i = i_1+i_2;
				i_2 = i_1;
				i_1 = z;
				
			}
		}
		return i;
	}

	public static int fibRecursif(int n){
		switch(n){
		case 0:
			return 0;
		case 1:
			return 1;
		default:
			return fibRecursif(n-1)+fibRecursif(n-2);
		}
	}

}
