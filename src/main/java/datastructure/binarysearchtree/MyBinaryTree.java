package datastructure.binarysearchtree;

public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;
	private MyBinaryNode<K> searchNode ;
	private MyBinaryNode<K> tempNode ;

	public void add(K key) {
		this.root = this.addRecursively(root, key);
		tempNode = root;
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

	public MyBinaryNode<K> searchRecursively(K key){
		int compareResult = key.compareTo(tempNode.key);
		if(compareResult==0) {
			searchNode = tempNode;
			return searchNode;
		}
		if(compareResult>0) {
			tempNode = tempNode.right;
			searchNode = searchRecursively(key);
		}
		if(compareResult<0) {
			tempNode = tempNode.left;
			searchNode = searchRecursively(key);
		}
		return searchNode;
	}
}
