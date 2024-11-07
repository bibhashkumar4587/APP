import java.util.Scanner;

public class camelCase {
  public static int countWords(String s) {
    if (s == null || s.isEmpty()) {
      return 0;
    }

    int wordCount = 1;
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (Character.isUpperCase(ch)) {
        wordCount++;
      }
    }

    return wordCount;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter CamelCase string:");
    String input = scanner.nextLine();
    int result = countWords(input);
    System.out.println("Number of words: " + result);

    scanner.close();
  }
}
