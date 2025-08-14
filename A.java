package com.Test;

import java.util.Arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class A {

	public static void main(String[] args) {
		
		//Functional Interface - Since Java 1.8 => Single Abstract Method (SAM)
		//Multiple static and default implemented methods
		//@FunctionalInterface (optional)
		//implement abstract method = Lambda exp. (No need to write implements keyword)
		
		//FI before java 8
		//1) Runnable => run()
		//2) Comparable => compareTo()
		//3) Callable => call()
		
		//FI since java 8
		//1) Consumer => accept()
		Consumer<Integer> a = n -> System.out.println(n);
		a.accept(10);
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		list.forEach(n-> System.out.println(n));
		
		BiConsumer<Integer, String> biCon = (p,q) -> System.out.println(p+ "=" +q);
		biCon.accept(10, "Ten");
		
		Map<Integer,String> map = new HashMap<>();
		map.put(101, "Java");
		map.put(102, "Python");
		map.forEach((k,v)->System.out.println(k+ "=" +v));
		
		//2) Supplier => get()
		Supplier<Double> s = ()->Math.random();
		System.out.println(s.get());
		
		//3) Predicate => test()
		Predicate<Integer> p = no -> no%2==0;
		boolean result = p.test(10);
		System.out.println(result);
		
		//4) Function => apply()
		Function<String,Integer> f = st -> st.length();
		Integer len = f.apply("Hello");
		System.out.println(len);
		Sum s1=s2 -> System.out.println(s2);
		s1.A("Pravin");
		
		
	}
}
