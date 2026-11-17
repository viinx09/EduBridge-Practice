interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle1 implements Resizable {
    int width = 10;
    int height = 5;
    public void resizeWidth(int width) {
        this.width = width;
    }
    public void resizeHeight(int height) {
        this.height = height;
    }
    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}
class Resizable1 {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1();
        System.out.println("Original Rectangle:");r.display();
        r.resizeWidth(20);
        r.resizeHeight(15);
        System.out.println("\nResized Rectangle:");
        r.display();
    }
}
