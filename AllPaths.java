 import java.util.List;
 import java.util.ArrayList;
 import java.lang.Integer;
 import java.util.Collections;
 public class AllPaths {
		List<String> routes = new ArrayList<String>();
        public String[] paths(TreeNode t) {
            if (t == null) return new String[0];
			getpath(t,"",true);
            Collections.sort(routes);
			return routes.toArray(new String[0]);
        }
		private void getpath(TreeNode t, String path, boolean first) {
			if (first) path = Integer.toString(t.info);
			else path = path + "->" + Integer.toString(t.info);
			if (t.left == null && t.right == null) {
				routes.add(path);
			}
			if (t.left != null) {
				getpath(t.left,path,false);
			}
			if (t.right != null) {
				getpath(t.right,path,false);
			}
		}
    }