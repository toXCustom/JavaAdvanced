package pl.javaadvanced.patterns.behavioral.visitor;

public interface ItemElement {

    int accept(ItemVisitor visitor);

}
