import java.util.HashSet;

public class intersectionOfArray{
    public static int intersection(int arr1[], int arr2[]){
        HashSet<Integer> h=new HashSet<>();
        int count=0;
        for(int i=0;i<=arr1.length;i++){
            h.add(arr1[i]);

        }
        for(int j=0;j<arr2.length;j++){
            if(h.contains(arr2[j])){
                count++;
                h.remove(arr2[j]);
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,4};
        System.out.println(intersection (arr1,arr2));
        
    }
}