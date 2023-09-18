import java.util.ArrayList;
import java.util.List;

public class Tree {
    private List<Integer> subtrees;
    private Integer root;

    public Tree(ArrayList subtrees, int root) {
        this.root = root;
        if (this.subtrees == null) {
            this.subtrees = new ArrayList<Integer>();
        }
        else {
            this.subtrees = (List<Integer>) subtrees.clone();
        }
    }



}
