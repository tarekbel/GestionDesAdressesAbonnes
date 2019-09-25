package com.canalplus.model;

import java.util.ArrayList;
import java.util.List;

public class ListDesAbonnes  {  

    private static ListDesAbonnes mInstance ;
    private ArrayList<Abonne> list = null;

    public static ListDesAbonnes getInstance() {
        if(mInstance == null)
            mInstance = new ListDesAbonnes();

        return mInstance;
    }

    private ListDesAbonnes() {
      list = new ArrayList<Abonne>();
      Contrat ctr1 = new Contrat(145220, 1, "particulier", "Paris", "Mr Tarek");
      List<Contrat> listContratTarek = new ArrayList<Contrat>();
      Contrat ctr2 = new Contrat(145220, 1, "professionelle", "Paris", "Mr Tarek");
      listContratTarek.add(ctr2);
      listContratTarek.add(ctr1);
      Abonne abonne1 = new Abonne(1L,"tarek", "12354", "Nanterre", listContratTarek);
      
      Contrat ctr3 = new Contrat(145820, 2, "particulier", "Paris", "Mr Christian");
      List<Contrat> listContratChristian = new ArrayList<Contrat>();
      Contrat ctr4 = new Contrat(145620, 2, "professionelle", "Paris", "Mr Christian");
      listContratChristian.add(ctr3);
      listContratChristian.add(ctr4);
      Abonne abonne2 = new Abonne(2L,"Christian", "12354", "Paris", listContratChristian);
      list.add(abonne1);
      list.add(abonne2);
    }
    
    public ArrayList<Abonne> getArray() {
     return this.list;
    }
    
    public void addToArray(Abonne value) {
     list.add(value);
    }
}