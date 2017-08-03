package paint;

public class PaintApp {

	public static void main(String[] args) {
		Point point1 = new Point( 100, 50 );
		point1.show();
		point1.show( false );
		
		drawPoint ( new Point( 200, 200 ) );
		drawPoint ( new ColorPoint(300, 100, "red" ));
		drawPoint ( new ColorPoint(200, 200, "yellow" ) );

		//Shape
		drawShape( new Triangle() );
		drawShape( new Rectangle() );
	}
	
	private static void drawPoint( Point point ) {
		point.show();
	}

	private static void drawShape( Shape shape ) {
		shape.draw();
	}
	
}
