
package excepciones;

package com.journaldev.exceptions;

public class _9Excepciones {
  public static void main(String[] args) {
    try {
      Class.forName("com.journaldev.MyInvisibleClass");

      ClassLoader.getSystemClassLoader().loadClass("com.journaldev.MyInvisibleClass");

      ClassLoader.getPlatformClassLoader().loadClass("com.journaldev.MyInvisibleClass");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
