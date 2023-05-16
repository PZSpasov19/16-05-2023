import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Classwork {
    public static void main(String[] args) {
        //Consumer<Integer> printInteger = number -> System.out.println(number);
        //printInteger.accept(10);
        //printInteger.accept(20);
        //printInteger.accept(42);
        //printInteger.accept(69);

        //Supplier<Integer> random = () -> new Random().nextInt();
        //random.get();

        //Predicate<String> isLongerThanFiveLetters = word -> word.length() < 5;
        //Function<String, Boolean> function = word -> word.length() > 5;

        //System.out.println(isLongerThanFiveLetters.test("1234567"));
        //System.out.println(function.apply("123"));

        //String[] text = scanner.nextLine().split("\\s+");
        //List<String> output = new ArrayList<>();
        //int counter = 0;
        //for (int i = 0; i < text.length; i++) {
        //    if(Character.isUpperCase(text[i].charAt(0)))
        //    {
        //        counter++;
        //        output.add(text[i]);
        //    }
        //}
        //System.out.println();
        Scanner scanner = new Scanner(System.in);
        Predicate<String> startsWithUppercase = word -> Character.isUpperCase(word.charAt(0));
        Arrays.stream(scanner.nextLine().split("\\s+")).filter(startsWithUppercase).collect(Collectors.toList());
        List<String> output = Arrays.stream(scanner.nextLine())
                .split("\\s+"))
        .filter(startsWithUppercase)
                .collect(Collection.toList());


    }
}
