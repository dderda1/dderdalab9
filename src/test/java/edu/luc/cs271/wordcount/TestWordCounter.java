package edu.luc.cs271.wordcount;
import java.util.HashMap;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Iterator;
import java.util.HashMap;
import java.util.*;
import java.util.Collections;
public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter DONE
  private WordCounter words;
  
  @Before
  public void setUp() {
    words= new WordCounter( new HashMap<>());
  }  // TODO create the SUT instance DONE

  @After
  public void tearDown() {
    words = null;
  }  // TODO set the SUT instance to null DONE

  @Test
  public void testGetCountEmpty() {
    assertTrue(words.getCounts().isEmpty());

  } // TODO verify that the SUT initially returns an empty map DONE?

  @Test
  public void testGetCountNonEmpty() {
    words.countWords( Arrays.asList("placze","z", "powodu", "tej", "klasy").iterator());
    assertEquals(words.getCount("placze"), 1);
    assertEquals(words.getCount("z"), 1);
    assertEquals(words.getCount("jestem smieczona"), 0);
    assertEquals(words.getCount("pierdole"), 0);
    
    // TODO run the SUT on a specific String iterator with some repeated words, DONE??
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    //fail();

  }
}
