package com.example.nndb.testspinerv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.nndb.testspinerv1.model.NhanVien;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText txtTen;
    EditText txtSoNgay;
    Button btnOK;
    Spinner spThu;
    ArrayList<String>dsThu;
    ArrayAdapter<String>adapterThu;

    int lastedSelected=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyNhanVien();
            }
        });

        spThu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this,"Ban chon"+dsThu.get(position),Toast.LENGTH_LONG).show();
                lastedSelected=position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void xuLyNhanVien() {
        if ((lastedSelected==-1))
        {
            Toast.makeText(MainActivity.this,"Chua chon",Toast.LENGTH_LONG).show();;
            return;
        }

        NhanVien nv= new NhanVien();
        nv.setTenNhanVien(txtTen.getText().toString());
        nv.setThuCongTac(dsThu.get((lastedSelected)));;
        nv.setSoNgay(Integer.parseInt(txtSoNgay.getText().toString()));

        Toast.makeText(MainActivity.this,nv.toString(),Toast.LENGTH_LONG).show();
    }

    private void addControls() {
        txtTen=findViewById(R.id.txtTen);
        txtSoNgay=findViewById(R.id.txtNgay);
        btnOK=findViewById(R.id.btnOK);
        spThu=findViewById(R.id.spThu);
        dsThu=new ArrayList<>();
        dsThu.add("Thứ 2");
        dsThu.add("Thứ 3");
        dsThu.add("Thứ 4");
        dsThu.add("Thứ 5");
        dsThu.add("Thứ 6");
        dsThu.add("Thứ 7");
        dsThu.add("Chủ nhật");

        adapterThu=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,dsThu);
        adapterThu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spThu.setAdapter(adapterThu);
    }
}
