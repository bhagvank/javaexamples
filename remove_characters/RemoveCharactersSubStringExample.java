public class RemoveCharactersSubStringExample {

 public static void main(String[] args) {
 
   String inputString = "This is an example";
   char targetCharacters = 'n';
    int index = inputString.indexOf(targetCharacters);
    if (index != -1) {
       String result = inputString.substring(index);
       System.out.println(result); 
    } else
    {
       System.out.println(inputString); 
    }
  }
}