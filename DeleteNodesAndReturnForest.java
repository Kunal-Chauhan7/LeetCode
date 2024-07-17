import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DeleteNodesAndReturnForest {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer>set = new HashSet<>();
        List<TreeNode> ans = new ArrayList<>();
        for(int i : to_delete){
            set.add(i);
        }
        if(!set.contains(root.val))ans.add(root);
        travese(root,set,ans,null,false);
        return ans;
    }

    private void travese(TreeNode root, HashSet<Integer> set, List<TreeNode> ans,TreeNode parent,boolean isLeft) {
        if(root==null) return;
        if(set.contains(root.val)){
            if(parent!=null){
                if(isLeft)
                    parent.left=null;
                else
                    parent.right=null;
            }
            if(root.left!=null&&!set.contains(root.left.val))
                ans.add(root.left);
            if(root.right!=null&&!set.contains(root.right.val))
                ans.add(root.right);
        }
        travese(root.left,set,ans,root,true);
        travese(root.right,set,ans,root,false);
    }
}
