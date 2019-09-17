class MaxProduct {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0,sum1=0,s1=0,s2=0;
        int j=0,k=1;
        for(j=0;j<arr.length;j++) {
            sum+=arr[j]*(j+1);
            if(arr[j]>=0) {
                sum1+=arr[j]*k++;
            }
            else {
                s1=0;
                s2=0;
                for(int i=0;i<j;i++) {
                    s1+=arr[i];
                }
                for(int i=j+1;i<n;i++) {
                    s2+=arr[i];
                }
                if(s1<=s2) {
                    sum1+=arr[j]*k++;
                }
                //System.out.println(s1+" "+s2);
            }
            
        }
        
        int a=(sum1>sum)?sum1:sum;
        System.out.println("-----"+a+"-----");
  }
