class Animal {
    private String name;
    private String color;
    private String type;
    public Animal(String name, String color, String type) {
    this.name = name;
    this.color = color;
    this.type = type;
    }
    public String getName() {
    return name;
    }
    public void setName(String name) {
    this.name = name;
    }
    public String getColor() {
    return color;
    }
    public void setColor(String color) {
    this.color = color;
    }
    public String getType() {
    return type;
    }
    public void setType(String type) {
    this.type = type;
    }
    public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((color == null) ? 0 : color.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    return result;
    }
    public String toString() {
    return "Animal [name=" + name + ", color=" + color + ", type=" + type + "]";
    }
    }
    public class Q6 {
    public static void main(String[] args) {
    Animal animal1 = new Animal("Dog", "Brown", "Pet");
    Animal animal2 = new Animal("Lion", "Yellow", "Wild");
    Animal animal3 = new Animal("Cat", "Gray", "Pet");
    System.out.println("Animal 1: " + animal1.hashCode());
    System.out.println("Animal 2: " + animal2.hashCode());
    System.out.println("Animal 3: " + animal3.hashCode());
    }
    }