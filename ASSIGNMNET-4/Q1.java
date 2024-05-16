public class Q1 {
    private String name;

    public Q1(String name) {
        this.name = name;
    }

    public void show() {
        Q1 b = new Q1("Inner Object");
        b.display();
    }

    public void display() {
        @SuppressWarnings("unused")
        Q1 a = new Q1("Inner display object");
    }

    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected: " + name);
        super.finalize();
    }

    public static void main(String[] args) {
        Q1 obj = new Q1("Main object");
        obj.show();
        System.gc();
    }
}
