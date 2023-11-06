import java.util.PriorityQueue;
import java.util.Queue;

public class seat_rev {
    class SeatManager {
  public SeatManager(int n) {}

  public int reserve() {
    if (minHeap.isEmpty())
      return ++num;
    return minHeap.poll();
  }

  public void unreserve(int seatNumber) {
    minHeap.offer(seatNumber);
  }

  private Queue<Integer> minHeap = new PriorityQueue<>();
  private int num = 0;
}

}
