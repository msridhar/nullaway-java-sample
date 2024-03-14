package net.sridharan.sample;

import org.jspecify.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Scratch {
  public class Foo {
    @Nullable
    private final String bar;
    private final String baz;
    public Foo(String bar, String baz) {
      this.bar = bar;
      this.baz = baz;
    }
  }

  void streams() {
    List<Foo> foos = new ArrayList<>();
    var unused = foos.stream()
        .filter(f -> f.bar != null)
        .collect(Collectors.toMap(f -> f.bar, f -> f.baz));
  }
}