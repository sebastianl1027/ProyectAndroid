package com.universidadcauca.movil.preguntas.PreguntaFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.universidadcauca.movil.preguntas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListaFragment extends Fragment implements AdapterView.OnItemClickListener {


    public interface ListaInterface{
        public void setItem(int pos);
    }
    ListView list;
    ListaInterface listaI;


    public ListaFragment() {
        // Required empty public constructor
    }

    public void init(ListaInterface listaI){
        this.listaI = listaI;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.listaf, container, false);
        list = (ListView) v.findViewById(R.id.list);
        list.setOnItemClickListener(this);
        return v;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        listaI.setItem(position);


    }
}
