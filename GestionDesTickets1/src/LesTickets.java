import java.util.*;
import javax.swing.*;
public class LesTickets {
    private ArrayList<Ticket> lt;
    
    public LesTickets()
    {
        this.lt=new ArrayList<Ticket> ();
        //initTickets();
    }
    
    public void initTickets()
    {
        Ticket t;
        t= new Ticket(10, "Logiciel", "Netbeans");
        t.setDescriptif("Nom du projet en rouge");
        t.setPhoto(new ImageIcon(getClass().getResource("/img/photo1.png")));
        ajoutTicket(t);
        
        t= new Ticket(11, "Logiciel", "Netbeans");
        t.setDescriptif("instruction soulignée en rouge");
        t.setPhoto(new ImageIcon(getClass().getResource("/img/photo2.png")));
        ajoutTicket(t);
      
        t= new Ticket(20, "Langage", "Langage java");
        t.setDescriptif("Dans quelle package se trouve la classe ArrayList<T> ?" );
        ajoutTicket(t);
        
        t= new Ticket(30, "Langage", "Langage C");
        t.setDescriptif("Comment déclare-t-on un pointeur sur entier ?");
        ajoutTicket(t);
    }
    
    public void ajoutTicket(Ticket t)
    {
        this.lt.add(t);
    }
    
    public int getNbTickets()
    {
        return this.lt.size();
    }
    
    public Ticket getTicket(int ind)
    {
        if (ind >=0 && ind< this.lt.size())
            return this.lt.get(ind);
        else return null;
    }
    
     public Ticket getTicketReference(int ref)
    {   Ticket tc = null;
        for (int i=0; i<this.lt.size(); i++)
            if (this.lt.get(i).getReference()==ref)
                tc=this.lt.get(i);
        return tc;
    }
     
    public ArrayList<String> getListeLibelles ()
    { ArrayList<String> ll= new ArrayList<String> ();
    for (int i=0; i< lt.size(); i++)
    { String l = this.lt.get(i).getLibelle();
    boolean trouve=false;
    for( int j=0; j< ll.size(); j++)
        if (ll.get(j).equals(l)) trouve=true;
    if (! trouve) ll.add(l);
    }
    return ll;
    }
    
    public LesTickets getTicketsLibelle (String l)
    {
        LesTickets lp = new LesTickets();
        for(int i=0; i<this.lt.size(); i++)
            if(this.lt.get(i).getLibelle().equals(l))
                lp.ajoutTicket(this.lt.get(i));
        return lp;
    }
    
    public LesTickets getTicketsLogiciel()
    {
        LesTickets lp = new LesTickets();
        for(int i=0; i<this.lt.size(); i++)
            if(this.lt.get(i).getCategorie().equals("Logiciel"))
                lp.ajoutTicket(this.lt.get(i));
        return lp;
    }

    public LesTickets getTicketsLangage()
    {
        LesTickets lp = new LesTickets();
        for(int i=0; i<this.lt.size(); i++)
            if(this.lt.get(i).getCategorie().equals("Langage"))
                lp.ajoutTicket(this.lt.get(i));
        return lp;
    }
    @Override
    public String toString() {
        String s="";
        for (int i=0; i<lt.size(); i++)
        {
            s+="\n\nTicket N°"+i;
            s+=lt.get(i).toString();
        }
        return s;
    }
        
      
}
