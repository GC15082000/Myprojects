package com.practice.StreamAPI;

import java.util.stream.Stream;

public class ArraysTestStreamAPI {
	public static void main(String[] args) {
    String arr[]= {"GC","GC1","GC2"};
    Stream<String> stream1=Stream.of(arr);
    stream1.forEach(e -> {
    	System.out.println(e);
    });
}
}
