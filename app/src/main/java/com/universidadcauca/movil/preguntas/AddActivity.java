package com.universidadcauca.movil.preguntas;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.universidadcauca.movil.preguntas.Util.PreguntaUtil;


public class AddActivity extends ActionBarActivity implements View.OnClickListener {

    static final int ADD = 0;
    static final int EDIT = 1;

    EditText pregunta, categoria, nivel_pregunta;
    Button btn;

    int type, pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        getSupportActionBar().setTitle("Agregar Pregunta");

        pregunta = (EditText) findViewById(R.id.pregunta);
        categoria = (EditText) findViewById(R.id.categoria);
        nivel_pregunta = (EditText) findViewById(R.id.nivel_pregunta);

        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(this);

        Bundle extras = getIntent().getExtras();
        if(extras == null){
            type=ADD;
        }else{
            type=EDIT;
            getSupportActionBar().setTitle("Editar Pregunta");

            pos = extras.getInt("pos");

            Preguntas preguntas = PreguntaUtil.data.get(pos);

            pregunta.setText(preguntas.getPreguntas());
            categoria.setText(preguntas.getCategoria());
            nivel_pregunta.setText(preguntas.getNivel_Pregunta());

        }

    }


    @Override
    public void onClick(View v) {

        String a = pregunta.getText().toString();
        String b = categoria.getText().toString();
        String c = nivel_pregunta.getText().toString();

        if(a.equals("") || b.equals("") || c.equals("")){
            Toast.makeText(this,"Llenar todos los campos", Toast.LENGTH_SHORT).show();


        }else{

            if(type==ADD){
                Preguntas preguntas = new Preguntas(a,b,c);
                Preguntas.data.add(preguntas);
            }else{

                Preguntas preguntas = PreguntaUtil.data.get(pos);
                preguntas.setPregunta(a);
                preguntas.setCategoria(b);
                preguntas.setNivel_Pregunta(c);
            }
            finish();
        }

    }
}
