package jozinko.pdf;

import java.io.File;

/**
 *
 */
public class FileLoader {

  public File loadFromResources(){
    ClassLoader classLoader = getClass().getClassLoader();
    return new File(classLoader.getResource("ocp.pdf").getFile());
  }

}
