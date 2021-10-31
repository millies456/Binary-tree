import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>> {

	public ArrayList<T> List = new ArrayList<T>();
	public Node<T> root;

	public void ins(T data) {
//recursively calls insert when called
		root = insert(root, data);

	}

	private Node<T> insert(Node<T> root, T data) {
//create a new Node	 
		/*
		 * if the root is null then create a new root 
		 * if the string is bigger than root it returns a negative number
		 * if the string is smaller than the root it returns a positive number
		 * set the data to left and the right
		 * 
		 */
		if (root == null) {
			root = new Node<T>(data);
			return root;
		}
		if (root.getData().compareTo(data) >= 0) {
			root.setLeft(insert(root.getLeft(), data));
		} else {
			root.setRight(insert(root.getRight(), data));
		}
		return root;
	}
/*
 * since the left is the smallest integer of the tree
 * keep looking at left of the node and if the node is smallest then declare it as the minimum
 * return the smallest integer
 * 
 */
	public T minimum(Node<T> root) {
		T mini = root.getLeft().getData();
		while (root.getLeft() != null) {

			root.getLeft();
		}
		return mini;
	}

	public T del(T data) {
		root = (deleter(root, data));
		return data;
	}
/*
 * if the root is 
 */
	public Node<T> deleter(Node<T> root, T data) {
		if (root == null) {
			return root;
		}
		if (root.getData().compareTo(data) > 0) {
			root.setLeft(deleter(root.getLeft(), data));

		} else if (root.getData().compareTo(data) < 0) {
			root.setRight(deleter(root.getRight(), data));
		} else {
			if (root.getLeft() == null) {
				return root.getRight();
			} else if (root.getRight() == null) {
				return root.getLeft();
			}
			root.setData(minimum(root.getRight()));
			root.setRight(deleter(root.getRight(), root.getData()));
		}
		return root;
	}

	public boolean search(T data) {
		root = searchr(root, data);
		if (root != null) {
			return true;
		} else {
			return false;
		}
	}

	public Node<T> searchr(Node<T> root, T data) {
		if (root.getData() == null || root.getData() == data) {
			return root;
		}
		if (root.getData().compareTo(data) > 0) {
			return searchr(root.getLeft(), data);

		}
		return searchr(root.getRight(), data);
	}

	public void inorder(Node<T> root) {

		if (root == null) {
			return;
		} else {
			inorder(root.getLeft());

			System.out.println(root);

			inorder(root.getRight());
		}

	}

	public Node<T> change(T old, T New) {

		deleter(root, old);

		insert(root, New);

		return root;

	}

	public void preorder(Node<T> root) {
		if (root == null) {
			return;
		} else {
			preorder(root.getLeft());
			System.out.println(root);
			preorder(root.getRight());
		}

	}

	public void postorder(Node<T> root) {
		if (root == null) {
			return;
		} else {
			postorder(root.getLeft());
			System.out.println(root);
			postorder(root.getRight());

		}

	}

	public Node<T> getRoot() {
		return this.root;
	}

	public ArrayList<T> getList(Node<T> root) {
		if (root != null) {
			getList(root.getLeft());
			List.add(root.getData());
			getList(root.getRight());
		}else {
			return List;
		}
		return List;
	}

}
