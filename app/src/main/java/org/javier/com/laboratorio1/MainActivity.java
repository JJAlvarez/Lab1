package org.javier.com.laboratorio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String PEDIDO_TAG = "extra_pedido";

    private EditText mPedido;
    private Button mBtnPedir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPedido = (EditText) findViewById(R.id.editPedido);
        mBtnPedir = (Button) findViewById(R.id.btnPedir);

        mBtnPedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(MainActivity.this, FacturaActivity.class);
                main.putExtra(PEDIDO_TAG, mPedido.getText().toString());
                startActivity(main);
            }
        });
    }
}
