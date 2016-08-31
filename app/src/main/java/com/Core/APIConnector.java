package com.Core;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;

import com.Entity.Attack;
import com.Entity.Multiplicator;
import com.Entity.Pokemon;
import com.Entity.Type;
import com.Entity.TypeMatrix;
import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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

                        getPokemons(context);
                        getTypes(context);
                        getAttacks(context);
                        getTypeMatrix(context);
                        getMultiplicator(context);

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

                        //Toast.makeText(context,"POKEMON RECEIVED",Toast.LENGTH_LONG).show();

                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject jo = response.getJSONObject(i);

                                Gson gson = new Gson();

                                Pokemon pkm = gson.fromJson(jo.toString(), Pokemon.class);

                                pokemonCore.addPokemon(pkm);

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

                        //Toast.makeText(context,"TYPE RECEIVED",Toast.LENGTH_LONG).show();

                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject jo = response.getJSONObject(i);

                                Gson gson = new Gson();

                                Type type = gson.fromJson(jo.toString(), Type.class);

                                pokemonCore.addType(type);

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

                        //Toast.makeText(context,"ATTACK RECEIVED",Toast.LENGTH_LONG).show();

                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject jo = response.getJSONObject(i);

                                Gson gson = new Gson();

                                Attack atk = gson.fromJson(jo.toString(), Attack.class);

                                pokemonCore.addAttack(atk);

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

    public boolean getTypeMatrix(Context _context)
    {
        String uri = apiIP + apiRoutes.get("typematrix");
        JsonArrayRequest jsonRequest = new JsonArrayRequest
                (Request.Method.POST, uri, null, new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                        //Toast.makeText(context,"ATTACK RECEIVED",Toast.LENGTH_LONG).show();

                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject jo = response.getJSONObject(i);

                                Gson gson = new Gson();

                                TypeMatrix typeMatrix = gson.fromJson(jo.toString(), TypeMatrix.class);

                                //TYPES ATK AND DEF ARE NULL

                                pokemonCore.addTypeMatrix(typeMatrix);

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

    public boolean getMultiplicator(Context _context)
    {
        String uri = apiIP + apiRoutes.get("multiplicator");
        JsonArrayRequest jsonRequest = new JsonArrayRequest
                (Request.Method.POST, uri, null, new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                        //Toast.makeText(context,"ATTACK RECEIVED",Toast.LENGTH_LONG).show();

                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject jo = response.getJSONObject(i);

                                Gson gson = new Gson();

                                Multiplicator mult = gson.fromJson(jo.toString(), Multiplicator.class);

                                pokemonCore.addMultiplicator(mult);

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