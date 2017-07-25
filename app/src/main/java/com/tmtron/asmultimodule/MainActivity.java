package com.tmtron.asmultimodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.MyClass;
import com.tmtron.android_lib.AndroidLibTest;

import io.reactivex.Observable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvHello = findViewById(R.id.tvHello);
        tvHello.setText(tvHello.getText() + AndroidLibTest.identity(": lib"));
    }

    public void testRxLint() {
        Observable.just(1)
                .subscribe(System.err::println);
        //new MyClass().testRxLint();
    }

}
