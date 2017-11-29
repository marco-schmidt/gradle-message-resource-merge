package myapp;

import java.util.*;
import lib1.Lib1;

public class MyApp
{
  public static void main(String[] args)
  {
    ClassLoader loader = Thread.currentThread().getContextClassLoader();

	// load myapp bundle
	ResourceBundle bundle = ResourceBundle.getBundle("myapp", Locale.GERMAN, loader);
	System.out.println(bundle.getString("myapponly") + "/" + Lib1.getLib1());

	// load merged bundle
	bundle = ResourceBundle.getBundle("merged", Locale.GERMAN, loader);
	System.out.println("Expecting myapp: " + bundle.getString("name"));
  }
}
