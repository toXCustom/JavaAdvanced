package pl.javaadvanced.patterns.structural.decorator;

public class BasicItem implements Item {

	@Override
	public void assemble() {
		System.out.println("Basic Item.");
	}
}
