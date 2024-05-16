class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class _2241019447_Ass4_Q1_Main {

	public static void main(String[] args) {
		Pair<Integer, String> pair = new Pair<>(0, "Hello World");

        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());
	}

}
