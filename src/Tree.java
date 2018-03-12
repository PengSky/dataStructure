import java.util.ArrayList;
import java.util.List;

public class Tree<E> {

    //    /*
//    * 双亲表示法*/
    public class node<T> {
        private T date;
        private int parent;

        public node(T date) {
            this.date = date;
        }

        public node(T date, int parent) {
            this.date = date;
            this.parent = parent;
        }

        @Override
        public String toString() {
            return "Tree$Node[data=" + date + ", parent=" + parent + "]";
        }
    }

    private node rootNode;
    private final int TREE_SIZE = 50;
    private int treeSize;
    private List nodes;
    private int nodeNum;

    Tree(E date) {
        treeSize = TREE_SIZE;
        nodes = new ArrayList<E>();
        nodes.add(new node<E>(date, -1));
        nodeNum++;
    }

    public void addNode(E date, int parent) {
        nodes.add(new node<E>(date, parent));
        nodeNum++;
    }

    public Object root() {
        return nodes.get(0);
    }

    public boolean treeEmpty() {
        try {
            return nodes.get(1) == null;
        } catch (Exception e) {

        }
        return true;
    }

    public List getNodes() {
        return nodes;
    }
}

