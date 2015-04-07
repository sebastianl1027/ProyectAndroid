package com.universidadcauca.movil.preguntas;


import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    ListView list;
    String preguntas[];
    ArrayAdapter<String> adapter;


    AutoCompleteTextView autoCompleteTextView;
    String [] Buscar_Pregunta;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        list = (ListView) findViewById(R.id.list);
        list.setOnItemClickListener(this);

        preguntas = getResources().getStringArray(R.array.Preguntas);

        //adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, preguntas);
        adapter = new ArrayAdapter<String>(this, R.layout.tamplate_preguntas,R.id.pre, preguntas);

        list.setAdapter(adapter);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.pregunte);
        Buscar_Pregunta = getResources().getStringArray(R.array.Buscar_Pregunta);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Buscar_Pregunta);
        autoCompleteTextView.setAdapter(adapter);


        FrameLayout container2 = (FrameLayout) findViewById(R.id.container2);
        //FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        //ft.replace(R.id.container1);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, preguntas[position],Toast.LENGTH_SHORT).show();
    }


}
