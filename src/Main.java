//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> lista1 = new ArrayList<>();
       Student student1 = new Student("marco",16);
       Student student2 = new Student("francesca",15);
       lista1.add(student1);
       lista1.add(student2);

        System.out.println(lista1);

       Student student3 = new Student("paolo",16);
       Student student4 = new Student("vittorio",17);
       Student student5 = new Student("silvia",16);
       Student student6 = new Student("marta",16);

        lista1.add(student3);
        lista1.add(student4);
        lista1.add(student5);
        lista1.add(student6);
        System.out.println(lista1);
    }

}