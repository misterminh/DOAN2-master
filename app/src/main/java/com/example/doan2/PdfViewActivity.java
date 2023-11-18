package com.example.doan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewActivity extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);

        pdfView = findViewById(R.id.pdfView);

        int pos = getIntent().getIntExtra("position",0);
        if(pos == 0){
            pdfView.fromAsset("14 Nguyen Tac Thanh Cong.pdf").load();
        }
    }
}