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
public class ConnectionActivity   extends AppCompatActivity {

    protected String loginTest = "user1";
    protected String passwordTest = "Azerty123";

    protected Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);

        Button attack1 = (Button)findViewById(R.id.connectionBtn);

        attack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                context = getApplicationContext();

                Toast toast = null;
                ConnectionActivity.this.connectToApi(loginTest, passwordTest);
            }
        });
    }

    protected void connectToApi(String login, String password)
    {
        // Instantiate the cache
        Cache cache = new DiskBasedCache(getCacheDir(), 1024 * 1024); // 1MB cap

        // Set up the network to use HttpURLConnection as the HTTP client.
        Network network = new BasicNetwork(new HurlStack());

// Instantiate the RequestQueue.
        RequestQueue queue = new RequestQueue(cache, network);

        queue.start();

        String uri = PokemonCore.getInstance().getApiIP() + PokemonCore.getInstance().getLoginUri();
        uri = "http://posttestserver.com/post.php";
// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.POST, uri,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Toast.makeText(context, response, Toast.LENGTH_SHORT).show();

                        OpenStartPage();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                if (error instanceof TimeoutError || error instanceof NoConnectionError) {
                    Toast.makeText(context,"TimeoutError OR NoConnectionError",Toast.LENGTH_LONG).show();
                } else if (error instanceof AuthFailureError) {
                    Toast.makeText(context,"AuthFailureError",Toast.LENGTH_LONG).show();
                } else if (error instanceof ServerError) {
                    Toast.makeText(context,"ServerError",Toast.LENGTH_LONG).show();
                } else if (error instanceof NetworkError) {
                    Toast.makeText(context,"NetworkError",Toast.LENGTH_LONG).show();
                } else if (error instanceof ParseError) {
                    Toast.makeText(context,"ParseError",Toast.LENGTH_LONG).show();
                }
            }
        });
// Add the request to the RequestQueue.
        queue.add(stringRequest);


    }

    protected void OpenStartPage()
    {
        Intent i = new Intent(ConnectionActivity.this, StartPage.class);
        startActivity(i);
    }
}
