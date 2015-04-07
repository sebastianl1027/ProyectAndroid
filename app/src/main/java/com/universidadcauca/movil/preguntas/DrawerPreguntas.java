package com.universidadcauca.movil.preguntas;

import android.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.universidadcauca.movil.preguntas.PreguntaFragment.ListaFragment;


public class DrawerPreguntas extends ActionBarActivity implements ListaFragment.ListaInterface {

    DrawerLayout drawer;
    ListaFragment listaF;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_preguntas);

        drawer = (DrawerLayout) findViewById(R.id.drawer);

        listaF =  (ListaFragment)getSupportFragmentManager().findFragmentById(R.id.list_fragement);
        listaF.init(this);
    }

    @Override
    public void setItem(int pos) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ft.replace(R.id.container,preguntas);
        ft.commit();
        drawer.closeDrawer();
    }
}
