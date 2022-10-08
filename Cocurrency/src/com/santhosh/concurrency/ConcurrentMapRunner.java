package com.santhosh.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		String str = "ABCD ABCD ABCD";
		ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap();
		for (char character : str.toCharArray()) {
			occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();
		}
		System.out.println(occurances);
	}

}
//CocurrentHashMap not only provides Thread Safety but also provides Regions of buckets, 
//so, collections will be safe and while performing process on one region doesn't effect 
//other region of buckets, therefore provides better performance using this Hashing Technique 