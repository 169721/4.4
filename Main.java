/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
Zadania do wykonania:
Commit4_1. Zmodyfikuj plik Main i Student tak, aby można było z konsoli dodawać nowego studenta oraz na żądanie wypisać wszystkich studentów z bazy
Commit4_2. Zmodyfikuj plik Main i Student tak, aby można było na żądanie wypisać wszystkich studentów z bazy
Commit4_3. Zmodyfikuj klasę Main i Student oraz dostosuj resztę programu, aby przechowywać dodatkowo datę urodzenia studenta (jako String).
Commit4_4. Zaimplementuj metodę findStudentByName klasy Service.
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int wybor=-1;
    System.out.println("1 - dodaj studenta");
    System.out.println("2 - wypisz wszystkich studnetów");
    System.out.println("0 - wyjście");
    System.out.println("podaj wybór:");
    wybor = scan.nextInt();
    switch(wybor){
      case 1:
        System.out.println("podaj imie studenta:");
        String imie = scan.next();
        System.out.println("podaj nazwisko studenta:");
        String nazwisko = scan.next();
        System.out.println("podaj wiek studenta:");
        int wiek = scan.nextInt();
      try {
      Service s = new Service();
      s.addStudent(new Student(imie ,nazwisko, wiek));
      var students = s.getStudents();
      /*for(Student current : students) {
        System.out.println(current.ToString());
      }*/
    } catch (IOException e) { 

    }
        break;
      case 2:try {
      Service s = new Service();
      

      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) { 

    }
        break;
      case 0: 
        break;
    }
    /*try {
      Service s = new Service();
      s.addStudent(new Student("Krzysztof", 20));
      s.addStudent(new Student("Janusz", 40));

      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) { 

    }*/
  }
}