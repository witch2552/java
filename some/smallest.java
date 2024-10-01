class smallest {
 public static int smallest(int a[],int num){
    int temp;
    for (int i=0;i<num;i++) {
        for(int j=0;j<num-1;j++){
            if(a[j+1]>a[j]){
                temp=a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
            }
        }
        
    }
   return a[num-1];
}
   public static void main(String args[]){
        int a[]={1,3,2,4,5,6,7,8,9};
        System.out.println("second largest is"+smallest(a,9));
   }
}          

