package com.unannotated;

import org.jspecify.annotations.*;
import java.util.StringJoiner;

@NullMarked
public class StringJoinerTest {
    void test() {
        StringJoiner x = new StringJoiner(null);
    }
}