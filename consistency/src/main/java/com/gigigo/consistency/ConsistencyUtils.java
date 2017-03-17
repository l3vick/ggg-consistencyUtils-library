package com.gigigo.consistency;

import java.util.Collection;
import java.util.Iterator;

public class ConsistencyUtils {

  private ConsistencyUtils() {
  }

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

  public static boolean hasCollectionItemNull(Collection collection) {
    boolean response = false;
    String str = null;
    Iterator iterator = collection.iterator();
    while (iterator.hasNext()) {
      Object obj = iterator.next();
      if (obj == null){
        response = true;
      }
    }
    return response;
  }


  public static boolean isCollectionEmpty(Collection collection){
    boolean response = false;
    if (!hasCollectionItemNull(collection)){
      if (collection.isEmpty()){
        response = true;
      }
    }
    return response;
  }

}