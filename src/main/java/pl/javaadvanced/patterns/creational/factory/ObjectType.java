package pl.javaadvanced.patterns.creational.factory;

public abstract class ObjectType {

	enum fuelType {GAS, ON, PB}

	public abstract String getName();
	public abstract String getPar1();
	public abstract int getPar2();

	@Override
	public String toString(){
		return "Name= "+this.getName()+", Par1="+this.getPar1()+", Par2="+this.getPar2();
	}
}
