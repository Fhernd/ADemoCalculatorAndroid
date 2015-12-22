package co.ortizol.ademocalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import co.ortizol.ademocalculator.model.Calculator;
import co.ortizol.ademocalculator.util.Utility;

/**
 * Activity name: CalculatorActivity
 * Layout file: calculator_layout.xml
 * Layout shortcut prefix for idx: cl_
 * Menu file: none
 * Purpose and logic
 * *********************************************
 * 1. Demonstrate business logic for a simple calculator
 * 2. Load the calculator_layout.xml as layout
 * 3. Setup button callbacks
 * 4. Respond to button clicks
 * 5. Read values from edit text controls
 * 6. Perform operation and update result edit control
 */
public class CalculatorActivity extends AppCompatActivity
    implements View.OnClickListener{

    private EditText etxOperand1;
    private EditText etxOperand2;
    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);

        calculator = new Calculator();
        gatherControls();
        setupButtons();
    }

    /**
     * Gather EditText controls.
     */
    private void gatherControls(){
        etxOperand1 = (EditText) findViewById(R.id.etxOperand1);
        etxOperand2 = (EditText) findViewById(R.id.etxOperand2);
        etxOperand1.requestFocus();
    }

    /**
     * Set up buttons of the GUI.
     */
    private void setupButtons(){
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);

        Button btnSubtract = (Button) findViewById(R.id.btnSubstract);
        btnSubtract.setOnClickListener(this);

        Button btnProduct = (Button) findViewById(R.id.btnProduct);
        btnProduct.setOnClickListener(this);

        Button btnDivide = (Button) findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String operand1Str = etxOperand1.getText().toString();
        String operand2Str = etxOperand2.getText().toString();
        double operand1 = Utility.getDouble(operand1Str);
        double operand2 = Utility.getDouble(operand2Str);
        Button btnClicked = (Button) v;
        double result = 0;

        if (btnClicked.getId() == R.id.btnAdd){
            result = calculator.plus(operand1, operand2);
        } else if (btnClicked.getId() == R.id.btnSubstract){
            result = calculator.minus(operand1, operand2);
        } else if (btnClicked.getId() == R.id.btnProduct){
            result = calculator.multiply(operand1, operand2);
        } else if (btnClicked.getId() == R.id.btnDivide){
            result = calculator.divide(operand1, operand2);
        }

        Toast.makeText(this, String.valueOf(result), Toast.LENGTH_LONG).show();
    }
}
