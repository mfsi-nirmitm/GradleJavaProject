package com.scaler.gradleproject;

import com.scaler.lib2.SimpleClass;
import com.github.slugify.Slugify;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Slugify slg = new Slugify();
        System.out.println(slg.slugify("Hello World"));

        SimpleClass sampleObj = new SimpleClass();
        sampleObj.incr();
        System.out.println(sampleObj.a);
    }
}
