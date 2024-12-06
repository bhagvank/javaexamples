public class RemoveCharactersExample {

 public static void main(String[] args) {
 
   String inputString = "This is an example";
   char targetCharacters  = 'n';
   String regex = ".*" + targetCharacters;
   String result = inputString.replaceAll(regex, String.valueOf(targetCharacters));
   System.out.println(result); 
  }
}