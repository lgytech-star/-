package asd.one;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
  public static void main(String[] args) 
  {
	  Map<Integer,String> a=new HashMap<>();
	  a.put(1, "872");
	  a.put(2, "789");
	  System.out.println(a.get(2));
	  Map<String,Car> car=new HashMap<>();
	  car.put("A", new Car("A",2,4));
	  car.put("B", new Car("B",2,4));
	  System.out.println(car.get("B"));
  }
}
