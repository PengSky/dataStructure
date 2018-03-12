import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Tree<String> tree=new Tree<String>("root");
        if(tree.treeEmpty()) System.out.println("no");
        tree.addNode("A",1);
        if(tree.treeEmpty()) System.out.println("no");
        System.out.println(tree.getNodes());
        System.out.println(tree.root());
    }
}
