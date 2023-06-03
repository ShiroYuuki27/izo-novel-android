package com.sata.izonovel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.sata.izonovel.Model.InsertResponseModel;
import com.sata.izonovel.Model.RegisterRequestModel;
import com.sata.izonovel.Retrofit.APIService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {
    EditText etFirstname, etLastName, etPassword, etEmail;
    Button btnRegister, btnCancelRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etFirstname = findViewById(R.id.et_firs_name);
        etLastName = findViewById(R.id.et_last_name);
        etPassword = findViewById(R.id.et_password);
        etEmail = findViewById(R.id.et_email);
        btnRegister = findViewById(R.id.btn_register_submit);
        btnCancelRegister = findViewById(R.id.btn_cancel_register);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSubmitRegister();
            }
        });
    }

    private  void  onSubmitRegister(){
        RegisterRequestModel registerRequestModel = new RegisterRequestModel();
        registerRequestModel.setDataSource("Cluster0");
        registerRequestModel.setDatabase("izonovel");
        registerRequestModel.setCollection("users");

        RegisterRequestModel.Document document = new RegisterRequestModel.Document();
        String FullName = etFirstname.getText().toString() +" "+ etLastName.getText().toString();
        document.setFullName(FullName);
        document.setUsername(etEmail.getText().toString());
        document.setPassword(etPassword.getText().toString());

        registerRequestModel.setDocument(document);


        APIService.endpoint().registerUser(registerRequestModel).enqueue(new Callback<InsertResponseModel>() {
            @Override
            public void onResponse(Call<InsertResponseModel> call, Response<InsertResponseModel> response) {

            }

            @Override
            public void onFailure(Call<InsertResponseModel> call, Throwable t) {
                Log.d("TES GAGAL", t.toString());
            }
        });
    }

}