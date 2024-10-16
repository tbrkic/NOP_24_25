package pckg_ducks;

public abstract class Duck {
	protected Flyable flyable;
	protected Quackable quackable;
	protected abstract void display();
	protected abstract void swim();
	public void setFlyable(Flyable flyable){
		this.flyable=flyable;
	}
	public void setQuackable ( Quackable quackable ) {
		this.quackable = quackable;
	}
}
