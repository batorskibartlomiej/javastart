package Exercises.hospital;

public class Hospital {

    private final int maxPatientsNumber = 10; //maxymalna liczba pacjentów
    private Patient[] patients = new Patient[maxPatientsNumber]; //tablica na pacjentów
    private int regPatiens = 0; //aktualna liczba pacjentów

    public void addPatient(Patient patient) {
         {
            if (regPatiens <= patients.length) {
                patients[regPatiens] = patient;
                regPatiens++;
            } else {
                System.out.println("limit przekroczony-brak miejsc");
            }
            //dodawanie pacjenta do tablicy
        }
    }

        public void printPatients(){
            for (int i =0; i<regPatiens;i++) {
                System.out.println(patients[i].getImie()+patients[i].getNazwisko()+patients[i].getPesel());

            }

            //wyświetlanie pacjentów
        }
    }
