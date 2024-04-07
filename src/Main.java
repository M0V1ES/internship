import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
    Case1 case1 = new Case1();
    }


}

class Case1{
    public Case1(){
        Map<String, String> row1 = new HashMap<>();
        List<Map<String,String>> table = new ArrayList<Map<String,String>>();
        row1.put("Имя", "Кирилл");
        row1.put("Возраст", "26");
        row1.put("Должность", "мидл");
        row1.put("Зарплата", "15000 руб");
        table.add(row1);

        Map<String, String> row2 = new HashMap<>();
        row2.put("Имя", "Виталий");
        row2.put("Возраст", "28");
        row2.put("Должность", "Сеньор");
        row2.put("Зарплата", "2000 $");
        table.add(row2);

        Map<String, String> row3 = new HashMap<>();
        row3.put("Имя", "Александр");
        row3.put("Возраст", "31");
        row3.put("Должность", "Джуниор");
        row3.put("Зарплата", "50000 руб");
        table.add(row3);

        Map<String, String> row4 = new HashMap<>();
        row4.put("Имя", "Дементий");
        row4.put("Возраст", "35");
        row4.put("Должность", "девопс");
        row4.put("Зарплата", "1500 $");
        table.add(row4);

        System.out.println(SortbyAge(table));
        System.out.println(SalaryinRub(table));
        System.out.println(MeanAge(table));

    }

    public static List<Map<String,String>> SortbyAge( List<Map<String,String>>table){
        List<Map<String,String>> sortedTable = new ArrayList<>();
        for (int i = 0; i < table.size(); i++) {
            if(Integer.parseInt(table.get(i).get("Возраст")) < 30){
                sortedTable.add(table.get(i));
            }
        }
        return sortedTable;
    }

    public static List<Map<String,String>> SalaryinRub( List<Map<String,String>> table ){
        List<Map<String,String>> sortedTable = new ArrayList<>();
        for (int i = 0; i < table.size(); i++) {
            if (table.get(i).get("Зарплата").split(" ")[1].equals("руб")){
                sortedTable.add(table.get(i));
            }

        }
        return sortedTable;
    }

    public static int MeanAge(List<Map<String,String>> table){
        int age = 0;
        for (int i = 0; i < table.size(); i++) {
            age += Integer.parseInt(table.get(i).get("Возраст"));
        }
        return (age / table.size());
    }
}