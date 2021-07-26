package HomeWork_10;

import java.util.*;

public class HW_10 {

    public static void main(String[] args) {
int counter = 0;
        List<String> list = new ArrayList<>();
        HashSet<String> newList = new HashSet<>();
        list.add("Слон");
        list.add("Жираф");
        list.add("Зебра");
        list.add("Слон");
        list.add("Гепард");
        list.add("Лев");
        list.addAll(Arrays.asList("Бизон", "Тукан", "Леопард", "Слон", "Дракон", "Олень", "Утка", "Лось", "Утка"));
        System.out.print("Исходный массив: ");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i));
            }
        System.out.println("Массив с уникальными значениями: " + newList);
        for (String s : newList){
            for (int j = 0; j < list.size(); j++) {
                if (s.equals(list.get(j)) == true){
                    counter++;
                }

            }
        System.out.println("Слово " + s +" Встречается "+ counter + " раз.");
            counter = 0;
        }
        Phones abonent = new Phones();

        abonent.add("Саша",89814447788L);
        abonent.add("Вася",89625558877L);
        abonent.add("Петя",89648887744L);

        System.out.println(abonent.get("Вася"));

    }
}
