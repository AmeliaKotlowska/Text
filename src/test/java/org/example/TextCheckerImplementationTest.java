package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextCheckerImplementationTest {
  @Test
  void shouldGetNotEmpty() {
    //given
    TextCheckerImplementation checker = new TextCheckerImplementation("Arka");
    //when
    boolean text = checker.isNotEmpty();
    //then
    Assertions.assertTrue(text);
  }

  @Test
  void shouldGetEmpty() {
    //given
    TextCheckerImplementation checker = new TextCheckerImplementation("");
    //when
    boolean text = checker.isNotEmpty();
    //then
    Assertions.assertFalse(text);
  }

  @Test
  void shouldGetPalindrome() {
    //given
    TextCheckerImplementation checker = new TextCheckerImplementation("Ara");
    //when
    boolean text = checker.isPalindrome();
    //then
    Assertions.assertTrue(text);
  }

  @Test
  void shouldGetNotPalindrome() {
    //given
    TextCheckerImplementation isPalindrome = new TextCheckerImplementation("Arak");
    //when
    boolean text = isPalindrome.isPalindrome();
    //then
    Assertions.assertFalse(text);
  }

  @Test
  void length() {
    //given
    TextCheckerImplementation checker = new TextCheckerImplementation("Arak");
    //when
    int text = checker.length();
    //then
    Assertions.assertEquals(4, text);
  }
}
