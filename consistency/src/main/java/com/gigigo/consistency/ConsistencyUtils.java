package com.gigigo.consistency;

import java.util.Collection;
import java.util.Iterator;

public class ConsistencyUtils {

  public static boolean isObjectNull(Object obj) {
    boolean response = false;
    if (obj == null) {
      response = true;
    }
    return response;
  }

  public static boolean isStringEmpty(String str) {
    boolean response = false;
    if (!isObjectNull(str)) {
      if (str.trim().equals("")) {
        response = true;
      }
    }
    return response;
  }

  public static <T> boolean isInstanceOf(Object obj, Class<T> type) {
    if (type.isInstance(obj)) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean hasCollectionNullItem(Collection collection) {
    boolean response = false;
    Iterator iterator = collection.iterator();
    while (iterator.hasNext()) {
      Object obj = iterator.next();
      if (obj == null) {
        response = true;
      }
    }
    return response;
  }

  public static boolean isCollectionEmpty(Collection collection) {
    boolean response = false;
    int nullCounter = 0;
    Iterator iterator = collection.iterator();
    if (collection.isEmpty()) {
      response = true;
    } else {
      while (iterator.hasNext()) {
        Object obj = iterator.next();
        if (obj == null) {
          nullCounter++;
        }
      }
      if (nullCounter == collection.size()) {
        response = true;
      }
    }
    return response;
  }
}