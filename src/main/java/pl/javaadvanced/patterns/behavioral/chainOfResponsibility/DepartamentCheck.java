package pl.javaadvanced.patterns.behavioral.chainOfResponsibility;

public class DepartamentCheck extends AccessCheck {
    @Override
    public boolean doCheck(String username) {

        return checkNextElement(username);
    }
}
