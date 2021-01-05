package com.example.cookaloneapp;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button settingBtn; //메인 화면 설정 버튼
    Button receipe1Btn,receipe2Btn,receipe3Btn,receipe4Btn;
    Button receipeSearchBtn2,receipeSearchBtn1,receipeSearchBtn3,receipeSearchBtn4,receipeSearchBtn5; //레시피 검색 창 버튼
    TextView settingToastText;
    View settingDialogView; //메인 화면 설정 View
    View toastView; //토스트 뷰
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        settingBtn = (Button) findViewById(R.id.settingBtn); //설정창
        receipe1Btn = (Button) findViewById(R.id.receipe1Btn);//레시피 추천 창 레시피 버튼
        receipe2Btn = (Button) findViewById(R.id.receipe2Btn);//레시피 추천 창 레시피 버튼
        receipe3Btn = (Button) findViewById(R.id.receipe3Btn);//레시피 추천 창 레시피 버튼
        receipe4Btn = (Button) findViewById(R.id.receipe4Btn);//레시피 추천 창 레시피 버튼

        receipeSearchBtn1 = (Button) findViewById(R.id.receipeSearchBtn1);//레시피 검색 버튼
        receipeSearchBtn2 = (Button) findViewById(R.id.receipeSearchBtn2);//레시피 검색 버튼
        receipeSearchBtn3 = (Button) findViewById(R.id.receipeSearchBtn3);//레시피 검색 버튼
        receipeSearchBtn4 = (Button) findViewById(R.id.receipeSearchBtn4);//레시피 검색 버튼
        receipeSearchBtn5 = (Button) findViewById(R.id.receipeSearchBtn5);//레시피 검색 버튼

        //======================================메인화면 설정창(다이얼로그) ===================================================================================================
        settingBtn.setOnClickListener(new View.OnClickListener() { //설정창

            public void onClick(View v) {
                settingDialogView = (View) View.inflate(MainActivity.this, R.layout.setting_dialog, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("쿡얼론 설정");
                dlg.setIcon(R.drawable.settingpng);
                Spinner settingSpinnerFont = (Spinner) settingDialogView.findViewById(R.id.settingSpinner1);//설정창 폰트 크기 스피너
                Spinner settingSpinnerFontSize = (Spinner) settingDialogView.findViewById(R.id.settingSpinner2); // 설정창 폰트 스피너
                ArrayAdapter settingSpinnerFontadapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.font, android.R.layout.simple_spinner_item);
                ArrayAdapter settingSpinnerFontSizeadapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.fontSize, android.R.layout.simple_spinner_item);
                settingSpinnerFontSize.setAdapter(settingSpinnerFontSizeadapter);
                settingSpinnerFont.setAdapter(settingSpinnerFontadapter);
                dlg.setPositiveButton("적용 후 종료",
                        new DialogInterface.OnClickListener() { //설정창 토스트(적용)
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast toast = new Toast(MainActivity.this);
                                toastView = (View) View.inflate(MainActivity.this, R.layout.settingdialog_toast_save, null);
                                settingToastText = (TextView) toastView.findViewById(R.id.settingToastText);
                                settingToastText.setText("설정 내용을 적용한 후 종료했습니다!");
                                toast.setView(toastView);
                                toast.show();
                            }
                        });
                dlg.setNegativeButton("취소하기",
                        new DialogInterface.OnClickListener() { //설정창 토스트(취소)
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast toast = new Toast(MainActivity.this);
                                toastView = (View) View.inflate(MainActivity.this, R.layout.settingdialog_toast_save, null);
                                settingToastText = (TextView) toastView.findViewById(R.id.settingToastText);
                                settingToastText.setText("설정창을 벗어납니다.(취소)");
                                toast.setView(toastView);
                                toast.show();
                            }
                        });
                dlg.setView(settingDialogView);
                dlg.show();
            }
        });
        //==============================================메인화면 설정창(다이얼로그) 끝 ===========================================================================================
        //==============================================레시피 추천 창 버튼 리스너 ===============================================================================================
        receipe1Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ReceipeActivity.class); //인텐트
                startActivity(intent); // ReceipeActivity 출력
            }
        });

        receipe2Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ReceipeActivity.class); //인텐트
                startActivity(intent); // ReceipeActivity 출력
            }
        });
        receipe3Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ReceipeActivity.class); //인텐트
                startActivity(intent); // ReceipeActivity 출력
            }
        });
        receipe4Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ReceipeActivity.class); //인텐트
                startActivity(intent); // ReceipeActivity 출력
            }
        });
        //==============================================레시피 추천 창 버튼 리스너 ===============================================================================================
        //==============================================레시피 검색 창 버튼 리스너 ===============================================================================================
        receipeSearchBtn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ReceipeSearchActivity.class); //인텐트
                intent.putExtra("메뉴타입",0); //탭 액티비티 초기 설정 값 0(편의점) 전달
                startActivity(intent); // ReceipeSearchActivity 출력
            }
        });
        receipeSearchBtn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ReceipeSearchActivity.class); //인텐트
                intent.putExtra("메뉴타입",1); //탭 액티비티 초기 설정 값 1(양식) 전달
                startActivity(intent); // ReceipeSearchActivity 출력
            }
        });
        receipeSearchBtn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ReceipeSearchActivity.class); //인텐트
                intent.putExtra("메뉴타입",2); //탭 액티비티 초기 설정 값 2(한식) 전달
                startActivity(intent); // ReceipeSearchActivity 출력
            }
        });
        receipeSearchBtn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ReceipeSearchActivity.class); //인텐트
                intent.putExtra("메뉴타입",3); //탭 액티비티 초기 설정 값 3(일식) 전달
                startActivity(intent); // ReceipeSearchActivity 출력
            }
        });
        receipeSearchBtn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ReceipeSearchActivity.class); //인텐트
                intent.putExtra("중식",4); //탭 액티비티 초기 설정 값 4(중식) 전달
                startActivity(intent); // ReceipeSearchActivity 출력
            }
        });
        //==============================================레시피 검색 창 버튼 리스너 ===============================================================================================================
    }
}

