package com.gerbendenboer.toptabtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.gerbendenboer.toptabtest.Calendar.CalendarHelper;
import com.gerbendenboer.toptabtest.Calendar.CustomOnItemSelectedListener;

import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class CalendarActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Spinner calendarIdSpinner;
    private Spinner minute_spinner;
    private Integer minute_integer;
    private EditText hour_text;
    private long hour_text_milisec;
    private long appointment_time;
    private Hashtable<String,String> calendarIdTable;
    private Button newEventButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calendarIdSpinner = (Spinner) findViewById(R.id.calendarid_spinner);
        minute_spinner = (Spinner) findViewById(R.id.minutespinner);

        hour_text = (EditText) findViewById(R.id.hourtext);

        newEventButton = (Button) findViewById(R.id.newevent_button);

        newEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CalendarHelper.haveCalendarReadWritePermissions(CalendarActivity.this))
                {
                    addNewEvent();
                }
                else
                {
                    CalendarHelper.requestCalendarReadWritePermission(CalendarActivity.this);
                }
            }
        });

        calendarIdSpinner.setOnItemSelectedListener(new CustomOnItemSelectedListener());

        if (CalendarHelper.haveCalendarReadWritePermissions(this))
        {
            //Load calendars
            calendarIdTable = CalendarHelper.listCalendarId(this);

            updateCalendarIdSpinner();
        }
    }

    private void updateCalendarIdSpinner()
    {
        if (calendarIdTable==null)
        {
            return;
        }

        List<String> list = new ArrayList<String>();

        Enumeration e = calendarIdTable.keys();
        while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            list.add(key);
        }

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        calendarIdSpinner.setAdapter(dataAdapter);
    }
    private void addNewEvent()
    {
        if (calendarIdTable==null)
        {
            Toast.makeText(this, (String)"No calendars found. Please ensure at least one google account has been added.",
                    Toast.LENGTH_LONG).show();
            //Load calendars
            calendarIdTable = CalendarHelper.listCalendarId(this);

            updateCalendarIdSpinner();

            return;
        }

        if (hour_text.getText().toString().matches("[0-9]+") && hour_text.getText().toString().length() > 0){

            String calendarString = calendarIdSpinner.getSelectedItem().toString();
            int calendar_id = Integer.parseInt(calendarIdTable.get(calendarString));

            hour_text_milisec = 1000 * 60 * 60 * Integer.parseInt(hour_text.getText().toString());
            minute_integer =  1000 * 60 * Integer.valueOf(minute_spinner.getSelectedItem().toString());

            appointment_time = hour_text_milisec + minute_integer;

            CalendarHelper.MakeNewCalendarEntry(this, "Do not forget to pick up your bicylce!", "Check the Fietsen in Rotterdam application to check where you placed you bicylce", "",
                    new Date().getTime() + appointment_time , new Date().getTime() + appointment_time + 1000 * 60 * 5 , false, true,calendar_id, 3);

            Toast.makeText(this, (String)"Appointment made on " + hour_text.getText().toString() + " hours from now",
                    Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this, (String)"You did not enter a valid value",
                    Toast.LENGTH_LONG).show();
        }}

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

        if (requestCode==CalendarHelper.CALENDARHELPER_PERMISSION_REQUEST_CODE)
        {
            if (CalendarHelper.haveCalendarReadWritePermissions(this))
            {
                Toast.makeText(this, (String)"Have Calendar Read/Write Permission.",
                        Toast.LENGTH_LONG).show();
            }

        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}
