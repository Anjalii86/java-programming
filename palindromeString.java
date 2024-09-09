public class palindromeString {
    public static void main(String[] args) {
        String a="anjalii";
        String b=" ";
        for(int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        if(a.equals(b)){
        System.out.println("palindrome haii");
        }else{
            System.out.println("na hai");
    }
    }
    
}
