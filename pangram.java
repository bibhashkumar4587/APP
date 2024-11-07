import java.util.Scanner;

public class pangram {
  public static String isPangram(String sentence) {
    boolean[] alphabet = new boolean[26];
    sentence = sentence.toLowerCase().replaceAll("[^a-z]", "");

    for (int i = 0; i < sentence.length(); i++) {
      char ch = sentence.charAt(i);
      alphabet[ch - 'a'] = true;
    }

    for (int i = 0; i < 26; i++) {
      if (!alphabet[i])
        return "not pangram";
    }

    return "pangram";
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Sentences");
    String sentence = scanner.nextLine();
    System.out.println("");
    System.out.println("Given Sentences is : "+isPangram(sentence));
  }
}
