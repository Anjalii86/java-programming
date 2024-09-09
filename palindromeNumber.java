import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        System.out.println("number bhar de");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp =n;
        int rev=0;
        int rem;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(n==rev){
            System.out.println("hmbe palindrome ha yu to");
        }else{
            System.out.println("yu na hai palindrome");
        }

    }
    
}
