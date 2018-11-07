import java.lang.Math;
public class HeightLabel {
        public TreeNode rewire(TreeNode t) {
            if (t == null) return null;
            if (t.right == null && t.left == null) return new TreeNode(1,null,null);
			TreeNode l = rewire(t.left);
			TreeNode r = rewire(t.right);
			if (l == null) return new TreeNode(r.info+1,l,r);
			if (r == null) return new TreeNode(l.info+1,l,r);
			return new TreeNode(Math.max(l.info,r.info)+1,l,r);
        }
    }