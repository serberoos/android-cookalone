package com.example.cookaloneapp;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
public class ReceipeActivity extends TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receipe_activity);
        TabHost tabHost = getTabHost(); //레시피 탭 액티비티 생성하기
        TabHost.TabSpec tabSummary = tabHost.newTabSpec("SUMMARY").setIndicator("개요");
        tabSummary.setContent(R.id.tabSummary);
        tabHost.addTab(tabSummary);
        TabHost.TabSpec tabMaterial = tabHost.newTabSpec("MATERIAL").setIndicator("재료");
        tabMaterial.setContent(R.id.tabMaterial);
        tabHost.addTab(tabMaterial);
        TabHost.TabSpec tabProcess = tabHost.newTabSpec("PROCESS").setIndicator("요리과정");
        tabProcess.setContent(R.id.tabProcess);
        tabHost.addTab(tabProcess);
        tabHost.setCurrentTab(0); //초기 설정 탭은 "개요"
        Button btnNewActivity = (Button) findViewById(R.id.receipeEvaButton); // 레시피 평가 액티비티로의 버튼
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ReceipeActivity.this, ReceipeEvaActivity.class);//인텐트
                startActivity(intent);
            }
        });
        Button btnReturn = (Button) findViewById(R.id.returnBtn);
        btnReturn.setOnClickListener(new View.OnClickListener() { // 돌아가기
            public void onClick(View v) {
                finish(); //액티비티 종료
            }
        });
    }
}




