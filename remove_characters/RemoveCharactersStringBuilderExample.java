public class RemoveCharactersStringBuilderExample {

 public static void main(String[] args) {
 
        String inputString = "This is an example";
        char targetCharacters = 'n';

        StringBuilder sb = new StringBuilder(inputString);
        int index = sb.indexOf(String.valueOf(targetCharacters));

        if (index != -1) {
            sb.delete(0, index);
            System.out.println(sb.toString());  
        } else 
        {
           System.out.println("Character not found in the string.");
        }
  }
}