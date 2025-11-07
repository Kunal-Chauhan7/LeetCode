import java.util.ArrayList;

class PreorderTraversal {
    void preOrder(TreeNode root , ArrayList<Integer> arr){
        if(root==null)return;
        arr.add(root.data);
        preOrder(root.left,arr);
        preOrder(root.right,arr);
    }
    public ArrayList<Integer> preOrder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        preOrder(root,list);
        return list;
    }
}