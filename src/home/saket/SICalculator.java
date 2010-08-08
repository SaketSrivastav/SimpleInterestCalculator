package home.saket;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SICalculator extends Activity{

	Button calculate;
	Button messageBox;
	EditText principal;
	EditText rate;
	EditText period;
	TextView simpleIntrest;
	TextView siText;
	Context context;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		context = this.getApplicationContext();

		//Get all the UI components

		siText = (TextView)findViewById(R.id.textSimpleIntrest);
		simpleIntrest = (TextView)findViewById(R.id.textSI);

		/*calculate = (Button)findViewById(R.id.buttonCalculate);
		calculate.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				principal = (EditText)findViewById(R.id.pAmount);
				rate = (EditText)findViewById(R.id.rate);
				period = (EditText)findViewById(R.id.period);

				try{
					if(principal.getText().toString().equals("")){
						Toast.makeText(context, "Principal Missing", Toast.LENGTH_SHORT).show();
					}
					else if(rate.getText().toString().equals("")){
						Toast.makeText(context, "Rate Of Intrest Missing", Toast.LENGTH_SHORT).show();
					}
					else if(period.getText().toString().equals("")){
						Toast.makeText(context, "Period Missing", Toast.LENGTH_SHORT).show();
					}	
					else{

						Double p = Double.parseDouble(principal.getText().toString());
						Double r = Double.parseDouble(rate.getText().toString());
						Double t = Double.parseDouble(period.getText().toString());


						Double si;
						System.out.println("P = "+p+"\nR = "+r+"\nT = "+t);

						si = (p*r*t)/100;



						simpleIntrest.setText(si.toString());

						simpleIntrest.setVisibility(TextView.VISIBLE);
						siText.setVisibility(TextView.VISIBLE);
					}
				}catch(Exception e){
					System.out.println("In catch block");
					e.printStackTrace();

				}
			}
		}); */


		messageBox = (Button)findViewById(R.id.box);
		messageBox.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {

				principal = (EditText)findViewById(R.id.pAmount);
				rate = (EditText)findViewById(R.id.rate);
				period = (EditText)findViewById(R.id.period);

				try{
					if(principal.getText().toString().equals("")){
						Toast.makeText(context, "Principal Missing", Toast.LENGTH_SHORT).show();
					}
					else if(rate.getText().toString().equals("")){
						Toast.makeText(context, "Rate Of Intrest Missing", Toast.LENGTH_SHORT).show();
					}
					else if(period.getText().toString().equals("")){
						Toast.makeText(context, "Period Missing", Toast.LENGTH_SHORT).show();
					}	
					else{

						Double p = Double.parseDouble(principal.getText().toString());
						Double r = Double.parseDouble(rate.getText().toString());
						Double t = Double.parseDouble(period.getText().toString());


						Double si;
						System.out.println("P = "+p+"\nR = "+r+"\nT = "+t);

						si = (p*r*t)/100;



						// prepare the alert box
						AlertDialog.Builder alertbox = new AlertDialog.Builder(v.getContext());
						System.out.println("Alert builder");
						// set the message to display
						alertbox.setMessage("Simple Interest = "+si.toString());
						
						// add a neutral button to the alert box and assign a click listener
						
						alertbox.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
							// click listener on the alert box
							public void onClick(DialogInterface arg0, int arg1) {
								// the button was clicked
								Toast.makeText(getApplicationContext(), "Thank You !!!!", Toast.LENGTH_LONG).show();
							}
						});

						// show it
						alertbox.show();
						
						System.out.println("Alert show");

						//	simpleIntrest.setText(si.toString());

						//simpleIntrest.setVisibility(TextView.VISIBLE);
						//siText.setVisibility(TextView.VISIBLE);
					}
				}catch(Exception e){
					System.out.println("In catch block");
					e.printStackTrace();
				}
			}
		});
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		
		System.out.println("In OnStart");
	}
}