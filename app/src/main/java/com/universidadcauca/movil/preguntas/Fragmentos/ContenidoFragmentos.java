package com.universidadcauca.movil.preguntas.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.universidadcauca.movil.preguntas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContenidoFragmentos extends Fragment {


    public ContenidoFragmentos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.contenido_fragmentos, container, false);
    }


}
