package rogi.main;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static junit.framework.Assert.assertEquals;

class SquareDigitTest {

	@Test
	public void test() {
		assertEquals(811181, new SquareDigit().squareDigits(9119));
		assertEquals(0, new SquareDigit().squareDigits(0));
	}

}

class SquareDigit {

	public int squareDigits(int n) {
		return Integer.parseInt(
				String.valueOf(n)
						.chars()
						.peek(System.out::println)
						.map(i -> Integer.parseInt(String.valueOf((char) i)))
						.map(i -> i * i)
						.mapToObj(String::valueOf)
						.collect(Collectors.joining("")));
	}

	public static void main(String[] args) {
		System.out.println(9/10);
	}

	public int romanToInt(String s) {
		int number = 0;
		if(s.equals("IV")) return 4;
		if(s.equals("IX")) return 9;
		if(s.equals("XL")) return 40;
		if(s.equals("XC")) return 90;
		if(s.equals("CD")) return 400;
		if(s.equals("CM")) return 900;

		if(s.equals("I")) return 1;
		if(s.equals("II")) return 2;
		if(s.equals("III")) return 3;
		if(s.equals("V")) return 5;
		if(s.equals("VI")) return 6;
		if(s.equals("VII")) return 7;
		if(s.equals("VIII")) return 8;
		if(s.equals("X")) return 10;
		if(s.equals("L")) return 50;
		if(s.equals("C")) return 100;
		if(s.equals("D")) return 500;

		if(s.toCharArray().length > 1) {

		}

		return number;
	}

}