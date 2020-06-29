package pl.javaadvanced.patterns.structural.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        //obiekt podstawowy
        Item item1 = new BasicItem();
        item1.assemble();

        System.out.println("================");
        //obiekt z 1 dodatkowym pakietem
        Item item2 = new SpecialItem1(new BasicItem(), true);
        item2.assemble();

        System.out.println("================");
        //obiekt gdzie tych pakietów nakładamy więcej
        Item item3 = new SpecialItem1(new SpecialItem2(new BasicItem()), false);
        item3.assemble();
    }
}
