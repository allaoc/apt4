public class TreeTighten {
        public TreeNode tighten(TreeNode t) {
            if (t.left == null && t.right == null) return t;
			if (t.left != null && t.right == null) {
				return tighten(t.left);
			}
			if (t.left == null && t.right != null) {
				return tighten(t.right);
			}
            return new TreeNode(t.info,tighten(t.left),tighten(t.right));
        }
    }