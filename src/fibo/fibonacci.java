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
		System.out.println(fibRecursifTerminal(0,0,1)+" : 0 recursif terminal");
		System.out.println(fibRecursifTerminal(1,0,1)+" : 1 recursif terminal");
		System.out.println(fibRecursifTerminal(2,0,1)+" : 1 recursif terminal");
		System.out.println(fibRecursifTerminal(5,0,1)+" : 5 recursif terminal");
		System.out.println(fibRecursifTerminal(8,0,1)+" : 21 recursif terminal");
		System.out.println(fibRecursifTerminal(16,0,1)+" : 987 recursif terminal");
	}


	public static int fibIteratif(int n){
		int z,i_1,i_2;
		i_1=1;
		i_2=0;
		if(n>1){
			for(int i=2;i<=n;i++){
				z = i_1;
				i_1=i_1+i_2;
				i_2 = z;
				
			}
		}
		return i_1;
	}
	
	public static int fibRecursifTerminal(int n,int acc0,int acc1){
		if(n == 0){
			return acc0;
		}else{
			return fibRecursifTerminal(n-1,acc1,acc0+acc1);
		}
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
