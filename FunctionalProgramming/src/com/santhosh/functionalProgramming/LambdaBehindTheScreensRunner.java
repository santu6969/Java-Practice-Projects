package com.santhosh.functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}

}

class SysoutConsumer implements Consumer<Integer> {

	public void accept(Integer t) {
		System.out.println(t);
	}

}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		return number * number;
	}

}

public class LambdaBehindTheScreensRunner {

	public static void main(String[] args) {
		Predicate<? super Integer> isEvenPredicate = evenPredicate();
		List.of(12, 32, 33, 54, 63, 98, 79).stream().map(e -> e * e).filter(isEvenPredicate)
				.forEach(e -> System.out.println(e));

		List.of(12, 32, 33, 54, 63, 98, 79).stream().map(new NumberSquareMapper()).filter(new EvenNumberPredicate())
				.forEach(new SysoutConsumer());

	}

	private static Predicate<? super Integer> evenPredicate() {
		return e -> e % 2 == 0;
	}

}
