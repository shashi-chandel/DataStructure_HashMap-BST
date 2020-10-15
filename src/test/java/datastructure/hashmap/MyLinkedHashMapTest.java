package datastructure.hashmap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyLinkedHashMapTest {
	String sentence;
	MyLinkedHashMap<String, Integer> myLinkedHashMap;
	@Before
	public void init() {
	sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting "
			+ "themselves deliberately into paranoid avoidable situations";
	myLinkedHashMap = new MyLinkedHashMap<>();
	}
	
	@Test
	public void givenASentence_WhenWordsAddedToList_ShouldReturnParanoidFrequency() {
		String words[] = sentence.toLowerCase().split(" ");
        for(String word: words) {
        	Integer value = myLinkedHashMap.get(word);
        	if(value==null) 
        		value = 1;
        	else 
        		value = value+1;
        	myLinkedHashMap.add(word,value);
        }
        System.out.println(myLinkedHashMap);
        int frequency = myLinkedHashMap.get("paranoid");
        assertEquals(3, frequency);
	}
	
	@Test(expected = Exception.class)
	public void givenAKey_WhenRemovedFromMap_ShouldRemoveThatKey() {
		String words[] = sentence.toLowerCase().split(" ");
		  for(String word: words) {
	        	Integer value = myLinkedHashMap.get(word);
	        	if(value==null) 
	        		value = 1;
	        	else 
	        		value = value+1;
	        	myLinkedHashMap.add(word,value);
	        }
		  MyMapNode<String,Integer> myMapNode =  (MyMapNode<String, Integer>) myLinkedHashMap.remove("avoidable");
		  System.out.println(myLinkedHashMap);
		  assertEquals(myMapNode.getNext().getKey(),null);
	}
}