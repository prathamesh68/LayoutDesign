package com.example.coder.layoutdesign;

import android.graphics.Color;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mcount,mdata;
    int linecount;
    ScrollView scrollViewCT;
    ScrollView scrollViewTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mcount = (TextView) findViewById(R.id.count);
        mdata = (TextView) findViewById(R.id.data);

    mdata.setTextColor(Color.parseColor("#3F51B5"));

        mdata.setText("import java.util.*;\n" +
                "class demo19\n" +
                "{\n" +
                "public static void main(String a[])\n" +
                "{\n" +
                "\tStringBuffer sb=new StringBuffer(\"object language\");\n" +
                "\tSystem.out.println(\"original string\"+sb);\n" +
                "\tSystem.out.println(\"Length of the string=\"+sb.length());\n" +
                "for(int i=0;i<sb.length();i++)\n" +
                "{\n" +
                "\tint p=i+1;\n" +
                "\tSystem.out.println(\"character at positin:\"+p+\" is \"+sb.charAt(i));\n" +
                "}\n" +
                "String str=new String(sb.toString());\n" +
                "\n" +
                "\tsb.insert(7,\"oriented \");\n" +
                "\tSystem.out.println(\"mdified string=\"+sb);\n" +
                "\tsb.append(\" improved security\");\n" +
                "System.out.println(sb);\n" +
                "}\n" +
                "}\n" +
                "o/p:\n" +
                "original stringobject language\n" +
                "Length of the string=15\n" +
                "character at positin:1 is o\n" +
                "character at positin:2 is b\n" +
                "character at positin:3 is j\n" +
                "character at positin:4 is e\n" +
                "character at positin:5 is c\n" +
                "character at positin:6 is t\n" +
                "character at positin:7 is\n" +
                "character at positin:8 is l\n" +
                "character at positin:9 is a\n" +
                "character at positin:10 is n\n" +
                "character at positin:11 is g\n" +
                "character at positin:12 is u\n" +
                "character at positin:13 is a\n" +
                "character at positin:14 is g\n" +
                "character at positin:15 is e\n" +
                "mdified string=object oriented language\n" +
                "object oriented language improved security");


        mdata.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                String s1 = "";
                linecount = mdata.getLineCount();
                for (int i = 1; i <= linecount; i++) {
                    s1 = s1 + " " + i + "\n";

                }
                mcount.setText(s1);

            }
        });



    }
}
