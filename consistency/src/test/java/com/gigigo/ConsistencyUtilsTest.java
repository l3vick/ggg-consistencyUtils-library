package com.gigigo;

import com.gigigo.consistency.ConsistencyUtils;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pablo.rojas on 16/3/17.
 */
public class ConsistencyUtilsTest {

  @Test public void testObjectNullWhenObjectIsNotNullReturnFalse() {
    boolean isNull = ConsistencyUtils.isObjectNull(new Object());
    assertEquals(false, isNull);
  }

  @Test public void testObjectNullWhenObjectIsNullReturnTrue() {
    boolean isNull = ConsistencyUtils.isObjectNull(null);
    assertEquals(true, isNull);
  }

  @Test public void testStringEmptyWhenStringIsEmptyButNotNullReturnTrue() {
    boolean isEmpty = ConsistencyUtils.isStringEmpty("     ");
    assertEquals(true, isEmpty);
  }

  @Test public void testStringEmptyWhenStringIsEmptyReturnTrue() {
    boolean isEmpty = ConsistencyUtils.isStringEmpty("");
    assertEquals(true, isEmpty);
  }

  @Test public void testStringEmptyWhenStringIsNotEmptyReturnFalse() {
    boolean isEmpty = ConsistencyUtils.isStringEmpty("test");
    assertEquals(false, isEmpty);
  }

  @Test public void testStringEmptyWhenStringIsNullReturnFalse() {
    boolean isEmpty = ConsistencyUtils.isStringEmpty(null);
    assertEquals(false, isEmpty);
  }

  @Test public void testInstanceOfWhenIsInstanceReturnTrue() {
    Object object = new Object();
    boolean isInstance = ConsistencyUtils.isInstanceOf(object, new Object().getClass());
    assertEquals(true, isInstance);
  }

  @Test public void testInstanceOfWhenIsNotInstanceReturnFalse() {
    Object object = new Object();
    OtherObject otherObject = new OtherObject();
    boolean isInstance = ConsistencyUtils.isInstanceOf(object, otherObject.getClass());
    assertEquals(false, isInstance);
  }

  @Test public void testHasCollectionNullItemWhenHasNullReturnTrue() {
    List collection = new ArrayList();
    collection.add(null);
    boolean hasItemNull = ConsistencyUtils.hasCollectionNullItem(collection);
    assertEquals(true, hasItemNull);
  }

  @Test public void testHasCollectionNullItemWhenHasNotNullReturnFalse() {
    List collection = new ArrayList();
    collection.add(new Object());
    boolean hasItemNull = ConsistencyUtils.hasCollectionNullItem(collection);
    assertEquals(false, hasItemNull);
  }


  @Test public void testIsCollectionEmptyWhenCollectionEmptyReturnTrue() {
    List collection = new ArrayList();
    boolean isEmpty = ConsistencyUtils.isCollectionEmpty(collection);
    assertEquals(true, isEmpty);
  }

  @Test public void testIsCollectionEmptyWhenCollectionNotEmptyReturnFalse() {
    List collection = new ArrayList();
    collection.add(new Object());
    boolean isEmpty = ConsistencyUtils.isCollectionEmpty(collection);
    assertEquals(false, isEmpty);
  }

  @Test public void isCollectionEmptyWithNullItemReturnFalse() {
    List collection = new ArrayList();
    collection.add(null);
    boolean isEmpty = ConsistencyUtils.isCollectionEmpty(collection);
    assertEquals(false, isEmpty);
  }

  @Test public void isCollectionFullOfNullItemsReturnTrue() {
    List collection = new ArrayList();
    collection.add(null);
    collection.add(null);
    boolean isCollectionFullNull = ConsistencyUtils.isCollectionFullOfNullItems(collection);
    assertEquals(true, isCollectionFullNull);
  }

  @Test public void isCollectionFullOfNullItemsReturnFalse() {
    List collection = new ArrayList();
    collection.add(null);
    collection.add("Test");
    boolean isCollectionFullNull = ConsistencyUtils.isCollectionFullOfNullItems(collection);
    assertEquals(false, isCollectionFullNull);
  }



  public class OtherObject {

  }
  
}