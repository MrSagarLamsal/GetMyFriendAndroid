package com.bhawa.getmyfriendandroid;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Login extends Fragment implements View.OnClickListener {

    Activity context;
    EditText userNameL,passwordL;
    Button login;
    public Login() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        context =getActivity();
        userNameL=view.findViewById(R.id.username);
        passwordL=view.findViewById(R.id.passsword);
        login=view.findViewById(R.id.login);
        login.setOnClickListener(this);
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onClick(View view) {
        checkUser();
    }

    private void checkUser() {
        SharedPreferences sharedPreferences= context.getSharedPreferences("User", Context.MODE_PRIVATE);
        String username=sharedPreferences.getString("username","");
        String password=sharedPreferences.getString("password","");
        if (username.equals(userNameL.getText().toString())||
                password.equals(passwordL.getText().toString())){
            Toast.makeText(context, "Login Succeed", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(context,DashBoard.class);
            startActivity(intent);

        }else{
            Toast.makeText(context, "Login Failed, Check again the login Description", Toast.LENGTH_SHORT).show();
        }

    }
}