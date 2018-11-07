import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
public class LeafTrails {
	TreeMap<Integer,String> paths = new TreeMap<Integer,String>();
        public String[] trails(TreeNode tree) {
            List<String> toret = new ArrayList<String>();
			helper(tree, "");
			Set<Integer> keys = paths.keySet();
			for (Integer p : keys) {
				toret.add(paths.get(p));
			}
			return toret.toArray(new String[0]);
        }
		private void helper(TreeNode t, String path) {
			String arg;
			if (t.left == null && t.right == null) {
				paths.put(t.info, path);
			}
			if (t.left != null) {
				arg = path + "0";
				helper(t.left,arg);
			}
			if (t.right != null) {
				arg = path + "1";
				helper(t.right,arg);
			}
		}
    }