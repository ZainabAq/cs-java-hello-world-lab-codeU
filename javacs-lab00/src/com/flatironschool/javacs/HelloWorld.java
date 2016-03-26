package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
      String version = System.getProperty("java.version");
      version = version.substring(0, 3);
      Double versionJava = Double.parseDouble(version);
      return versionJava;
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
      System.out.println(getVersion());
    }
}
