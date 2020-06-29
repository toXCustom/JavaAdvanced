package pl.javaadvanced.innerClasses;

public class LocalClassExample {
    public void sampleMethod() {
        class Local {
            //klasa lokala nie może mieć metod ani pól statycznych
            //może mieć statyczne pola finalne
            private String localField;

            public Local(String localField) {
                this.localField = localField;
            }

            public String getLocalField() {
                return localField;
            }
        }

        for (int i = 0; i < 10; i++) {
            //klasa lokalna to taka która jest wykorzystywana w metodzie, bloku kodu
            Local local = new Local("local" + 1);
            System.out.println(local.getLocalField());
        }
    }
}
