package datastructure.binarysearchtree;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyBinaryTreeTest {

	@Test
	public void given3Numbers_WhenAddedToBinaryTree_ShouldReturnSizeThree() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		assertEquals(3, size);
	}
}