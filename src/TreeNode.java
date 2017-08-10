/**
 * This class is needed to create Binary Tree
 * @author alex malyshev
 * @since 1.0
 */
public class TreeNode {
    private int value;
    private TreeNode up = null;
    private TreeNode left= null;
    private TreeNode right= null;

    TreeNode(int value) {
        this.value = value;
    }

    /**
     * This is root object of Binary Tree
     */
    static TreeNode root = MainClass.root;

    /**
     * Variable that stores the number of objects
     */
    static int count=0;

    /**
     * Method inserts new object into Binary Tree
     * @param value
     */

    static void addTreeNode(int value) {
        TreeNode parrent = MainClass.root;
        TreeNode node = new TreeNode(value);
        while (true) {
            if (value < parrent.value) {
                if (parrent.left == null) {
                    parrent.left = node;
                    node.up = parrent;
                    count++;
                    return;
                } else {
                    parrent = parrent.left;
                }
            } else {
                if (parrent.right == null) {
                    parrent.right = node;
                    node.up = parrent;
                    count ++;
                    return;
                } else {
                    parrent = parrent.right;
                }
            }
        }
    }

    /**
     * Method checks for an the object in the tree
     * @param node
     * @return true, if the object is contained in the Tree or
     * return false, if object is not contained in the Tree
     */
    static boolean contains(TreeNode node) {
        TreeNode parrent = MainClass.root;
        while (node.value!=parrent.value) {
            if (node.value < parrent.value) {
                if (parrent.left == null) {
                    return false;
                } else {
                    parrent = parrent.left;
                }
            } else {
                if (parrent.right == null) {
                    return false;
                } else {
                    parrent = parrent.right;
                }
            }
        }
        return true;
    }

    /**
     * @return the number of objects
     */

    static int sizeNode() {
        return count;
    }

}
