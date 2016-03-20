package com.example.rivanildo.projetocarros_rivanildo;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Rivanildo on 19/03/16.
 */
public class CarrosApplication extends Application{

    private List<Carro> carros;
    @Override
    public void onCreate() {
        super.onCreate();
        this.carros = new ArrayList<>();
        criarCarrosPadrao();
    }

    private void criarCarrosPadrao(){
        carros.add(new Carro("Camaro", R.drawable.camaro));
        carros.add(new Carro("Covertte", R.drawable.corvette));
        carros.add(new Carro("Gallardo", R.drawable.gallardo));
        carros.add(new Carro("Mustang", R.drawable.mustang));
        carros.add(new Carro("Porsche", R.drawable.porsche_911));


    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void addCarros(){
        Random random = new Random();
        carros.add(
                carros.get(
                        carros.size() > 1 ? random.nextInt(carros.size() - 1) : 0
                )
        );
    }

    public void removerCarro(int position){
        this.carros.remove(position);
    }
}
