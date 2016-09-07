package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import com.javaBasic.Array;



 
public class Test8 {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		//get count of empty string
		int count = (int) strings.stream().filter(a->a.isEmpty()).count();
		System.out.println("count:"+count);
		 strings.stream().filter(a->!a.isEmpty()).forEach(System.out::println);;

		
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("cat","apple", "banana", "pear");
//		words.sort((w1, w2) -> {
//			return w1.compareTo(w2);
//		    //return Integer.compare(w1.length(), w2.length());
//		});
		
		words.forEach(word -> {
		    System.out.println("---"+word);
		});
		
		System.out.println(3%2);
		System.out.println(51%2);

		System.out.println(10%2);
		System.out.println(0%2);


		BiFunction<Integer, Integer, Integer> function=(x,y)->(2*x+y);
		System.out.println(function.apply(2, 3));
		
		IntStream.of(1,2,3,4).reduce((a,b)->(a+b)).ifPresent(x->System.out.println(x));
		//.forEach(x->System.out.println(x));
		
		Function<Integer,Integer> function2= x->x+1;
		System.out.println(function2.apply(100));
		
		String a="bca";
		char arr[]=a.toCharArray();
		Arrays.sort(arr);
		System.out.println(new String(arr));
		
		Formula formula = new Formula() {
		    @Override
		    public double calculate(int a) {
		        return sqrt(a);
		    }
		};
		
		System.out.println(formula.calculate(100));     // 100.0
		System.out.println(formula.sqrt(16));           // 4.0
		
		
		Converter<String, String> converter = (from) -> from+1;
		String converted = converter.convert("123");
		System.out.println(converted);    // 123
		
		
		Predicate<String> predicate = (s) -> s.length() > 0;
		System.out.println(predicate.test("foo"));;              // true
		predicate.negate().test("foo");     // false
		Predicate<Boolean> nonNull = Objects::nonNull;
		Predicate<Boolean> isNull = Objects::isNull;
		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> isNotEmpty = isEmpty.negate();
		
		Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
		greeter.accept(new Person("Luke", "Skywalker"));
		
		//Supplier<Person> personSupplier = Person::new;
		Supplier<Person> personSupplier = ()->new Person("WWWWWW", "OOOOOO");
		System.out.println(personSupplier.get().firstName);;   // new Person
		
		
		 Function<String,String> function1 = (x) -> {System.out.print(x+": ");return "Function";};  
	        System.out.println(function1.apply("hello world"));  
	        
	        //Predicate<T> -T作为输入，返回的boolean值作为输出   
	        Predicate<String> pre = (x) ->{System.out.print(x);return false;};  
	        System.out.println(": "+pre.test("hello World"));  
	        
	        Consumer<String> con = (x) -> {System.out.println(x);};  
	        con.accept("hello world"); 
	        
	      //Supplier<T> - 没有任何输入，返回T   
	        Supplier<String> supp = () -> {return "Supplier";};  
	        System.out.println(supp.get());  
	        
	        
		
	}

}
