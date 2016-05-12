package org.javier.com.laboratorio1;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class FacturaActivity extends AppCompatActivity {

    private TextView mTxtTotal;
    private TextView mTxtPedido;
    private Button mBtnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);

        mTxtPedido = (TextView) findViewById(R.id.txtPedido);
        mTxtTotal = (TextView) findViewById(R.id.txtTotal);
        mBtnRegresar = (Button) findViewById(R.id.btnPedir);

        if(getIntent().hasExtra(MainActivity.PEDIDO_TAG)) {
            Double pedido = Double.parseDouble(getIntent().getExtras().getString(MainActivity.PEDIDO_TAG));
            Double total = pedido * 7.5;
            mTxtPedido.setText(pedido.toString());
            mTxtTotal.setText(total.toString());
        }

        mBtnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
