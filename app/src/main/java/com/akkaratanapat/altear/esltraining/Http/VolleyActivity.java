package com.akkaratanapat.altear.esltraining.Http;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.Toast;

import com.akkaratanapat.altear.esltraining.R;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class VolleyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volley);
        responseJsonFromWeb();
    }

    public void responseJsonFromWeb(){
        String url = "http://localhost:8888";

        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                        //StringJson
                        try{
                            String resultStringJson = response.getString("resultString");
                            Log.i("s",resultStringJson);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        //JsonObject
                        try{
                            JSONObject resultObjectJSON = response.getJSONObject("resultObject");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        //JsonArray
                        try{
                            JSONArray resultArrayJSON = response.getJSONArray("user");
                            JSONObject resultObject = resultArrayJSON.getJSONObject(0);
                            String user = resultObject.getString("user");
                            String age = resultObject.getString("age");
                            Toast.makeText(getBaseContext(),user +" : " + age,Toast.LENGTH_SHORT).show();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
                    }
                });
        RequestQueue myrequestQueue = Volley.newRequestQueue(this);
        myrequestQueue.add(jsObjRequest);
    }
}
