package datastructure.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void given3Numbers_WhenAddedToLinkedList_ShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		assertEquals(true, result);
	}

	@Test
	public void given3Numbers_WhenAppendedToLinkedList_ShouldBeAppendedToLast() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		assertEquals(true, result);
	}

	@Test
	public void given3Numbers_WhenInsertingSecondNumber_ShouldBeAferFirstAndBeforeThird() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		assertEquals(true, result);
	}

	@Test
	public void given3Numbers_WhenPopping_ShouldRemoveFirstNumber() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		MyNode<Integer> pop = (MyNode<Integer>) myLinkedList.pop();
		myLinkedList.printMyNodes();
		assertEquals(myFirstNode, pop);
	}

	@Test
	public void given3Numbers_WhenPopLast_ShouldRemoveLastNumber() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		MyNode<Integer> popLast = (MyNode<Integer>) myLinkedList.popLast();
		myLinkedList.printMyNodes();
		assertEquals(myThirdNode, popLast);
	}

	@Test
	public void given3Numbers_WhenSearching_ShouldReturnThatNumber() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		MyNode<Integer> search = (MyNode<Integer>) myLinkedList.search(30);
		assertEquals(mySecondNode, search);
	}

	@Test
	public void given3Numbers_WhenInserting4th_ShouldInsertAtCorrectPosition() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		MyNode<Integer> myFourthNode = new MyNode<Integer>(40);
		MyNode<Integer> searchAndInsert = (MyNode<Integer>) myLinkedList.searchAndInsert(30, myFourthNode);
		myLinkedList.printMyNodes();
		assertEquals(mySecondNode, searchAndInsert);
	}

	@Test
	public void given4Numbers_WhenRemovingOne_ShouldPassLinkedListTest() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(40);
		MyNode<Integer> myFourthNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.append(myFourthNode);
		MyNode<Integer> searchAndRemove = (MyNode<Integer>) myLinkedList.searchAndRemove(40);
		System.out.print("Search and Remove. Size = " + myLinkedList.size() + " List: ");
		myLinkedList.printMyNodes();
		assertEquals(mySecondNode, searchAndRemove);
	}

	@Test
	public void given3Numbers_WhenUsingSortAdd_ShouldBeAddedInSortedManner() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(100);
		MyNode<Integer> myFourthNode = new MyNode<Integer>(5);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addSorted(myFirstNode);
		myLinkedList.addSorted(mySecondNode);
		myLinkedList.addSorted(myThirdNode);
		myLinkedList.addSorted(myFourthNode);
		myLinkedList.printMyNodes();
		System.out.print("Sorted Nodes :");
		boolean result = myLinkedList.head.equals(myFourthNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.head.getNext().getNext().equals(myFirstNode)
				&& myLinkedList.head.getNext().getNext().getNext().equals(myThirdNode);
		assertEquals(true, result);

	}
}
