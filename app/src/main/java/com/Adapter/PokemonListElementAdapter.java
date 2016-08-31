package com.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.Core.MyApplication;
import com.Entity.Pokemon;
import com.Entity.PokemonTrainer;
import com.example.mathieu.pokemon.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mathieu on 22/07/2016.
 */
public class PokemonListElementAdapter extends ArrayAdapter<PokemonTrainer> {

    Context context;
    public ArrayList<Integer> selectedPokemons;

    //tweets est la liste des models à afficher
    public PokemonListElementAdapter(Context context, List<PokemonTrainer> pokemons) {
        super(context, 0, pokemons);

        selectedPokemons = new ArrayList<Integer>();
        context = context;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_pokemon_listelement,parent, false);
        }

        convertView.setBackgroundColor(Color.TRANSPARENT);

        if(convertView.isSelected())
        {
            convertView.setBackgroundColor(Color.GREEN);
        }




        PokemonListElementHolder viewHolder = (PokemonListElementHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new PokemonListElementHolder();
            viewHolder.pseudo = (TextView) convertView.findViewById(R.id.pseudo);
            viewHolder.avatar = (ImageView) convertView.findViewById(R.id.avatar);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Pokemon> pokemon
        Pokemon pkm = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.pseudo.setText(pkm.getName());

        String uriEnnemy = "@drawable/p"+ pkm.getId();
        int imageResourceEnnemy = MyApplication.get().getResources().getIdentifier(uriEnnemy, "drawable", MyApplication.get().getPackageName());

        viewHolder.avatar.setImageResource(imageResourceEnnemy);

        return convertView;
    }

    private class PokemonListElementHolder{
        public TextView pseudo;
        public ImageView avatar;
    }
}
