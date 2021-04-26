package amd;

import java.util.HashMap;
import java.util.Map;

public class Shapefactory {
    private static Map<String,Circle>map=new HashMap<String,Circle>();
   public static Shape getShape(String color)
   {
	   Circle shape=(Circle)map.get(color);
       if (shape == null) {
           shape = new Circle();
           shape.setColor(color);
           map.put(color, shape);
           System.out.println("创建了一个新圆：color="+color);
       }
       return (Circle)shape.clone();
   }
}
