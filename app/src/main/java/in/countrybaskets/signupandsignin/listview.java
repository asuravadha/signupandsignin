package in.countrybaskets.signupandsignin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class listview extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView=findViewById(R.id.listview);
        ArrayList<String>  arrayList=new ArrayList<>();

        arrayList.add("hai");
        arrayList.add("Eswar");
        arrayList.add("laddu");
        arrayList.add("amith");
        arrayList.add("karthik");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,arrayList);
   listView.setAdapter(arrayAdapter);
listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(listview.this, "you clicked on "+arrayList.get(position), Toast.LENGTH_SHORT).show();
    }
});

    }
}