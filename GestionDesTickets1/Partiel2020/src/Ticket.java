
import java.awt.*;
import javax.swing.*;

public class Ticket
{
        private int reference;
        private String categorie;
        private String libelle;
        private String descriptif;
        private ImageIcon photo;

        public Ticket(int ref, String cat, String l)
        { 
            this.reference=ref;
            this.categorie=cat;
            this.libelle=l;
            this.descriptif="";
            this.photo=null;
        }
        
        public Ticket()
        { 
            this.reference=-1;
            this.categorie="";
            this.libelle="";
            this.descriptif="";
            this.photo=null;
        }

    public int getReference() {
        return reference;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public ImageIcon getPhoto() { return photo;}            

    public void setReference(int reference) {
        this.reference = reference;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }
      

    public  String toString()
        {
            String s = "";
            s += "\nRéférence : " + this.reference;
            s += "\nCatégorie : " + this.categorie;
            s += "\nLibellé : " + this.libelle;
            s += "\nDescriptif : " + this.descriptif;
            return s;
        }
}

