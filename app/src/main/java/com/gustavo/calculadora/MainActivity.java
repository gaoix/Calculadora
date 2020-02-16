package com.gustavo.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Calculadora básica que permite suma, resta, división y multiplicación..
 * @author Gustavo Alfonso
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double numero1, numero2, resultado;
    String operador;

    /**
     * Metodo para realizar las operaciones cuando presionamos el igual.
     * @param igualView
     */
    public void onClickIgual (View igualView){
        TextView textV = (TextView) findViewById(R.id.campoNumero);
        numero2 = Double.parseDouble(textV.getText().toString());

        switch (operador){
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            default:
                break;

        }

        textV.setText(resultado.toString());
    }

    /* Definimos las operaciones */

    public void onClickSuma(View sumView){

        TextView sView = (TextView) findViewById(R.id.campoNumero);
        operador = "+";
        onclickOperacionCapturaNumero1(sumView);

    }

    public void onClickRest(View restView){

        TextView rView = (TextView) findViewById(R.id.campoNumero);
        operador = "-";
        onclickOperacionCapturaNumero1(restView);

    }

    public void onClickMulti(View multiView){

        TextView mView = (TextView) findViewById(R.id.campoNumero);
        operador = "*";
        onclickOperacionCapturaNumero1(multiView);

    }

    public void onClickDiv(View divView){
        TextView dView = (TextView) findViewById(R.id.campoNumero);
        operador = "/";
        onclickOperacionCapturaNumero1(divView);
    }

    /* Finalizamos de definir las operaciones */

    /**
     * Despues de elegir la operación asignamos el primer número elegido y esperamos a la introdución
     * del segundo número.
     * @param miView
     */
    public void onclickOperacionCapturaNumero1(View miView){

        TextView captura1View = (TextView) findViewById(R.id.campoNumero);
        numero1 = Double.parseDouble(captura1View.getText().toString());
        captura1View.setText("");
    }

    /**
     * Borra todos los números en pantalla.
     * @param limpiaView
     */
    public void onClickLimpia (View limpiaView){

        numero1 = 0.0;
        numero2 = 0.0;
        TextView tView = (TextView) findViewById(R.id.campoNumero);
        tView.setText("");
    }

    /*Designamos todos los botones.*/

    public void onClickBtn1 (View btn1View){

        TextView tView = (TextView) findViewById(R.id.campoNumero);
        tView.setText(tView.getText() + "1");
    }

    public void onClickBtn2 (View btn2View){

        TextView tView = (TextView) findViewById(R.id.campoNumero);
        tView.setText(tView.getText() + "2");
    }

    public void onClickBtn3 (View btn3View){

        TextView tView = (TextView) findViewById(R.id.campoNumero);
        tView.setText(tView.getText() + "3");
    }

    public void onClickBtn4 (View btn4View){

        TextView tView = (TextView) findViewById(R.id.campoNumero);
        tView.setText(tView.getText() + "4");
    }

    public void onClickBtn5 (View btn5View){

        TextView tView = (TextView) findViewById(R.id.campoNumero);
        tView.setText(tView.getText() + "5");
    }

    public void onClickBtn6 (View btn6View){

        TextView tView = (TextView) findViewById(R.id.campoNumero);
        tView.setText(tView.getText() + "6");
    }

    public void onClickBtn7 (View btn7View){

        TextView tView = (TextView) findViewById(R.id.campoNumero);
        tView.setText(tView.getText() + "7");
    }

    public void onClickBtn8 (View btn8View){

        TextView tView = (TextView) findViewById(R.id.campoNumero);
        tView.setText(tView.getText() + "8");
    }

    public void onClickBtn9 (View btn9View){

        TextView tView = (TextView) findViewById(R.id.campoNumero);
        tView.setText(tView.getText() + "9");
    }

    public void onClickBtn0 (View btn0View){

        TextView tView = (TextView) findViewById(R.id.campoNumero);
        tView.setText(tView.getText() + "0");
    }

    public void onClickBtnPunto (View btnPuntoView){

        TextView tView = (TextView) findViewById(R.id.campoNumero);
        tView.setText(tView.getText() + ".");
    }

    /*Fin de la asignación de los botones.*/
}
