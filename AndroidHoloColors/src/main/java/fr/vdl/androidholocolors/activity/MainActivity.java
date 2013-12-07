package fr.vdl.androidholocolors.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import fr.vdl.androidholocolors.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initSpinner();
        initAutoComplete();
        //  initNumberPicker();
    }

    /*
    private void initNumberPicker() {
        NumberPicker numberPicker = (NumberPicker) findViewById(R.id.numberPicker);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(50);
    }
*/

    private void initAutoComplete() {
        AutoCompleteTextView autoComplete = (AutoCompleteTextView) findViewById(R.id.editText3);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_dropdown_item_1line);
        autoComplete.setAdapter(adapter);

    }

    private void initSpinner() {
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void onButtonClick(View v) {
        Intent i = new Intent(MainActivity.this, ListActivity.class);
        startActivity(i);
    }
}
