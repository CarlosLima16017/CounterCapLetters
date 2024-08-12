import domain.TextsDomain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.TextsService;

import static org.junit.jupiter.api.Assertions.*;

class TextsServiceTest {
private TextsService textsService;
private TextsDomain textsMixed,textsLower,textsEmpty;
    @BeforeEach
    public void setUp(){
        textsMixed=new TextsDomain("HeLlo WorLd");
        textsLower=new TextsDomain("hello world");
        textsEmpty=new TextsDomain("");
        textsService=new TextsService();
    }

  @Test
  @DisplayName("The Result should be 4")
  void Sentence_Mixed() {
      Assertions.assertEquals(4,textsService.couterCapLetters(textsMixed));
  }

    @Test
    @DisplayName("The Result should be 0 when all letters are lowerCase")
    void result_Should_be_0_when_all_letters_are_lowercase() {
        Assertions.assertEquals(0,textsService.couterCapLetters(textsLower));
    }

    @Test
    @DisplayName("The Result should be 0 when the String is empty")
    void when_String_is_empty() {
        Assertions.assertEquals(0,textsService.couterCapLetters(textsEmpty));
    }
}