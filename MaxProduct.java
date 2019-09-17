class MaxProduct {
  public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0,sum1=0;
        int j=0,k=1;
        for(j=0;j<arr.length;j++) {
            sum+=arr[j]*(j+1);
            if(arr[j]>=0) {
                sum1+=arr[j]*k++;
            }
        }
        int a=(sum1>sum)?sum1:sum;
        System.out.println("-----"+a+"-----");
}
