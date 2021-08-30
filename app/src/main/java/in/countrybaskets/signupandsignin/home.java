package in.countrybaskets.signupandsignin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class home extends AppCompatActivity {
Button ctoast,popup,button;
Toast toast;
Spinner spin;
String[]  names={"Eswar","anjali","praksh","prakruthi","anandh","vallabh","hai"};
ListView listView;
TextView contextmenu;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.optioin_menu,menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.i1:
                Toast.makeText(this, " just a nname", Toast.LENGTH_SHORT).show();
                return true;
                case R.id.i2:
                Toast.makeText(this, " just a sweet", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.i1:
                Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.i2:
                Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.i3:
                Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("select any item from below");
        getMenuInflater()
.inflate(R.menu.context_menu,menu);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ctoast=findViewById(R.id.customtoast);
        spin=findViewById(R.id.spinner1);
        popup=findViewById(R.id.popupactivity);
        listView=findViewById(R.id.listview);
        button=findViewById(R.id.popupmenu);
        contextmenu=findViewById(R.id.contextmenu);

        registerForContextMenu(contextmenu);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupmenu=new PopupMenu(getApplicationContext(),button);
                popupmenu.inflate(R.menu.popup_menu);
                popupmenu.show();
                popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()){
                            case R.id.i1:
                                Toast.makeText(home.this, "first", Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.i2:
                                Toast.makeText(home.this, "first", Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.i3:
                                Toast.makeText(home.this, "first", Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.i4:
                                Toast.makeText(home.this, "first", Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.i5:
                                Toast.makeText(home.this, "first", Toast.LENGTH_SHORT).show();
                                return true;
                            default:
                                return  false;
                        }

                    }
                });
            }
        });




        final ArrayList<String> arrayList=new ArrayList<String>();
        for(String i:names){
            arrayList.add(i);
        }



        ArrayAdapter<String> larrayAdapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,arrayList);
        listView.setAdapter(larrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(home.this, " you clicked on "+arrayList.get(i), Toast.LENGTH_SHORT).show();
            }
        });
        popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(home.this,popup.class);
                startActivity(i);
                finish();
            }
        });
        ArrayAdapter arrayAdapter=new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,names);
            arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
            spin.setAdapter(arrayAdapter);


            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(home.this, "welcome "+names[i], Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });


        ctoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toast=Toast.makeText(getApplicationContext(),"",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                View v=getLayoutInflater().inflate(R.layout.toast_custom,(ViewGroup)findViewById(R.id.custom_toast_call));
                toast.setView(v);
                toast.show();
            }
        });



    }
}