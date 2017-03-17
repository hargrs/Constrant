package com.example.hargr.constrant;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //lista de imagens
        ArrayList<Itens_home> lista = new ArrayList<Itens_home>();
        Itens_home img1 = new Itens_home(R.drawable.cabelos);
        Itens_home img2 = new Itens_home(R.drawable.estetica);
        Itens_home img3 = new Itens_home(R.drawable.manicure);
        Itens_home img4 = new Itens_home(R.drawable.maqueagem);
        Itens_home img5 = new Itens_home(R.drawable.penteados);

        lista.add(img1);
        lista.add(img2);
        lista.add(img3);
        lista.add(img4);
        lista.add(img5);

        ListAdapterItens adapterItens = new ListAdapterItens(this, lista);
        ListView listView = (ListView) findViewById(R.id.listImagem);
        listView.setAdapter(adapterItens);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_dados) {
            // Handle the camera action
        } else if (id == R.id.nav_agenda) {

        } else if (id == R.id.nav_promocoes) {

        } else if (id == R.id.nav_relatorios) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
