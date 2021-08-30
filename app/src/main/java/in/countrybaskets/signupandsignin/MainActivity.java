package in.countrybaskets.signupandsignin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText username,password;
Button signin;
TextView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signup=findViewById(R.id.signup);
        signin=findViewById(R.id.signin);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uuser=username.getText().toString();
                String upass=password.getText().toString();
                userdata ud=new userdata();
                String euser=ud.getUsername();
                String epass=ud.getPassword();

                if(uuser.equals("")|| upass.equals("")){
                    Toast.makeText(MainActivity.this, "fill required fields", Toast.LENGTH_SHORT).show();
                }else{
                    if(!uuser.equals(euser) || !upass.equals(epass)){
                        Toast.makeText(MainActivity.this, "invalid credentials", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "signin successful", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,home.class);
                    startActivity(i);
                    finish();
                    }
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent i=new Intent(MainActivity.this,Signup.class);
            startActivity(i);
            finish();
            }
        });
    }
}