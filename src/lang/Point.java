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
	//근데 왜 override? hashCode에서 안에 들어있는 데이터들을 숫자로 변환한다.
	//그래서 그 숫자를 가지고, 그 숫자가 같은지를 확인한 후에 같은 숫자를 가지고 있는 애들만
	//equals를 수행한다. ==> 변수가 많거나 배열인 경우에 비교를 해야하는 대상이 너무 많아지는데
	//그렇게 되면 성능적(속도적인 면에서)으로 너무 좋지 못하기 때문에 그를 방지하기 위해서 hashCode()도 Override 하는 것이다.
	//또한, hashCode()를 override하지 않으면 참조값을 비교하는 것이기 때문엘 동일한 데이터를 가지고 있더라도
	//같지 않다고 나올수도 있게된다. 그렇기 때문에 참조기반의 hashCode()가 내용 기반의 hashCode()로 오버라이드 되는 것이다.
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
