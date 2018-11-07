 import java.lang.Character;
 import java.util.List;
 import java.util.ArrayList;
 import java.util.Arrays;
 public class SortedLeaves {
        public String[] values(TreeNode tree) {
            if (tree == null) return new String[0];
			if (tree.left == null && tree.right == null) {
				char temp = (char) tree.info;
				String ret = Character.toString(temp);
				String[] toreturn = new String[1];
				toreturn[0] = ret;
				return toreturn;
			}
			List<String> adder = new ArrayList<String>();
			String[] l = values(tree.left);
			String[] r = values(tree.right);
			boolean trash = adder.addAll(Arrays.asList(l));
			trash = adder.addAll(Arrays.asList(r));
			String[] toreturn = adder.toArray(new String[0]);
			Arrays.sort(toreturn);
			return toreturn;
        }
    }