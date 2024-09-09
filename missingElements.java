public class missingElements {
    public static void main(String[] args) {
        int[]a={1,2,3,4,6,7};
        int exp_no_elements=a.length+1;
        int total_sum=exp_no_elements*(exp_no_elements+1)/2;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("missing no is : "+(total_sum-sum));
    }
    
}
