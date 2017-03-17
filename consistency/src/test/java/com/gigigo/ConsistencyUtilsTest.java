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

  @Test public void isObjectNullReturnFalse() {
    boolean object = ConsistencyUtils.isObjectNull(new Object());
    assertEquals(false, object);
  }

  @Test public void isObjectNullReturnTrue() {
    Object obj = null;
    boolean object = ConsistencyUtils.isObjectNull(obj);
    assertEquals(true, object);
  }

  @Test public void isStringEmptyReturnTrue() {
    String str = "   ";
    boolean string = ConsistencyUtils.isStringEmpty(str);
    assertEquals(true, string);
  }

  @Test public void isStringEmptyReturnFalse() {
    String str = "test";
    boolean string = ConsistencyUtils.isStringEmpty(str);
    assertEquals(false, string);
  }

  @Test public void isStringNullEmptyReturnFalse() {
    String str = null;
    boolean string = ConsistencyUtils.isStringEmpty(str);
    assertEquals(false, string);
  }

  @Test public void isInstanceOfReturnTrue() {
    Object obj = new Object();
    boolean object = ConsistencyUtils.isInstanceOf(obj, new Object().getClass());
    assertEquals(true, object);
  }

  @Test public void isInstanceOfReturnFalse() {
    Object obj = new Object();
    a a = new a();
    boolean object = ConsistencyUtils.isInstanceOf(obj, a.getClass());
    assertEquals(false, object);
  }

  @Test public void hasCollectionItemNullReturnTrue() {
    List collection = new ArrayList();
    collection.add(null);
    boolean response = ConsistencyUtils.hasCollectionItemNull(collection);
    assertEquals(true, response);
  }

  @Test public void hasCollectionItemNullReturnFalse() {
    List collection = new ArrayList();
    collection.add("");
    boolean response = ConsistencyUtils.hasCollectionItemNull(collection);
    assertEquals(false, response);
  }

  @Test public void isCollectionEmptyReturnTrue() {
    List collection = new ArrayList();
    boolean response = ConsistencyUtils.isCollectionEmpty(collection);
    assertEquals(true, response);
  }

  @Test public void isCollectionEmptyReturnFalse() {
    List collection = new ArrayList();
    collection.add("test");
    boolean response = ConsistencyUtils.isCollectionEmpty(collection);
    assertEquals(false, response);
  }

  @Test public void isCollectionEmptyWithNullItemReturnFalse() {
    List collection = new ArrayList();
    collection.add(null);
    boolean response = ConsistencyUtils.isCollectionEmpty(collection);
    assertEquals(false, response);
  }

  public class a {

  }
  
}