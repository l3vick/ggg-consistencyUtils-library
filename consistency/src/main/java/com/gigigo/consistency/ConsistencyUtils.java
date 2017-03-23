package com.gigigo.consistency;

import java.util.Collection;
import java.util.Iterator;

public class ConsistencyUtils {

  public static boolean isObjectNull(Object object) {
    boolean isNull = false;
    if (object == null) {
      isNull = true;
    }
    return isNull;
  }

  public static boolean isStringEmpty(String string) {
    boolean isEmpty = false;
    if (!isObjectNull(string)) {
      if (string.trim().equals("")) {
        isEmpty = true;
      }
    }
    return isEmpty;
  }

  public static <T> boolean isInstanceOf(Object obj, Class<T> type) {
    if (type.isInstance(obj)) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean hasCollectionNullItem(Collection collection) {
    boolean hasNull = false;
    Iterator iterator = collection.iterator();
    while (iterator.hasNext() && !hasNull) {
      Object object = iterator.next();
      if (object == null) {
        hasNull = true;
      }
    }
    return hasNull;
  }

  public static boolean isCollectionEmpty(Collection collection) {
    boolean isEmpty = true;
    Iterator iterator = collection.iterator();
    while (iterator.hasNext() && isEmpty) {
      Object object = iterator.next();
      if (object != null) {
        isEmpty = false;
      }
    }
    return isEmpty;
  }
}