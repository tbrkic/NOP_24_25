package pckg_2d_drawing;

public class Test2Drawing {
	public static void main ( String[] args ) {
		Circle circle=new Circle ();
		circle.drawShape ();
		ShapeFillColourDecorator sfcd=new ShapeFillColourDecorator ( circle,Colour.Green );
		sfcd.drawShape ();
		ShapeLineStyleDecorator slsd=new ShapeLineStyleDecorator ( sfcd,LineStyle.Dashed );
		slsd.decorateShape ();
	}
}
