package Exercises.hospital;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {

        final int wyjscie = 0;
        final int zapis = 1;
        final int wyswietl = 2;

        Hospital hospital=new Hospital();
        Scanner scanner = new Scanner(System.in);
        int wybór= -1;
        while(wybór != wyjscie){
            System.out.println("Dostępne opcje: ");
            System.out.println("0 - wyjście z programu");
            System.out.println("1 - dodanie pacjenta");
            System.out.println("2 - wyświetlenie listy pacjentów");

            System.out.println("Wybierz opcję: ");
            wybór = scanner.nextInt();
            scanner.nextLine();

            switch(wybór){
                case zapis:
                    Patient patient = new Patient();
                    System.out.println("Podaj imię");
                    patient.setImie(scanner.nextLine());
                    System.out.println("Podaj nazwisko");
                    patient.setNazwisko(scanner.nextLine());
                    System.out.println("i pesel");
                    patient.setPesel(scanner.nextLine());
                    hospital.addPatient(patient);
                    break;
                case wyswietl:
                    hospital.printPatients();
                    break;
                case wyjscie:
                    System.out.println(" dziękujemy  za odwiedziny");

                }
            }
        }



    }

