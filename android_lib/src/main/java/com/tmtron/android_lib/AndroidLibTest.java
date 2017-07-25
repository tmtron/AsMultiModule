package com.tmtron.android_lib;

public class AndroidLibTest {

    public static String identity(String input) {

        final ImmutableAndroidLib_Immutable imTest = ImmutableAndroidLib_Immutable.builder().id(input).build();

        return imTest.id();
    }


}
