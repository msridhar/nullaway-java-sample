package net.sridharan;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public class Log {
  public static void d(String tag, String messageTemplate, @Nullable Object @Nullable... args) {}
}
