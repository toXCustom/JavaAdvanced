package pl.javaadvanced.interfaces;

public class Demo {
    public static void main(String[] args) {
        InterfaceUser interfaceUser = new InterfaceUser();

        interfaceUser.demo();
        interfaceUser.firstInterfaceDemoMethod();

        MultiInterfaceUser multiInterfaceUser = new MultiInterfaceUser();
        multiInterfaceUser.doSomethingStrange();
        multiInterfaceUser.firstInterfaceDemoMethod();
    }
}
