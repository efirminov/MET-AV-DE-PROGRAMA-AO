package modelo02;

public class SingletonObject {
	 private static int count = 0;
     private static int numero;

     private static SingletonObject instance;
     
     SingletonObject() {
                  numero = ++count;
     }
     
     public static String getInstance() {
                  return "Incremental " + numero;
     }

}
