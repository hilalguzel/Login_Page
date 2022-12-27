package com.example.loginapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPasswordActivty extends AppCompatActivity {
    private EditText emailEditText;
    private TextView tvPass;
    private Button resetPasswordButton;

    FirebaseAuth mAuth;
   ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_activty);

        emailEditText = (EditText) findViewById(R.id.inputEmail);
        resetPasswordButton = (Button) findViewById(R.id.btnReset);
        tvPass = (TextView) findViewById(R.id.tvPass);
        progressDialog= new ProgressDialog(this);

        mAuth = FirebaseAuth.getInstance();

        resetPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetPassword();
            }
        });

        tvPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPass();
            }
        });
    }

    private void loginPass() {
        Intent intent = new Intent(ForgotPasswordActivty.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }


    private void resetPassword() {

        String email = emailEditText.getText().toString().trim();

        if(email.isEmpty()){
            emailEditText.setError("Lütfen email giriniz");
            emailEditText.requestFocus();
            return;

        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            emailEditText.setError("Lütfen geçerli bir email giriniz");
            emailEditText.requestFocus();
            return;
        }
        else{
            progressDialog.setMessage("Lütfen hesap oluşturulana kadar bekleyiniz...");
            progressDialog.setTitle("Hesap oluşturuluyor...");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();

            mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if(task.isSuccessful()){
                        progressDialog.dismiss();
                        Toast.makeText(ForgotPasswordActivty.this, "Şifrenizi sıfırlamak için emalinize bakınız",
                                Toast.LENGTH_SHORT).show();
                        sendUserToLoginActivty();
                    }
                    else{
                        progressDialog.dismiss();
                        Toast.makeText(ForgotPasswordActivty.this, "Bir sorun oluştu, tekrar deneyiniz",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

    }

    private void sendUserToLoginActivty() {
        Intent intent = new Intent(ForgotPasswordActivty.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}