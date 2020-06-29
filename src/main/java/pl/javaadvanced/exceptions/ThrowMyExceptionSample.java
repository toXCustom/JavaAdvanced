package pl.javaadvanced.exceptions;

public class ThrowMyExceptionSample {

    public static void main(String[] args) {
        ThrowMyExceptionSample sample = new ThrowMyExceptionSample();

        sample.exceptionPasser();
    }

    private void exceptionCatcher() {
        throw new MyException("AAAAAA, błąd!!!");
    }

    private void exceptionPasser() {
        exceptionCatcher();
    }
}
