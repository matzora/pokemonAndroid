package com.example.mathieu.pokemon;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.Entity.PokemonTrainer;
import com.Utils.BattleCalculator;

/**
 * Created by Mathieu on 21/06/2016.
 */
public class PokemonBattleFragment extends Fragment {

    protected View view;
    protected PokemonTrainer pokemon;

    ImageView PkmImage;
    TextView Name ;
    TextView Level ;
    ProgressBar progressBar;
    TextView pvTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_pokemon_battle, container, false);

        PkmImage = (ImageView)view.findViewById(R.id.PokemonImage);
        Name = (TextView)view.findViewById(R.id.PokemonNameText);
        Level = (TextView)view.findViewById(R.id.PokemonLevelText);
        progressBar = (ProgressBar)view.findViewById(R.id.lifeProgressBar) ;
        pvTextView = (TextView)view.findViewById(R.id.pvText);

        return view;
    }

    public void setPokemonTrainer(PokemonTrainer pkm)
    {
        this.pokemon = pkm;

        String uriEnnemy = "@drawable/p"+ pokemon.getId();
        int imageResourceEnnemy = getResources().getIdentifier(uriEnnemy, "drawable", StartPage.PACKAGE_NAME);
        PkmImage.setImageResource(imageResourceEnnemy);

        Name.setText(pokemon.getName());
        Level.setText(""+pokemon.getLevel());

        progressBar.setMax(pokemon.getActualPV());
        progressBar.setProgress(pokemon.getBattlePV());
        pvTextView.setText(""+pokemon.getBattlePV() + "/" + pokemon.getActualPV());

    }

    public void updatePokemon()
    {
        progressBar.setProgress(pokemon.getBattlePV());
        pvTextView.setText(""+pokemon.getBattlePV()+"/"+ pokemon.getActualPV());
    }
}
