package com.tmtron.asmultimodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.MyClass;

import io.reactivex.Observable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void testRxLint() {
        Observable.just(1)
                .subscribe(System.err::println);
        //new MyClass().testRxLint();
    }

}
