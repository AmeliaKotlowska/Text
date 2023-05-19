package org.example;

public class TextCheckerImplementation implements TextChecker {

  private String text;

  public TextCheckerImplementation(String text) {
    this.text = text;
  }

  public TextCheckerImplementation() {

  }

  @Override
  public boolean isNotEmpty() {
    return text.length() != 0;
  }

  @Override
  public boolean isPalindrome() {
    int kk = 0;
    int textLength = text.length() - 1;
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == text.charAt(textLength)) {
        kk = 1;
        break;
      }
      textLength--;
    }
    return kk == 1;
  }

  @Override
  public int length() {
    return text.length();
  }
}