package com.example;

import io.reactivex.Observable;

public class MyClass {

    public void testRxLint() {
        final ImmutableJavaLib_Immutable testIm = ImmutableJavaLib_Immutable.builder().id("abc").build();

        Observable.just(testIm)
                .subscribe(System.err::println);
    }
}
