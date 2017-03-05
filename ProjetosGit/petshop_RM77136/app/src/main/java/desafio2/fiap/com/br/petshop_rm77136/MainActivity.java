package desafio2.fiap.com.br.petshop_rm77136;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView resultado;
    RadioGroup grupoCachoro;
    CheckBox femea;
    CheckBox adestrado;
    CheckBox vacina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = (TextView) findViewById(R.id.txtValor);

        grupoCachoro = (RadioGroup) findViewById(R.id.grCao);


        femea = (CheckBox) findViewById(R.id.cbFemea);
        adestrado = (CheckBox) findViewById(R.id.cbAdestrado);
        vacina = (CheckBox) findViewById(R.id.cbVacinas);


        final CheckBox checkBox = (CheckBox) findViewById(R.id.cbVacinas);


    }


    public void Calcular (View v) {
        int selected = grupoCachoro.getCheckedRadioButtonId();
        double valor = 0;
        if (selected == R.id.rdPrimeiro){
            valor = 800;
            resultado.setText(""+valor);
        }else if (selected == R.id.rdSegundo){
            valor = 750;
            resultado.setText(""+valor);
        }else if (selected == R.id.rdTerceiro){
            valor = 700;
            resultado.setText(""+valor);
        }else if (selected == R.id.rdQuarto){
            valor = 800;
            resultado.setText(""+valor);
        }

        if (femea.isChecked()){
            valor = valor + 180;
            resultado.setText(""+valor);
        }
        if (adestrado.isChecked()){
            valor = valor + 400;
            resultado.setText(""+valor);
        }
        if (vacina.isChecked()){
            valor = valor + 200;
            resultado.setText(""+valor);
        }




    }

    public void Calcular1 (View v){
        int selected = grupoCachoro.getCheckedRadioButtonId();
        double valor = 0;

        switch (selected){
            case R.id.rdPrimeiro:
                valor = 800;
                resultado.setText(String.valueOf(valor));
                break;
            case R.id.rdSegundo:
                valor = 750;
                resultado.setText(String.valueOf(valor));
                break;
            case R.id.rdTerceiro:
                valor = 700;
                resultado.setText(String.valueOf(valor));
                break;
            case R.id.rdQuarto:
                valor = 800;
                resultado.setText(String.valueOf(valor));
                break;
            default:
        }

        if (femea.isChecked()){
            valor = valor+180;
            resultado.setText(String.valueOf(valor));
        }

        if (adestrado.isChecked()){
            valor = valor+400;
            resultado.setText(String.valueOf(valor));
        }

        if (vacina.isChecked()){
            valor = valor+200;
            resultado.setText(String.valueOf(valor));
        }


    }



}
