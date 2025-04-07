package lab4_prob2;

public class Form {
    protected String color;

    public Form() {
        this.color = "negru";
    }

    public Form(String color) {
        this.color = color;
    }

    public float getArea() {
        return 0;
    }

    public String toString() {
        return color;
    }
}
