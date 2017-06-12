package com.example;

import io.reactivex.Observable;

public class MyClass {

    public void testRxLint() {
        Observable.just(1)
                .subscribe(System.err::println);
    }
}
