package chapter12_1;

public class Mountain {
    private String name;
    private int height;

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

}
