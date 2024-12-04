package pckg_2d_drawing;

public abstract class ShapeDecorator implements BasicShape{
	protected BasicShape basicShape;
	
	public ShapeDecorator ( BasicShape basicShape ) {
		this.basicShape = basicShape;
	}
	public abstract void decorateShape();
}
