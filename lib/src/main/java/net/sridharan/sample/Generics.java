package net.sridharan.sample;

import org.jspecify.annotations.Nullable;

import java.util.function.Function;

public abstract class Generics<V> {
//        abstract void foo(
//                Function<@Nullable V, @Nullable V> f);
//        void bar(Function<@Nullable V, @Nullable V> f) {
//            foo(f);
//        }

    static class Foo {
        @Nullable
        Object foo() {
            return null;
        }
    }
    static <T> @Nullable T create(Function<Foo, @Nullable T> factory) {
        return null;
    }

    static @Nullable Object call() {
        //return create(Foo::foo);
        return null;
    }
}