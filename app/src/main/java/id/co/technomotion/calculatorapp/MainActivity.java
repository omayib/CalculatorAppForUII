package id.co.technomotion.calculatorapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    /**
     * =====================
     *         STEP 1
     * =====================
     * declare your view which will be controlled from here
     * */
    Button btnAdd,btnMinus,btnMultiply,btnDevide;
    EditText input1,input2, output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAdd= (Button) findViewById(R.id.buttonAdd);
        btnMinus= (Button) findViewById(R.id.buttonMinus);
        btnMultiply= (Button) findViewById(R.id.buttonMultiply);
        btnDevide= (Button) findViewById(R.id.buttonDevide);

        input1= (EditText) findViewById(R.id.angka1);
        input2= (EditText) findViewById(R.id.angka2);
        output= (EditText) findViewById(R.id.editTextOutput);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a1 = input1.getText().toString();
                String a2 = input2.getText().toString();

                if (a1.isEmpty()) {
                    Toast.makeText(getApplication(), "input 1 wajib diisi", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (a2.isEmpty()) {
                    Toast.makeText(getApplication(), "input 2 wajib diisi", Toast.LENGTH_SHORT).show();
                    return;
                }

                output.setText(Calculator.add(a1,a2));


            }
        });

















    }

}
