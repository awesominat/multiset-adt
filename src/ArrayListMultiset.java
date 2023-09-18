import java.util.ArrayList;
import java.util.List;

public class ArrayListMultiset extends Multiset {

    private List<Integer> list;

    // Class constructor for ArrayListMultiset
    public ArrayListMultiset() {
        this.list = new List<Integer>();
    }

    public boolean add(int item) {
        this.list.add(item);
        return true;
    }

    public void remove(int item) {
        // No if statement necessary in Java bc the remove method is calm
        this.list.remove(item);
    }

    public boolean contains(int item) {
        return this.list.contains(item);
    }

    public boolean is_empty() {
        return this.list.isEmpty();
    }

    public int count(int item) {
        return Collections.frequency(this.list, item);
    }

    public int size() {
        return this.list.size();
    }

}
