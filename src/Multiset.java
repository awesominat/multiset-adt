public interface Multiset {
    public Boolean add(Integer item);
    public void remove(Integer item);
    public Boolean contains(Integer item);
    public Integer count(Integer item);
    public Boolean isEmpty();
    public Integer size();
}
