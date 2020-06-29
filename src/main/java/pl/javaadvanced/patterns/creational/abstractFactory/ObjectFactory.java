package pl.javaadvanced.patterns.creational.abstractFactory;

public class ObjectFactory {

	public static ObjectType getObject(ObjectAbstractFactory factory){
		return factory.createObject();
	}
}
