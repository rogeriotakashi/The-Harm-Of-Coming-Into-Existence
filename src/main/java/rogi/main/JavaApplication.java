package rogi.main;

import org.springframework.boot.SpringApplication;

import java.util.stream.Collectors;


public class JavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaApplication.class, args);
	}

	public int squareDigits(int n) {
		String s = String.valueOf(n);
		return Integer.valueOf(s.chars()
				.mapToObj(c -> Character.valueOf((char) c))
				.mapToInt(Integer::valueOf)
				.map(num -> num * num)
				.mapToObj(r -> String.valueOf(r))
				.collect(Collectors.joining("")));
	}

}
