package com.example.mathieu.pokemon;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.Core.PokemonCore;
import com.Entity.Area;

import java.lang.reflect.Field;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class ScreenSlidePageFragment extends Fragment{

    View myFragmentView;
    Area area;

    public ScreenSlidePageFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myFragmentView = inflater.inflate(R.layout.fragment_screen_slide_page, container, false);

        ImageView imv = (ImageView)myFragmentView.findViewById(R.id.AreaImage);

        String uri = "@drawable/"+area.getPicture_path();

        int imageResource = getResources().getIdentifier(uri, null, StartPage.PACKAGE_NAME);
        imv.setImageResource(imageResource);

        TextView title = (TextView)myFragmentView.findViewById(R.id.TitleAreaText);
        title.setText(area.getName());

        Button btn = (Button)myFragmentView.findViewById(R.id.FightChampionButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BattleActivity.class);

                i.putExtra("player", PokemonCore.getInstance().getPlayer());
                i.putExtra("ennemy", area.getChampion());

                startActivity(i);
            }
        });

        return myFragmentView;
    }

    public void setArea(Area area)
    {
        this.area = area;
    }
}
