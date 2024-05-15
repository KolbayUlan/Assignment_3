public class TestBST {
    public static void main(String[] args) {
        BST<Integer, String> tree = new BST<>();
        tree.put(5, "five");
        tree.put(3, "three");
        tree.put(7, "seven");

        for (BST.Entry<Integer, String> entry : tree) {
            System.out.println("key is " + entry.getKey() + " and value is " + entry.getValue());
        }
    }
}
