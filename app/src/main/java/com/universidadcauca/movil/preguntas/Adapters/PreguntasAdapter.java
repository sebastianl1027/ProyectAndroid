package com.universidadcauca.movil.preguntas.Adapters;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.universidadcauca.movil.preguntas.Preguntas;
import com.universidadcauca.movil.preguntas.R;


import java.util.List;

/**
 * Created by Sebastian on 01/04/2015.
 */
public class PreguntasAdapter extends BaseAdapter{

    Context context;
    List<Preguntas> data;



    public PreguntasAdapter(Context context, List<Preguntas> data){

        this.context = context;
        this.data = data;

    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;

        if(convertView == null)
            v = View.inflate(context, R.layout.template_preguntas, null);
        else
            v = convertView;

        Preguntas g = (Preguntas) getItem(position);

        TextView pre = (TextView) v.findViewById(R.id.pregunta);
        pre.setText(g.getpreguntas());

        pre = (TextView) v.findViewById(R.id.categoria);
        pre.setText(g.getCategoria());

        pre = (TextView) v.findViewById(R.id.nivel_pregunta);
        pre.setText(g.getNivel_Pregunta());

        return v;
    }
}
