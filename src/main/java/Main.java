import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    static PhoneBook phoneBook;
    public static void main(String[] args){

        phoneBook=new PhoneBook();
        phoneBook.adauga(new Contacte("Andrei","0712345678"));
        phoneBook.adauga(new Contacte("Alex","0712345677"));
        phoneBook.adauga(new Contacte("Diana","0712345690"));
        phoneBook.adauga(new Contacte("Stefan","0712334455"));
        phoneBook.afisare();

/*ArrayList<Contacte> contactes=phoneBook.afisare();
    for (Contacte contacte:contactes) {
            System.out.println(contacte.toString());
    }*/


        while (true){
            System.out.println("Introtuceti 1 pentru a adauga un contact, 2 pentru a sterge un contact, 3 pentru a afisa lista de contacte, 4 pentru a edita un contact sau 5 pentru a cauta un contact");
            Scanner reader =new Scanner(System.in);
            int number=reader.nextInt();
            switch (number){
                case 1:adaugaUnNumar();
                    break;

                case 2:stergeUnNumar();
                    break;
                case 3:afiseazaContacte();
                    break;
                case 4: editeazaUnContact();
                    break;
                case 5: cautaUnContact();
                    break;
            }}


/*phoneBook.sterge(new Contacte("Andrei", "0712345678"));
phoneBook.afisare();
phoneBook.editeazaContact(new Contacte("Alex","0712345688"));
phoneBook.afisare();
phoneBook.cauta(new Contacte("Diana","0712345690"));
phoneBook.afisare();
*/

    }

    public static void adaugaUnNumar(){
        String nume;
        String numar;
        System.out.println("Introduceti numele");
        Scanner scan=new Scanner(System.in);
        nume=scan.nextLine();
        System.out.println("Introduceti numarul");
        numar=scan.nextLine();
        Contacte contacte=new Contacte(nume,numar);
        //adauga un numar
        phoneBook.adauga(contacte);
        System.out.println(contacte);

    }

    public static void stergeUnNumar(){
        String nume;
        String numar;
        System.out.println("Introduceti numele");
        Scanner scan=new Scanner(System.in);
        nume=scan.nextLine();
        System.out.println("Introduceti numarul");
        numar=scan.nextLine();
        Contacte contacte=new Contacte(nume,numar);
        //sterge un contact
        phoneBook.sterge(contacte);
        System.out.println(contacte);
    }

    public static void afiseazaContacte(){
        for (Contacte contact:phoneBook.afisare()) {
            System.out.println(contact);
        }
    }

    public static void editeazaUnContact(){
        String nume;
        String numar;
        System.out.println("Introduceti numele");
        Scanner scan=new Scanner(System.in);
        nume=scan.nextLine();
        System.out.println("Introduceti numarul");
        numar=scan.nextLine();
        Contacte contacte=new Contacte(nume,numar);
        //editeaza contactul
        phoneBook.editeazaContact(contacte);
        System.out.println(contacte);
    }

    public static void cautaUnContact(){
        String nume;
        String numar;
        System.out.println("Introduceti numele");
        Scanner scan=new Scanner(System.in);
        nume=scan.nextLine();
        System.out.println("Introduceti numarul");
        numar=scan.nextLine();
        Contacte contacte=new Contacte(nume,numar);
        //metoda de cautare
        phoneBook.cauta(contacte);
        System.out.println(contacte);
    }

}