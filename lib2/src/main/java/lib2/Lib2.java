package lib2;

import java.util.*;

public class Lib2
{
  public static String getLib2()
  {
    ClassLoader loader = Lib2.class.getClassLoader();
	ResourceBundle bundle = ResourceBundle.getBundle("lib2", Locale.GERMAN, loader);
	return bundle.getString("lib2only");
  }
}
