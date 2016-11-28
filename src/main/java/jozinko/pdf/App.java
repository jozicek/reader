package jozinko.pdf;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) throws IOException {
    String s = new PdfParser().parseText(new FileLoader().loadFromResources());
    System.out.println(s);
  }
}
