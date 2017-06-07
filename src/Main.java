import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Создаем коллекцию
		List<Detail> details = new ArrayList<Detail>();
		//Генерируем детали типа комплектующие
		for (int i = 0; i < 6; i++) {
			details.add(new Detail("железо", "комплектующее", i * 10 + 10, i * 111 + 24));
		}
		//Генерируем детали типа инструменты
		for (int i = 0; i < 4; i++) {
			details.add(new Detail("алюминий", "инструменты", i * 23 + 10, i * 143 + 24));
		}
		//Выводим список имеющихся деталей
		System.out.println("\nСписок имеющихся деталей");
		for (Detail d:details) {
			System.out.println(d);
		}
		//Инициализируем scanner для считывания с консоли
		Scanner scanner = new Scanner(System.in);
		//Булевский флажок, чтобы знать когда выйти из цикла
		boolean rightInput = false;
		String purpose = null;
		//Пока назначение введено неправильно
		while (!rightInput) {
			System.out.println("\nВведите назначение(инструменты/комплектующее):");
			//считываем назначение, приводим к нижнему регистру
			purpose = scanner.nextLine().toLowerCase();
			//смотрим правильно ли введено назначение
			if (purpose.equals("комплектующее") || purpose.equals("инструменты")) {
				//Изменяем булевский флажок
				rightInput = true;
				//переходим к следующей итерации
				continue;
			}
			System.out.println("Назначение введено неправильно!");
		}

		//Используем интерфейс Iterator чтоы пройтись по всем элементам коллекции
		for (Iterator<Detail> detail = details.iterator(); detail.hasNext();) {
			//Если назначение совпадает с введеным назначением
			if (detail.next().getPurpose().compareTo(purpose) == 0) {
				//Удаляем деталь
				detail.remove();
			}
		}

		//Выводим список оставшихся деталей
		System.out.println("\nОставшиеся детали:");
		for (Detail d:details) {
			System.out.println(d);
		}
	}
}
