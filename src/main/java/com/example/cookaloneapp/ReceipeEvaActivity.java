package com.example.cookaloneapp;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ReceipeEvaActivity extends Activity {
    EditText receipeEvaEditText; //리뷰 내용
    Button submitBtn;
    String fileName, ratingFileName; //저장할 파일 이름
    RatingBar evaRatingBar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receipe_eva_activity);
        Button btnReturn = (Button) findViewById(R.id.buttonBack);
        submitBtn = (Button) findViewById(R.id.submitBtn);
        receipeEvaEditText = (EditText) findViewById(R.id.receipeEvaEditText);
        evaRatingBar = (RatingBar)findViewById(R.id.evaRatingBar);

        fileName = "review" + ".txt";
        ratingFileName = "ratingData" +".txt"; //저장할 파일 이름
        String ratingDataStr = readEva(ratingFileName); //저장된 리뷰 점수 정보를 가져온다.
        Float ratingData = Float.parseFloat(ratingDataStr); //레이팅바 인수는 실수형(float)
        evaRatingBar.setRating(ratingData); //리뷰점수 설정하기

        String evaEdtContent = readEva(fileName); //저장된 리뷰 정보를 가져온다.
        receipeEvaEditText.setText(evaEdtContent); //전에 쓴 리뷰 내용 가져오기

        submitBtn.setOnClickListener(new View.OnClickListener() { //파일 생성 메소드
            public void onClick(View v) {
                try {
                    FileOutputStream outFs = openFileOutput(fileName, Context.MODE_PRIVATE); // 리뷰내용 정보 파일 생성
                    String str = receipeEvaEditText.getText().toString();
                    outFs.write(str.getBytes());
                    outFs = openFileOutput(ratingFileName, Context.MODE_PRIVATE); // 레이팅바 정보 파일 생성
                    str = Float.toString(evaRatingBar.getRating());
                    outFs.write(str.getBytes());
                    outFs.close();
                    Toast.makeText(getApplicationContext(), fileName + "과 "+ ratingFileName + " 이 저장됨", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                }
            }
        });
        btnReturn.setOnClickListener(new View.OnClickListener() { //돌아가기
            public void onClick(View v) {
                finish(); //액티비티 종료
            }
        });
    }
    String readEva(String fName) { //리뷰 파일을 읽는 메소드
        String evaStr = null;
        FileInputStream inFs;
        try {
            inFs = openFileInput(fName);
            byte[] txt = new byte[500];
            inFs.read(txt);
            inFs.close();
            evaStr = (new String(txt)).trim();
            submitBtn.setText("리뷰 수정하기"); //리뷰 작성 기록이 있을시
        } catch (IOException e) {
            submitBtn.setText("리뷰 제출하기");
        }
        return evaStr; //파일의 String정보를 리턴
    }
}
