import java.util.Random;

public class MainClass {
    private static int rootValue = 50;
    static TreeNode root = new TreeNode(rootValue);

    public static void main(String[] args) {
        TreeNode.addTreeNode(rootValue);
        System.out.print(rootValue + " ");

        for (int i = 0; i < 30; i++) {
            Random randValue = new Random();
            int iValue = randValue.nextInt(100);
            System.out.print(iValue + " ");
            TreeNode.addTreeNode(iValue);
        }

        System.out.println();
        System.out.println(TreeNode.contains(new TreeNode(49)));
        System.out.println(TreeNode.sizeNode());


    }
}
