package br.com.marcogorak.alertdialog;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import android.view.View;


public class ActMain extends AppCompatActivity {

    /** @author MarcoGorak
     */

    //Declarando atributos da classe
    private EditText edtNome;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //Associando os elementos da tela com os atributos da classe
        edtNome = (EditText)findViewById(R.id.edtNome);
        btnOk = (Button)findViewById(R.id.btnOK);


        //Implementando o ouvinte de eventos
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                /**
                 * A Classe AlertDialog serve para criar um objeto do mesmo tipo que será capaz
                 * de chamar metodos para setar caixas de alerta na aplicação.
                 */
                AlertDialog.Builder dlg = new AlertDialog.Builder(ActMain.this);
                dlg.setMessage(edtNome.getText().toString());
                dlg.setNeutralButton("Ok", null);
                dlg.show();
            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_main, menu);
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
