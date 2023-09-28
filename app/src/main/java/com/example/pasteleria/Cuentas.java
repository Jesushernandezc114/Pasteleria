package com.example.pasteleria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TableLayout;

import java.util.ArrayList;

public class Cuentas extends AppCompatActivity {
    private TableLayout tableLayout;
    private EditText txtNombre;
    private EditText txtApellido;
    private EditText txtTelefono;
    private EditText txtPago;
    private String[]header={"Id","Nombre","Apellido","Telefono","Pago"};
    private ArrayList<String[]> rows=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuentas);
        tableLayout=(TableLayout)findViewById(R.id.table);
        txtNombre=(EditText)findViewById(R.id.txtNombre );
        txtApellido=(EditText)findViewById(R.id.txtApellido );
        txtTelefono=(EditText)findViewById(R.id.txtTelefono );
        txtPago=(EditText)findViewById(R.id.txtPago );

        TableDynamic tableDynamic=new TableDynamic(tableLayout,getApplicationContext());
        tableDynamic.addHeader(header);
        tableDynamic.addData(getClients());

    }
    private ArrayList<String[]> getClients(){
        rows.add(new String[]{"1","jesus","Hernandez","+569 42304501","20000"});
        rows.add(new String[]{"2","hugo","Hernandez","+569 423045053","20000"});
        rows.add(new String[]{"3","aylin","Hernandez","+569 423045043","20000"});
        return rows;

    }
}