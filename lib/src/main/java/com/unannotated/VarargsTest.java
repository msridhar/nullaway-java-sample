package com.unannotated;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public class VarargsTest {

    static class Foo<T extends @Nullable Object> {
        void foo(T... args) {
            // Do something with args
        }
    }

    static void test(@Nullable String s) {
        Foo<@Nullable String> f = new Foo<>();
        //f.foo(s);
    }
}
