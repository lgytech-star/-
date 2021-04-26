package amd;
public class Circle implements Shape,Cloneable{
       
    private int x;
    private int y;
	private String color;
	public void draw() {
				System.out.println("画出圆形在x:"+x+"y:"+y+"颜色："+color);
	}
    public Object clone()
    {
    	Object obj=null;
    	try {
    		
		 obj=super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
    }
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
    public void Display() {
    	System.out.println(color);
    }
}
