package com.unannotated;

import net.sridharan.TestInterface;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

import java.util.concurrent.atomic.AtomicReference;

@NullMarked
class Test {

  //  interface Foo<T extends @Nullable Object> {
  //    T doSomething();
  //  }
  //  static TestInterface<byte @Nullable []> f = new TestInterface<>() {
  //    @Override
  //    public byte @Nullable [] doSomething() {
  //      throw new RuntimeException("not implemented");
  //    }
  //  };

  private final AtomicReference<@Nullable String> holder =
      new AtomicReference<>(null);
}
