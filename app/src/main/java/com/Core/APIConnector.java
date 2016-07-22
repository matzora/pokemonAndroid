package com.Core;

import android.app.Application;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.Entity.Attack;
import com.Entity.Pokemon;
import com.Entity.Type;
import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
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
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.example.mathieu.pokemon.StartPage;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Mathieu on 21/07/2016.
 */
public class APIConnector {

    public RequestQueue queue;
    protected Context context;
    public HashMap<String,String> apiRoutes;

    protected String apiIP = "http://5.39.88.6/api";
    protected String apiRoute = "/routes/";

    protected Context currentContext;
    protected PokemonCore pokemonCore;

    ProgressDialog progress;

    public APIConnector(PokemonCore _pokemonCore) {

        pokemonCore = _pokemonCore;
        apiRoutes = new HashMap<String,String>();
        context = MyApplication.get();

// Instantiate the cache
        Cache cache = new DiskBasedCache(context.getCacheDir() , 1024 * 1024); // 1MB cap

// Set up the network to use HttpURLConnection as the HTTP client.
        Network network = new BasicNetwork(new HurlStack());

// Instantiate the RequestQueue.
        queue = new RequestQueue(cache, network);

        queue.start();
    }

    public boolean getApiRoutes(Context _context)
    {
        currentContext = _context;
        String uri = apiIP + apiRoute;

        JsonObjectRequest jsonRequest = new JsonObjectRequest
                (Request.Method.POST, uri, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // the response is already constructed as a JSONObject!
                        //Toast.makeText(context,response.toString(),Toast.LENGTH_LONG).show();

                        Iterator iter = response.keys();
                        while(iter.hasNext()){
                            String key = (String)iter.next();
                            String value = null;
                            try {
                                value = response.getString(key);
                                PokemonCore.getInstance().apiConnector.apiRoutes.put(key,value);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        progress = new ProgressDialog(context);
                        progress.setMessage("Downloading Music :) ");
                        progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                        progress.setIndeterminate(true);
                        progress.setProgress(0);
                        progress.show();

                        getPokemons(context);
                        getTypes(context);
                        getAttacks(context);

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(context,error.getMessage(),Toast.LENGTH_LONG).show();
                        error.printStackTrace();
                    }
                });

        queue.add(jsonRequest);
        return true;
    }

    public boolean getPokemons(Context _context)
    {
        String uri = apiIP + apiRoutes.get("pokemon");
        JsonArrayRequest jsonRequest = new JsonArrayRequest
                (Request.Method.POST, uri, null, new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                        Toast.makeText(context,"POKEMON RECEIVED",Toast.LENGTH_LONG).show();

                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject jo = response.getJSONObject(i);

                                Gson gson = new Gson();

                                Pokemon pkm = gson.fromJson(jo.toString(), Pokemon.class);

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }

                        if(pokemonCore.areInitialRequestEnded())
                        {
                            pokemonCore.openStartPage(context);
                        }

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(context,error.getMessage(),Toast.LENGTH_LONG).show();
                        error.printStackTrace();
                    }
                });

        queue.add(jsonRequest);
        return true;
    }

    public boolean getTypes(Context _context)
    {
        String uri = apiIP + apiRoutes.get("type");
        JsonArrayRequest jsonRequest = new JsonArrayRequest
                (Request.Method.POST, uri, null, new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Toast.makeText(context,"TYPE RECEIVED",Toast.LENGTH_LONG).show();

                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject jo = response.getJSONObject(i);

                                Gson gson = new Gson();

                                Type type = gson.fromJson(jo.toString(), Type.class);

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }

                        if(pokemonCore.areInitialRequestEnded())
                        {
                            pokemonCore.openStartPage(context);
                        }

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(context,error.getMessage(),Toast.LENGTH_LONG).show();
                        error.printStackTrace();
                    }
                });

        queue.add(jsonRequest);
        return true;
    }

    public boolean getAttacks(Context _context)
    {
        String uri = apiIP + apiRoutes.get("attack");
        JsonArrayRequest jsonRequest = new JsonArrayRequest
                (Request.Method.POST, uri, null, new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Toast.makeText(context,"ATTACK RECEIVED",Toast.LENGTH_LONG).show();

                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject jo = response.getJSONObject(i);

                                Gson gson = new Gson();

                                Attack atk = gson.fromJson(jo.toString(), Attack.class);

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        if(pokemonCore.areInitialRequestEnded())
                        {
                            pokemonCore.openStartPage(context);
                        }

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(context,error.getMessage(),Toast.LENGTH_LONG).show();
                        error.printStackTrace();
                    }
                });

        queue.add(jsonRequest);
        return true;
    }
}