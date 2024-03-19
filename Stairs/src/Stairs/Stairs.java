package Stairs;
import java.util.Scanner;

public class Stairs {public static void main (String[] args) {
	
	calculation();
}

    private static void calculation() {
    	
    	while (true) {
    		
    		try {
        		System.out.println("Введите количество кубиков в лестнице!");
        		Scanner sc = new Scanner(System.in);
            	int cubes = sc.nextInt();
            	int cubesForStairs = 0;
            	if (cubes > 0) {
            		while (cubesForStairs <= cubes){cubesForStairs++; cubes = cubes - cubesForStairs;} System.out.println("Количество кубиков в последней ступеньке у максимально высокой лестницы, \nкоторую можно построить из введённого числа кубиков = " + cubesForStairs + ".\n");	
            	} else {System.out.println("Вы ввели 0 или отрицательное число!\n");}           		
        	} catch (Exception e) {System.out.println("Вы ввели буквы и/или иные символы, не являющиеся числами!\n"); calculation();}	
    	}
      }
}
