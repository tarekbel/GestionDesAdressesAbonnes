

package com.canalplus.model;

import java.util.ArrayList;
import java.util.List;

public class ListDesMouvements  {  

    private static ListDesMouvements mInstance ;
    private ArrayList<Mouvement> list = null;

    public static ListDesMouvements getInstance() {
        if(mInstance == null)
            mInstance = new ListDesMouvements();

        return mInstance;
    }

    private ListDesMouvements() {

      list = new ArrayList<Mouvement>();
  
    }
    
    public ArrayList<Mouvement> getArray() {
     return this.list;
    }
    
    public void addToArray(Mouvement value) {
     list.add(value);
    }
}