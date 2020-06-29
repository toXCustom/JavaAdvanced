package pl.javaadvanced.patterns.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Object home = new Object.ObjectBuilder("Parterowy", "z garażem", 4)
                .setPar3(true)
                .build();

        Object home2 = new Object.ObjectBuilder("Kamienico", "bez garażu", 8)
                .setPar3(false)
                .setPar4(2)
                .build();

        StringBuilder stringBuilder = new StringBuilder("aaaa")
                .append(1)
                .append("napis")
                .append("aaaaa");

        System.out.println(stringBuilder);
    }
}
