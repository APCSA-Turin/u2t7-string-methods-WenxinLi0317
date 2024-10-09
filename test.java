import java.util.Scanner;
public class test {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
  
        int score = 0;
        int count = 0;

        System.out.println("Enter one word");
        String word1 = scan.nextLine();
        count ++;

        while(score < 50){

        System.out.println("Enter another word");
        String wordAdditional = scan.nextLine();
        count ++;

        String lastTwoLettersOfWord1 = word1.length() >= 2 ? word1.substring(word1.length() - 2) : word1;
        String firstTwoLettersOfWordAdditional = wordAdditional.length() >= 2 ? wordAdditional.substring(0, 2) : wordAdditional;
      
        String firstLetterOfWord1 = word1.substring(0,1);

        
        if((wordAdditional.compareTo(word1)) > 0)  {
            score+=2;
            
        }
        else if ((wordAdditional.compareTo(word1))< 0){
            
            
                score -= 5;
            
        }
        
        else{
            
            
                score -= 10;
            
        }

        if (lastTwoLettersOfWord1.equals(firstTwoLettersOfWordAdditional)){
            score+=5;
        }   
        if (wordAdditional.indexOf(firstLetterOfWord1)!= -1){
            score+=3;
        }
        if((word1.length())==(wordAdditional.length()))
        {
            score+=1;
        }
        System.out.println("The word you typed: " +wordAdditional+ " results: " +score+ " points in total" );
        
        word1 = wordAdditional;

        }
        System.out.println("Congratulations! You reached 50 points in " + count + " words!");
        System.out.println("Try again for a better score!");

        scan.close();
    }
}
