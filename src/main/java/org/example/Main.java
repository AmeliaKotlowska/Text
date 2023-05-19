package org.example;

public class Main {
  public static void main(String[] args) {

    TextCheckerImplementation textChecker = new TextCheckerImplementation("Ara");

    System.out.println(textChecker.isNotEmpty());
    System.out.println(textChecker.isPalindrome());
    System.out.println(textChecker.length());
  }

}
