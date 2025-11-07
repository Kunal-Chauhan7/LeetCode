package kunal;

public class CountNodesEqualtoAverageofSubtree {

    private int numberOfMatchingTree = 0;

    public int averageOfSubtree(TreeNode root) {
        averageOfSubtreeHelper(root);
        return numberOfMatchingTree;
    }

    private int[] averageOfSubtreeHelper(TreeNode root) {
        if(root == null)
            return new int[]{0,0};
        int[] leftSubtree = averageOfSubtreeHelper(root.left);
        int[] rightSubtree = averageOfSubtreeHelper(root.right);
        int numberOfNodes = 1 + leftSubtree[1] + rightSubtree[1];
        int sumOfSubtree = root.val + leftSubtree[0] + rightSubtree[0];
        if(sumOfSubtree/numberOfNodes == root.val) numberOfMatchingTree++;
        return new int[]{sumOfSubtree,numberOfNodes};
    }


//    public int averageOfSubtree(TreeNode root) {
//        return averageOfSubtreeHelper(root);
//    }
//
//    private int averageOfSubtreeHelper(TreeNode root) {
//
//        if(root == null) return 0;
//        int sumOfSubTree = sumOfSubTree(root);
//        int numberofNodes = numberOfNodes(root);
//
//        if(sumOfSubTree / numberofNodes == root.val)
//            return 1 + averageOfSubtree(root.left) + averageOfSubtree(root.right);
//        else
//            return averageOfSubtree(root.left) + averageOfSubtree(root.right);
//
//    }
//
//    private int sumOfSubTree(TreeNode root){
//        if(root == null)return 0;
//        int sumOfSubTree = root.val;
//        sumOfSubTree+= sumOfSubTree(root.left);
//        sumOfSubTree+=sumOfSubTree(root.right);
//        return sumOfSubTree;
//    }
//
//    private int numberOfNodes(TreeNode root){
//        if(root == null) return 0;
//        return 1 + numberOfNodes(root.left) + numberOfNodes(root.right);
//    }

}
