public class CustomStringMethods {

  public CustomStringMethods() 
  {  
  }


  /* Client provides myString and maxLength and method returns true if the length of myString
            exceeds maxLength, and returns false otherwise.

             Example:  If myString is apples and maxLength is 5, this method returns true.
             Example:  If myString is apples and maxLength is 6, this method returns false.
      */
  public boolean longerThan(String myString, int maxLength) {
    return (myString.length() > maxLength);
  }

  /* Client provides str and idx and method returns a new String created by appending
            the character located at index idx of str to the beginning of str and the end of str

             Example:  If str is apples and idx is 4, this method returns the string eapplese
             Example:  If str is apples and idx is 0, this method returns the string aapplesa
   */
  public String funnyString(String str, int idx) {
    String strIndexed = str.substring(idx, idx + 1);
    return strIndexed + str + strIndexed;
  }

  /**Client provides myString and the method returns a String that represents mystring
            with its halves reversed; strings of odd length should have the extra character be a part
            of the second half when initially halved (and appear in the first half in the returned String).

            Example:  If myString is computers, this method should return the string uterscomp
            Example:  If myString is "reverse me!", this method should return "e me!revers"; 
  */
  public String halvesReversed(String myString) {
    int len1 = myString.length();
    String subString1 = myString.substring(0,(int)(len1/2)); 
    String subString2 = myString.substring((int)(len1/2));
    return subString2+subString1;
  }
}
