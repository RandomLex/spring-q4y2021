package org.barzykin.ita.spring.model;

public interface Printable {
    default void print() {
        System.out.println(this);
    }
}
