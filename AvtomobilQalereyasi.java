package arraylist;

import java.util.LinkedList;

public class AvtomobilQalereyasi {

    public static void main(String[] args) {


        LinkedList<String> masinlar = new LinkedList<>();

        masinlar.add("Mercedes");
        masinlar.add("BMW");
        masinlar.add("Audi");

        masinlar.addFirst("Toyota");
        masinlar.addLast("Lexus");
        System.out.println("Galereyadaki Masinlarin Siyahisi : " + masinlar);

    }


}
