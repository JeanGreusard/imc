package fr.exemple.indicemasse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPoids;
    private EditText editTextTaille;
    private Button buttonEnvoyer;
    private TextView textViewResultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextPoids=(EditText)findViewById(R.id.editTextPoids);
        editTextTaille=(EditText)findViewById(R.id.editTextTaille);
        buttonEnvoyer=(Button)findViewById(R.id.buttonEnvoyer);
        textViewResultat=(TextView)findViewById(R.id.textViewResultat);
        click_buttonImc();
    }

    private void click_buttonImc()
    {
        buttonEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float recup_poids=Float.parseFloat(editTextPoids.getText().toString());
                Float recup_taille=Float.parseFloat(editTextTaille.getText().toString());
                Float calcul=recup_poids/(recup_taille*recup_taille);

                textViewResultat.setText("le résultat est : "+calcul);

            }
        });
    }


}
