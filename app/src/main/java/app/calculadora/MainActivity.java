package app.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text_answer;
    private TextView text_uno;
    private TextView text_dos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bttsuma = findViewById(R.id.boton1);
        bttsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_answer.setText(sumar(Integer.parseInt(text_uno.getText().toString().toString()),Integer.parseInt(text_dos.getText().toString()))+"");

            }
        });
        Button bttresta = findViewById(R.id.boton2);
        bttresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_answer.setText(restar(Integer.parseInt(text_uno.getText().toString().toString()),Integer.parseInt(text_dos.getText().toString()))+"");
            }
        });
        Button bttmulti = findViewById(R.id.boton3);
        bttmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_answer.setText(multiplicar(Integer.parseInt(text_uno.getText().toString().toString()),Integer.parseInt(text_dos.getText().toString()))+"");

            }
        });
        Button bttdivision = findViewById(R.id.boton4);
        bttdivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_answer.setText(dividir(Integer.parseInt(text_uno.getText().toString().toString()),Integer.parseInt(text_dos.getText().toString()))+"");
            }
        });
        text_answer=findViewById(R.id.answer);
        text_uno=findViewById(R.id.text1);
        text_dos=findViewById((R.id.text3));

    }

    public double sumar(int a, int b){
            return a+b;
    }

    public double restar(int a, int b){
        return a-b;
    }

    public double multiplicar(int a, int b){
        return a*b;
    }

    public double dividir(int a, int b){
        int retornar=0;
        if(b!=0){
            return a/b;}

        return retornar;

    }

}