package net.sj.searchablespinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import net.sj.searchablespinnerlib.SearchableSpinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchableSpinner sp = findViewById(R.id.spinner);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Exemplo");
        arrayList.add("Exemplo");
        arrayList.add("Exemplo");

        ArrayAdapter spinnerArrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_dropdown_item,
                arrayList);
        sp.setAdapter(spinnerArrayAdapter);
    }
}
