package com.canalplus.model;



import java.util.ArrayList;

public class ListDesContrats  {  

    private static ListDesContrats mInstance ;
    private ArrayList<Contrat> list = null;

    public static ListDesContrats getInstance() {
        if(mInstance == null)
            mInstance = new ListDesContrats();

        return mInstance;
    }

    private ListDesContrats() {
      list = new ArrayList<Contrat>();
     // Contrat contrat1 = new Contrat(125433, type, adresse, titulaire)
    }
    
    public ArrayList<Contrat> getArray() {
     return this.list;
    }
    
    public void addToArray(Contrat value) {
     list.add(value);
    }
}