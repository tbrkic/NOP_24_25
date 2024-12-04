package pckg_2d_drawing;

public class Circle implements BasicShape{
	boolean hidden;
	String shapeName;
	@Override
	public void drawShape ( ) {
		System.out.println ("Drawing: "+this.getClass ().getSimpleName () );
	}
	
	@Override
	public void resize ( ) {
		System.out.println ("Resizing the shape: "+getClass ().getSimpleName () );
	}
	
	@Override
	public String description ( ) {
		return this.toString ();
	}
	
	@Override
	public boolean isHidden ( ) {
		return hidden;
	}
	
	@Override
	public void shapeName ( String name ) {
		 this.shapeName=name;
	}
	
	@Override
	public String toString ( ) {
		return "Circle{" +
		       "shapeName='" + shapeName + '\'' +
		       '}';
	}
}
