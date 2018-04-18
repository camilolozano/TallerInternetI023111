package com.example.camilolozano.tallerinterneti023111.Parser;

import com.example.camilolozano.tallerinterneti023111.Models.Users;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by camilolozano on 17/04/18.
 */

public class dataUser {

    public static List<Users> getData(String content) throws JSONException {

        JSONArray jsonArray = new JSONArray(content);
        List<Users> postList = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++){

            JSONObject item = jsonArray.getJSONObject(i);

            Users users = new Users();
            users.setCodigo(item.getString("codigo"));
            users.setNombre(item.getString("nombre"));
            users.setEdad(item.getString("edad"));
            users.setCorreo(item.getString("correo"));
            users.setPass(item.getString("pass"));

            postList.add(users);

        }

        return postList;
    }

}
