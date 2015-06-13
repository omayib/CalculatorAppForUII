package id.co.technomotion.calculatorapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


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

        /**
         * =====================
         *         STEP 2
         * =====================
         * matching your object using by id
         * */
        btnAdd= (Button) findViewById(R.id.buttonAdd);
        btnDevide= (Button) findViewById(R.id.buttonDevide);
        btnMinus= (Button) findViewById(R.id.buttonMinus);
        btnMultiply= (Button) findViewById(R.id.buttonMultiply);

        input1= (EditText) findViewById(R.id.angka1);
        input2= (EditText) findViewById(R.id.angka2);
        output= (EditText) findViewById(R.id.editTextOutput);

        /**
         * =====================
         *         STEP 3
         * =====================
         * activate each button using setOnClickListener() method
         */
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * =====================
                 *         STEP 4
                 * =====================
                 * create math logic for add two number
                 */
                String a1=input1.getText().toString();
                String a2=input2.getText().toString();

                Double hasil=Double.parseDouble(a1)+Double.parseDouble(a2);

                output.setText(String.valueOf(hasil));
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * =====================
                 *         STEP 5
                 * =====================
                 * create math logic for add two number
                 */
                String a1=input1.getText().toString();
                String a2=input2.getText().toString();

                Double hasil=Double.parseDouble(a1)*Double.parseDouble(a2);

                output.setText(String.valueOf(hasil));
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * =====================
                 *         STEP 6
                 * =====================
                 * create math logic for substract first number by second number
                 */
                String a1=input1.getText().toString();
                String a2=input2.getText().toString();

                Double hasil=Double.parseDouble(a1)-Double.parseDouble(a2);

                output.setText(String.valueOf(hasil));
            }
        });

        btnDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * =====================
                 *         STEP 7
                 * =====================
                 * create math logic for devide two number
                 */

                String a1=input1.getText().toString();
                String a2=input2.getText().toString();

                Double hasil=Double.parseDouble(a1)/Double.parseDouble(a2);

                output.setText(String.valueOf(hasil));
            }
        });












    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
