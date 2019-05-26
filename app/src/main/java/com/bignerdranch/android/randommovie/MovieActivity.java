package com.bignerdranch.android.randommovie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.net.Uri;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class MovieActivity extends AppCompatActivity {

    private Button mGenerateButton;
    private TextView mLinksTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        mLinksTextView = findViewById(R.id.links);

        mGenerateButton = findViewById(R.id.generate_button);
        mGenerateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                generate();
            }
        });

    }

    private void generate(){

        ArrayList<String> movies = new ArrayList<>();
        movies.add("https://zfilm-hd.org/35801-hellboy-68041743.html");
        movies.add("https://zfilm-hd.org/32833-akvamen-68041743.html");
        movies.add("https://zfilm-hd.org/34447-zelenaya-kniga-68041743.html");
        movies.add("https://zfilm-hd.org/35715-pochemu-vy-zdes-sensey-68041743.html");
        movies.add("https://zfilm-hd.org/1099-yuzhnyy-park-68041743.html");
        movies.add("https://zfilm-hd.org/35668-magazin-edinorogov-68041743.html");
        movies.add("https://zfilm-hd.org/35613-dambo-68041743.html");
        movies.add("https://zfilm-hd.org/35613-dambo-68041743.html");
        movies.add("https://www.xvideos.com/video46052465/teenfidelity_harmony_wonder_has_tight_snatch_stretched_by_juan_lucho");

        Random rand = new Random();
        int randMovie = rand.nextInt(9);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(movies.get(randMovie)));
        startActivity(intent);

    }
//
//    private void parse() throws IOException {
//        Document doc = Jsoup.connect("https://xvideos.com").get();
//        List<Element> links = doc.select(".home  no-side-tf-tower > #page > #main > #content > " +
//                ".mozaique > .thumb-block > .thumb-inside > .thumb");
//
//        for(Element link : links){
//            String href = link.select("a").get(0).absUrl("href");
//            mLinksTextView.setText(href);
//
//        }
//    }
}
