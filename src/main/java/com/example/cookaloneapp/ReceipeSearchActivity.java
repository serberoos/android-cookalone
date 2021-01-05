package com.example.cookaloneapp;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
public class ReceipeSearchActivity extends TabActivity {
        Button receipeConvinBtn1,receipeConvinBtn2,receipeConvinBtn3,receipeConvinBtn4; //편의정 레시피
        Button receipeWestBtn1,receipeWestBtn2,receipeWestBtn3,receipeWestBtn4; // 양식
        Button receipeKoreaBtn1,receipeKoreaBtn2,receipeKoreaBtn3,receipeKoreaBtn4; // 한식
        Button receipeJapanBtn1,receipeJapanBtn2,receipeJapanBtn3,receipeJapanBtn4; // 일식
        Button receipeChinaBtn1,receipeChinaBtn2,receipeChinaBtn3,receipeChinaBtn4; // 중식
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.receipe_search_activity);
            Intent intent = getIntent();
            Button btnReturn = (Button) findViewById(R.id.buttonBack);
            receipeConvinBtn1 = (Button)findViewById(R.id.receipeConvinBtn1);
            receipeConvinBtn2 = (Button)findViewById(R.id.receipeConvinBtn2);
            receipeConvinBtn3 = (Button)findViewById(R.id.receipeConvinBtn3);
            receipeConvinBtn4 = (Button)findViewById(R.id.receipeConvinBtn4);

            receipeWestBtn1 = (Button)findViewById(R.id.receipeWestBtn1);
            receipeWestBtn2 = (Button)findViewById(R.id.receipeWestBtn2);
            receipeWestBtn3 = (Button)findViewById(R.id.receipeWestBtn3);
            receipeWestBtn4 = (Button)findViewById(R.id.receipeWestBtn4);

            receipeKoreaBtn1 = (Button)findViewById(R.id.receipeKoreaBtn1);
            receipeKoreaBtn2 = (Button)findViewById(R.id.receipeKoreaBtn2);
            receipeKoreaBtn3 = (Button)findViewById(R.id.receipeKoreaBtn3);
            receipeKoreaBtn4 = (Button)findViewById(R.id.receipeKoreaBtn4);

            receipeJapanBtn1 = (Button)findViewById(R.id.receipeJapanBtn1);
            receipeJapanBtn2 = (Button)findViewById(R.id.receipeJapanBtn2);
            receipeJapanBtn3 = (Button)findViewById(R.id.receipeJapanBtn3);
            receipeJapanBtn4 = (Button)findViewById(R.id.receipeJapanBtn4);

            receipeChinaBtn1 = (Button)findViewById(R.id.receipeChinaBtn1);
            receipeChinaBtn2 = (Button)findViewById(R.id.receipeChinaBtn2);
            receipeChinaBtn3 = (Button)findViewById(R.id.receipeChinaBtn3);
            receipeChinaBtn4 = (Button)findViewById(R.id.receipeChinaBtn4);

            TabHost tabHost = getTabHost();

            TabHost.TabSpec tabConvin = tabHost.newTabSpec("CONVIN").setIndicator("편의점");
            tabConvin.setContent(R.id.tabConvin);
            tabHost.addTab(tabConvin);

            TabHost.TabSpec tabWest = tabHost.newTabSpec("WEST").setIndicator("양식");
            tabWest.setContent(R.id.tabWest);
            tabHost.addTab(tabWest);

            TabHost.TabSpec tabKorea = tabHost.newTabSpec("KOREA").setIndicator("한식");
            tabKorea.setContent(R.id.tabKorea);
            tabHost.addTab(tabKorea);

            TabHost.TabSpec tabJapan = tabHost.newTabSpec("JAPAN").setIndicator("일식");
            tabJapan.setContent(R.id.tabJapan);
            tabHost.addTab(tabJapan);

            TabHost.TabSpec tabChina = tabHost.newTabSpec("CHINA").setIndicator("중식");
            tabChina.setContent(R.id.tabChina);
            tabHost.addTab(tabChina);
            tabHost.setCurrentTab(intent.getIntExtra("메뉴타입",0));
            // 탭 액티비티의 시작 탭을 인텐트로 건너온 "메뉴타입"의 값에 따라 설정


            receipeConvinBtn1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeConvinBtn2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeConvinBtn3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeConvinBtn4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeWestBtn1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeWestBtn2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeWestBtn3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeWestBtn4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeKoreaBtn1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeKoreaBtn2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeKoreaBtn3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeKoreaBtn4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeJapanBtn1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeJapanBtn2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeJapanBtn3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeJapanBtn4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeChinaBtn1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeChinaBtn2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeChinaBtn3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            receipeChinaBtn4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(ReceipeSearchActivity.this, ReceipeActivity.class);
                    startActivity(intent); // ReceipeActivity 출력
                }
            });
            btnReturn.setOnClickListener(new View.OnClickListener() { //돌아가기
                public void onClick(View v) {
                    finish(); //액티비티 종료
                }
            });
        }
    }