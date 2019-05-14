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
public class Register extends Fragment implements View.OnClickListener {

    Activity context;
    EditText userNameR,passwordR,fName,Lname;
    Button register;
    public Register() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_register, container, false);

        context =getActivity();
        userNameR=view.findViewById(R.id.username);
        passwordR=view.findViewById(R.id.passsword);
        fName=view.findViewById(R.id.Fname);
        Lname=view.findViewById(R.id.Lname);

        register=view.findViewById(R.id.register);
        register.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View view) {
        signUp();
    }

    private void signUp() {
        SharedPreferences sharedPreferences= context.getSharedPreferences("User", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();

        editor.putString("username",userNameR.getText().toString());
        editor.putString("password",passwordR.getText().toString());
        editor.putString("fName",userNameR.getText().toString());
        editor.putString("lName",passwordR.getText().toString());
        editor.commit();
        Toast.makeText(context, "Regisered Succeed", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(context,DashBoard.class);
        startActivity(intent);
    }
}
