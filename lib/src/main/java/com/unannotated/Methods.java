package com.unannotated;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

import java.util.Collections;
import java.util.List;

@NullMarked
public class Methods {
  public static <T extends @Nullable Object> T
      firstOrDefault(List<T> list, T defaultValue) {
    return list.isEmpty() ? defaultValue : list.get(0);
  }

  public static <T extends @Nullable Object> T
      id (T t) {
    return t;
  }


//  public static void use(List<@Nullable String> l) {
//      String unused = firstOrDefault(l, "hi");
//      firstOrDefault(Collections.singletonList("hi"), null);
//  }

  public static void callId() {
      //String unused = id(null);
  }
}