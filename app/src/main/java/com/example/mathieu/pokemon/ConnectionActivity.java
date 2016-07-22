package com.example.mathieu.pokemon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.Core.PokemonCore;
import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Mathieu on 24/06/2016.
 */
public class ConnectionActivity extends AppCompatActivity {

    protected String loginTest = "user1";
    protected String passwordTest = "Azerty123";

    protected Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);

        context = getApplicationContext();

        Button attack1 = (Button)findViewById(R.id.connectionBtn);

        attack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //OpenStartPage();
//                Toast toast = null;
//                ConnectionActivity.this.connectToApi(loginTest, passwordTest);
            }
        });
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Boolean result = PokemonCore.getInstance().apiConnector.getApiRoutes(this);
    }
}
