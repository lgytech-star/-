package amd;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String[] colors = new String[]{"red", "blue", "yellow", "black"};

	        for (int i = 0; i < 20; i++) {

	            int index = (int)Math.round(Math.random()*3);
	            String color = colors[index];
	            Circle temp = (Circle) Shapefactory.getShape(color);
	            temp.draw();

	        }
	    }

	}


