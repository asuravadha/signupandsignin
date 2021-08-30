package in.countrybaskets.signupandsignin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class date extends AppCompatActivity {
DatePicker datepicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        datepicker=findViewById(R.id.datepicker);
        Calendar calender=Calendar.getInstance();
        datepicker.init(calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int y, int m, int d) {
                m+=1;
                Toast.makeText(date.this, " "+d+"/"+m+"/"+y, Toast.LENGTH_SHORT).show();
            }
        });
    }
}