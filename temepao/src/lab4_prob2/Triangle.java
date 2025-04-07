package lab4_prob2;

public class Triangle extends Form {
    private float height;
    private float base;

    public Triangle() {
        super();
        this.height = 0;
        this.base = 0;
    }

    public Triangle(String color, float base, float height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public float getArea() {
        return 0.5f * base * height;
    }

    @Override
    public String toString() {
        return "Triunghi: " + super.toString() + " " + getArea();
    }

    // e - Justificare:
    // Două triunghiuri sunt considerate egale dacă au aceeași bază și înălțime.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Triangle)) return false;
        Triangle other = (Triangle) obj;
        return this.base == other.base && this.height == other.height;
    }

    public void printTriangleDimensions() {
        System.out.println("Baza: " + base + ", Înălțime: " + height);
    }
}
