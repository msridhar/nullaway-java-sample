package com.unannotated;
import java.time.Instant;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
class Foo {

    @Nullable Instant instant;

    Foo(@Nullable Instant instant) {
        this.instant = instant;
    }
}