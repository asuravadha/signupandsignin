package in.countrybaskets.signupandsignin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class gridview extends AppCompatActivity {
GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        gridView=findViewById(R.id.gridview);
        final ArrayList<String> arrayList=new ArrayList<String>();

        arrayList.add("hi");
        arrayList.add("i am");
        arrayList.add("eswar");
        arrayList.add("hi");
        arrayList.add("i am");
        arrayList.add("eswar");
        arrayList.add("hi");
        arrayList.add("i am");
        arrayList.add("eswar");
        arrayList.add("hi");
        arrayList.add("i am");
        arrayList.add("eswar");
        arrayList.add("hi");
        arrayList.add("i am");
        arrayList.add("eswar");
        arrayList.add("hi");
        arrayList.add("i am");
        arrayList.add("eswar");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,arrayList);
        gridView.setAdapter(arrayAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(gridview.this, "you clicked "+arrayList.get(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}