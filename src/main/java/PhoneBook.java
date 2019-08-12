import java.util.ArrayList;

public class PhoneBook {
    ArrayList<Contacte> listaContacte = new ArrayList<Contacte>();

    public void adauga(Contacte contacte){
        this.listaContacte.add(contacte);
    }

    public void sterge(Contacte contacte){
        listaContacte.remove(contacte);
    }

    public void editeazaContact(Contacte contacte){
        for (Contacte contact: listaContacte) {
            if((contact.name).equals(contacte.name)){
                contact.telephoneNumber=contacte.telephoneNumber;
            }
        }
    }

    public ArrayList<Contacte> afisare(){
        return listaContacte;
    }

    public Contacte cauta(Contacte contacte){

        for (Contacte contact: listaContacte) {
            if((contacte.name).equals(contacte.name)&&(contacte.telephoneNumber).equals(contact.telephoneNumber))
                return contacte;
        }
        return null;
    }
}
