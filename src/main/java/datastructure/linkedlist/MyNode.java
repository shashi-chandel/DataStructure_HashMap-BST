package datastructure.linkedlist;

public class MyNode<K extends Comparable<K>> implements INode<K> {
	private K key;
	private INode<K> next;
	
	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public INode<K> getNext() {
		return next;
	}
	
	public void setNext(INode next) {
		this.next =(MyNode<K>) next;
	}
	
	public String toString() {
		StringBuilder myString = new StringBuilder();
		myString.append("My Node{"+"key=").append(key).append('}');
		if(next!=null) {
			myString.append("->").append(next);
		}
		return myString.toString();
	}
}