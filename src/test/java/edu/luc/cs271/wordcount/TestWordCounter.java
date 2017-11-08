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
  Map<String, Integer> tests = new HashMap<String, Integer>();
  @Before
  public void setUp() {
    words = new WordCounter(new HashMap<>());
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
    ArrayList<String> testIt;
    testIt = new ArrayList<String>(Arrays.asList("placze","z", "powodu", "tej", "klasy"));
    words.countWords(testIt.iterator());
    assertEquals(words.getCount("z"), 1);
    assertEquals(words.getCount("klazy"), 4);
    assertEquals(words.getCount("pierdole"), -1);
    assertEquals(words.getCount("bigos"), -1); 
    // TODO run the SUT on a specific String iterator with some repeated words, DONE??
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    //fail();

  }
}
