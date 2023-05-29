import java.util.Objects;

public class Notebook {
    private int ram;
    private int hdSize;
    private String os;
    private String color;

    public Notebook(int ram, int hdSize, String os, String color) {
        this.ram = ram;
        this.hdSize = hdSize;
        this.os = os;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdSize() {
        return hdSize;
    }

    public void setHdSize(int hdSize) {
        this.hdSize = hdSize;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook [ram=" + ram + ", hdSize=" + hdSize + ", os=" + os + ", color=" + color + "]";
    }

    @Override
    public boolean equals(Object o) {
        Notebook t = (Notebook) o;
        return ram == t.ram && hdSize == t.hdSize && color.equals(t.color) && os.equals(t.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, hdSize, color, os);
    }
}