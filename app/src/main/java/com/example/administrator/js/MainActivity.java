package com.example.administrator.js;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5,
                    button6, button7, button8, button9, button0,
                    buttadd, buttsub, buttmul, buttdiv, buequal,
                    butback, buclean, butpoint;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });

        buclean = (Button) findViewById(R.id.clean);
        buclean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });

        butback = (Button) findViewById(R.id.back);
        butback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                if (str.length() == 1){
                    textView.setText("");
                }else{
                    textView.setText(str.substring(0, str.length() - 1));
                }
            }
        });

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                if (str.equals("")){
                    textView.setText("1");
                    return;
                }
                textView.setText(str + "1");
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                if (str.equals("")){
                    textView.setText("2");
                    return;
                }
                textView.setText(str + "2");
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                if (str.equals("")){
                    textView.setText("3");
                    return;
                }
                textView.setText(str + "3");
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                if (str.equals("")){
                    textView.setText("4");
                    return;
                }
                textView.setText(str + "4");
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                if (str.equals("")){
                    textView.setText("5");
                    return;
                }
                textView.setText(str + "5");
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                if (str.equals("")){
                    textView.setText("6");
                    return;
                }
                textView.setText(str + "6");
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                if (str.equals("")){
                    textView.setText("7");
                    return;
                }
                textView.setText(str + "7");
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                if (str.equals("")){
                    textView.setText("8");
                    return;
                }
                textView.setText(str + "8");
            }
        });

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                if (str.equals("")){
                    textView.setText("9");
                    return;
                }
                textView.setText(str + "9");
            }
        });

        button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();

                if (str.equals("")){
                    textView.setText("0");
                    return;
                }
                for (int i = 0; i < str.length(); i ++){
                    char ch = str.charAt(i);
                    if (ch == '+' |ch == '/' |ch == '*' |ch == '/'  ){
                          if (ch == '.' & str.endsWith("0") ){
                                textView.setText(str + "0" );
                              return;
                          } else if (str.endsWith("0")){
                            textView.setText(str);
                            return;
                        }
                    }
                }
                textView.setText(str + "0");
            }
        });

        butpoint = (Button) findViewById(R.id.point);
        butpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                if (str.equals("")){
                    textView.setText("");
                }else if(str.endsWith("+") | str.endsWith("-") |
                        str.endsWith("*") | str.endsWith("/") | str.endsWith(".")){
                    textView.setText(str);
                }else {
                    textView.setText(str + ".");
                }
            }
        });

        buttadd = (Button) findViewById(R.id.add);
        buttadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                if (str.equals("")){
                    textView.setText("");
                }else if(str.endsWith("+") | str.endsWith("-") |
                        str.endsWith("*") | str.endsWith("/") | str.endsWith(".")){
                    textView.setText(str);
                }else {
                    textView.setText(str + "+");
                }
            }
        });

        buttsub = (Button) findViewById(R.id.sub);
        buttsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                if (str.equals("")){
                    textView.setText("");
                }else if(str.endsWith("+") | str.endsWith("-") |
                        str.endsWith("*") | str.endsWith("/") | str.endsWith(".")){
                    textView.setText(str);
                }else {
                    textView.setText(str + "-");
                }
            }
        });

        buttmul = (Button) findViewById(R.id.mul);
        buttmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                if (str.equals("")){
                    textView.setText("");
                }else if(str.endsWith("+") | str.endsWith("-") |
                        str.endsWith("*") | str.endsWith("/") | str.endsWith(".")){
                    textView.setText(str);
                }else {
                    textView.setText(str + "*");
                }
            }
        });

        buttdiv = (Button) findViewById(R.id.div);
        buttdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                if (str.equals("")){
                    textView.setText("");
                }else if(str.endsWith("+") | str.endsWith("-") |
                        str.endsWith("*") | str.endsWith("/") | str.endsWith(".")){
                    textView.setText(str);
                }else {
                    textView.setText(str + "/");
                }
            }
        });

        buequal = (Button) findViewById(R.id.equal);
        buequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> nubContent = new ArrayList<>();
                ArrayList<String> charContent = new ArrayList<>();
                String str = textView.getText().toString();
                if (str.charAt(0) != '-'){
                    str = "+" + str;
                }

                String string = "";
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '+' | str.charAt(i) == '-' |
                            str.charAt(i) == '*' | str.charAt(i) == '/') {
                        charContent.add(String.valueOf(str.charAt(i)));
                        if (string.compareTo("") != 0) {
                            nubContent.add(string);
                            string = "";
                        }
                    } else {
                            string = string + str.charAt(i);
                    }
                    if (str.length() - 1 == i) {
                        nubContent.add(string);
                        string = "";
                    }
                }

                for (int i = 0; i < charContent.size();) {
                    if (charContent.get(i).charAt(0) == '*'){
                        double nub1 = Double.valueOf(nubContent.get(i));
                        double nub2 = Double.valueOf(nubContent.get(i - 1));
                        double aresult = nub1 * nub2;

                        nubContent.set(i - 1, aresult + "");
                        nubContent.remove(i);
                        charContent.remove(i);
                    }else if(charContent.get(i).charAt(0) == '/'){
                        double nub1 = Double.valueOf(nubContent.get(i));
                        double nub2 = Double.valueOf(nubContent.get(i - 1));
                        double aresult = nub2 / nub1;

                        nubContent.set(i - 1, aresult + "");
                        nubContent.remove(i);
                        charContent.remove(i);
                    }else {
                        i++;
                    }
                }
                textView.setText(charContent.toString() + "  " + nubContent.toString());

                double result = 0;
                for (int i = 0; i < charContent.size(); i++) {
                    if (charContent.get(i).charAt(0) == '+'){
                        double nub = Double.valueOf(nubContent.get(i));
                        result += nub;
                    }else if(charContent.get(i).charAt(0) == '-'){
                        double nub = Double.valueOf(nubContent.get(i));
                        result -= nub;
                    }else {
                        result = result;
                    }
                }
                textView.setText(result + "");

            }
        });
    }
}
