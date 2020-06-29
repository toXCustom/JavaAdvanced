package pl.javaadvanced.simpleIO;

public class DataStorage {
    private int index;
    private String firstLine;
    private String secondLine;

    public DataStorage(int index, String firstLine, String secondLine) {
        this.index = index;
        this.firstLine = firstLine;
        this.secondLine = secondLine;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public void setSecondLine(String secondLine) {
        this.secondLine = secondLine;
    }
}
