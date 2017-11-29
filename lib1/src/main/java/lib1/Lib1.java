package lib1;

import java.util.*;
import lib2.Lib2;

public class Lib1
{
  public static String getLib1()
  {
    ClassLoader loader = Lib1.class.getClassLoader();
	ResourceBundle bundle = ResourceBundle.getBundle("lib1", Locale.GERMAN, loader);
	return bundle.getString("lib1only") + "/" + Lib2.getLib2();
  }
}
