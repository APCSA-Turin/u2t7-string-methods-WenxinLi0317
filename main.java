import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter one word");
        String word1 = scan.nextLine();

        System.out.println("Please enter another word");
        String word2 = scan.nextLine();

        int len1 = word1.length();
        int len2 = word2.length();

        
            String split1 = word1.substring(0,(int)(len1/2));
            String split2 = word1.substring((int)(len1/2));

            String split3 = word2.substring(0,(int)(len2/2));
            String split4 = word2.substring((int)(len2/2));
        


       if(len1>len2){
        System.out.println(word1 + "is longer");
       }else if (len2 > len1) {
        System.out.println(word2 + " is longer");
       }else {
        System.out.println(word1 + " and " + word2 + "have the same length");
       }

       System.out.println("First half of " + word1 +":"+ split1);
       System.out.println("Second half of " + word1 +":"+ split2);
       System.out.println("First half of " + word2 +":"+ split3);
       System.out.println("Second half of " + word2 +":"+ split4);


       int index1 = word1.indexOf(word2);

       if(index1 == -1){
          System.out.println(word2 + " is not found in " + word1);
       }else{
        System.out.println(word2 + " is found in " + word1 + " at index " +index1);
       }

        


    }
}