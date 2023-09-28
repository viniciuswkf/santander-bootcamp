package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionsExample {

    public static void main(String[] args) {

	List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

	Function<Integer, Integer> dobrar = num -> num * 2;

	List<Integer> numerosDobrados = numeros.stream().map(dobrar).collect(Collectors.toList());

	numerosDobrados.forEach(n -> System.out.println(n));

    }

}
