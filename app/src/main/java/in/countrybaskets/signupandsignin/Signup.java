package in.countrybaskets.signupandsignin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
EditText username,password;
TextView signin;
Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        signin=findViewById(R.id.signin);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        signup=findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("") || password.getText().toString().equals("")){
                    Toast.makeText(Signup.this, "fill the required fields", Toast.LENGTH_SHORT).show();
                }else{
                    userdata udata=new userdata();
                    udata.setUsername(username.getText().toString());
                    udata.setPassword(password.getText().toString());
                    Toast.makeText(Signup.this, "signup successful", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(Signup.this,MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Signup.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}