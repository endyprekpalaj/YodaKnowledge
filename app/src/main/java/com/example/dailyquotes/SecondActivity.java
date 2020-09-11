package com.example.dailyquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Motivational motivation = new Motivational();
    private ColorPicker colorPicker = new ColorPicker();
    private PicturePicker picturePicker=new PicturePicker();

    private TextView quoteTextView;
    private TextView authorTextView;
    private Button nextButton;
    private ConstraintLayout constraintLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        quoteTextView = (TextView) findViewById(R.id.quoteTextView);
        authorTextView = (TextView) findViewById(R.id.authorTextView);
        nextButton = (Button) findViewById(R.id.nextButton);
        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);

        nextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Quote quote = motivation.getARandomQuote();
                int colorInInt = colorPicker.getRandomColor();
                String pictureName=picturePicker.getRandomPicture();


                int resourceId =SecondActivity.this.getResources()
                        .getIdentifier(pictureName,"drawable",SecondActivity.this.getPackageName());

                quoteTextView.setText(quote.getQuote());
                quoteTextView.setTextColor(colorInInt);
                authorTextView.setText(quote.getAuthor());
                constraintLayout.setBackgroundResource(resourceId);

            }
        });
    }
}
