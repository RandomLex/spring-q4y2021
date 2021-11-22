package org.barzykin.ita.spring.model;

public interface Printable {
    default void print() {
        System.out.println(this);
    }

    default void init() {
        System.out.println(this.getClass().getSimpleName() + " is initialised");
    }

    default void destroy() {
        System.out.println(this.getClass().getSimpleName() + " is destroyed");
    }
}
