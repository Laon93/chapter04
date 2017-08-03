package lang;

public class Point {
	private int x;
	private int y;
	
	public Point() {
	}
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	//Object의 hashCode()는 참조값을 return 하는 일을 했는데
	//override하고 나서는 참조값이 나오는 것이 아니다
	//근데 왜 override? 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	

}
