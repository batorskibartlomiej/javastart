package Exercises.bank;

public class Bank {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.firstName = "Bartek";
        person1.lastName = "Batorski";
        person1.pesel = "84041604177";


        Adress adress1 = new Adress();
        adress1.cityAdress = "warsaw";
        adress1.streetAdress="Ponarska";
        adress1.houseNumber = "7";
        adress1.flatNumber = "20";
        person1.adressZameldowania = adress1;
        person1.adressZamieszkania = adress1;

        Person person2 = new Person();
        person2.firstName = "Mirek";
        person2.lastName = "Batorski";
        person2.pesel = "84041604177";

        person2.adressZamieszkania = new Adress();
        person2.adressZamieszkania.cityAdress = "Warszawa";
        person2.adressZamieszkania.streetAdress= "Sikorskiego";
        person2.adressZamieszkania.flatNumber="6";

        person2.adressZameldowania = new Adress();
        person2.adressZamieszkania.cityAdress="Zamość";


        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 1000;

        Credit credit1 = new Credit();
        credit1.borrower= person1;
        credit1.cashBorrowed = 2000;
        credit1.cashReturned = 1000;
        credit1.interestRate = 0.10;
        credit1.termMonths = 12;

        System.out.println("Osoba "+person1.firstName+" mieszka pod adresem "+person1.adressZamieszkania.cityAdress);




    }
}
