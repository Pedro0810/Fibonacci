package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		int nextEl = 0;
		List<Integer> fibonacciSequence = new ArrayList();
		fibonacciSequence.add(0);
		fibonacciSequence.add(1);
		while (nextEl <= 350) {
			int i = fibonacciSequence.size() - 1;
			nextEl = fibonacciSequence.get(i) + fibonacciSequence.get(i - 1);
			fibonacciSequence.add(nextEl);
		}
		return fibonacciSequence;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}
}