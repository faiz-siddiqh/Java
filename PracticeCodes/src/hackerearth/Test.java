package hackerearth;

 class Test {
		public static void main(String[] args)throws java.lang.Exception {
			java.util.Scanner sc=new java.util.Scanner(System.in);
			int n=sc.nextInt();
			
			int result=findNumerologicalReduction(n);
			System.out.println(result);
			
		}

		 static int findNumerologicalReduction(int n)throws java.lang.Exception {
			
			int sum=0;
			
			while(n>0 ||sum>9) {
				if(n==0) {
					n=sum;
					sum=0;
				}
				sum+=n%10;
				n/=10;
			}
			return sum;
		}
	
}
