public class TreeMultiSet extends MultiSet {
    private Tree _tree;
    public TreeMultiSet() {
        _tree = Tree(null);
    }

    public boolean add(Integer other) { // this is supposed to be Any or a generic
        _tree.insert(other);
        return true;
    }
    public void remove(Integer other) { // this is supposed to be Any or a generic
        _tree.delete_item(other);
    }
    public boolean contains(Integer other) { // this is supposed to be Any or a generic
        return _tree.Contains(other);
    }
    public boolean is_empty() { // this is supposed to be Any or a generic
        return _tree.is_empty();
    }
    public int size() { // this is supposed to be Any or a generic
        return _tree.length();
    }
}

