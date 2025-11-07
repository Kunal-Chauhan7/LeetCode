public class CountLeavesinBinaryTree {

    int countLeaves(TreeNode node) {
        if(node == null)
            return 0;
        if(node.left == null && node.right == null)
            return 1;
        int ans = 0;
        ans += countLeaves(node.left);
        ans += countLeaves(node.right);
        return ans;
    }
}
