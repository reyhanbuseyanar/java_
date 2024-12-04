package projelerim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberAnalyzer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        List<Integer> numbers = new ArrayList<>();
		        int input;

		        System.out.println("Pozitif tam sayılar girin (çıkmak için -1 girin):");

		        while (true) {
		            input = scanner.nextInt();
		            if (input == -1) {
		                break;
		            } else if (input > 0) {
		                numbers.add(input);
		            } else {
		                System.out.println("Lütfen yalnızca pozitif tam sayılar girin.");
		            }
		        }

		        if (numbers.isEmpty()) {
		            System.out.println("Hiç sayı girilmedi.");
		            return;
		        }

		        int min = Collections.min(numbers);
		        int max = Collections.max(numbers);

		        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);

		        Collections.sort(numbers);
		        double median;
		        int size = numbers.size();
		        if (size % 2 == 0) {
		            median = (numbers.get(size / 2 - 1) + numbers.get(size / 2)) / 2.0;
		        } else {
		            median = numbers.get(size / 2);
		        }

		        System.out.println("Minimum: " + min);
		        System.out.println("Maksimum: " + max);
		        System.out.println("Ortalama: " + average);
		        System.out.println("Medyan: " + median);
		        System.out.println("Artan sırada sayılar: " + numbers);
		        
		        scanner.close();

	}

}
