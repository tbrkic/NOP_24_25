package pckg_2d_drawing;

public class ShapeFillColourDecorator extends  ShapeDecorator{
	private Colour colour;
	public ShapeFillColourDecorator ( BasicShape basicShape , Colour colour ) {
		super ( basicShape );
		this.colour = colour;
	}
	
	@Override
	public void decorateShape ( ) {
		
		System.out.println ( "Decorating shape: " + this.basicShape + " with fill colour: " + this.colour );
	}
	
	@Override
	public void drawShape ( ) {
		System.out.println ("Drawing decorated: "+this.basicShape+" with fill colour: "+this.colour );
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
		return "ShapeFillColourDecorator{" +
		       "colour=" + colour +
		       ", basicShape=" + basicShape +
		       '}';
	}
}
