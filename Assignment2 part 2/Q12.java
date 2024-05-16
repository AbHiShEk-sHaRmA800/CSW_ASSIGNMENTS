import java.util.PriorityQueue;

public class _2241019447_Ass4_Q12_Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) minHeap.offer(num);

        System.out.println("Dequeue elements of the priority queue (min heap):");
        while (!minHeap.isEmpty()) System.out.println(minHeap.poll() + " " + minHeap);
        
    }
}
