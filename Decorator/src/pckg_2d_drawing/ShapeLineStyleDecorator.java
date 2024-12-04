package pckg_2d_drawing;

public class ShapeLineStyleDecorator extends ShapeDecorator{
	LineStyle lineStyle;
	public ShapeLineStyleDecorator ( BasicShape basicShape, LineStyle lineStyle ) {
		super ( basicShape );
		this.lineStyle=lineStyle;
	}
	
	@Override
	public void decorateShape ( ) {
		System.out.println ("Decorating shape: "+this.basicShape+" with line style: "+this.lineStyle );
	}
	
	@Override
	public void drawShape ( ) {
		System.out.println ("Drawing shape: "+this.basicShape+" with line style: "+this.lineStyle );
	}
	
	@Override
	public void resize ( ) {
		System.out.println ("Resizing decorated shape..." );
	}
	
	@Override
	public String description ( ) {
		return this.toString ();
	}
	
	@Override
	public boolean isHidden ( ) {
		return this.basicShape.isHidden ();
	}
	
	@Override
	public void shapeName ( String name ) {
		System.out.println ("Shape is called: "+this.basicShape );
	}
	
	@Override
	public String toString ( ) {
		return "ShapeLineStyleDecorator{" +
		       "lineStyle=" + lineStyle +
		       ", basicShape=" + basicShape +
		       '}';
	}
}
