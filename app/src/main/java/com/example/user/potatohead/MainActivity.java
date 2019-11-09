package com.example.user.potatohead;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //4 \CheckBox cbHat,cbEyes,cbEyebrows,cbGlasses,cbNose,cbMouth,cbMustache,cbEars,cbArms,cbShoes;
    private ImageView arms,eyes,eyebrows,glasses,nose,mouth,mustache,ears,shoes,hat;
    //ArrayList<String> selection = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hat = (ImageView) findViewById(R.id.hat);
        eyes = (ImageView) findViewById(R.id.eyes);
        eyebrows = (ImageView) findViewById(R.id.eyebrows);
        glasses = (ImageView) findViewById(R.id.glasses);
        nose = (ImageView) findViewById(R.id.nose);
        mouth = (ImageView) findViewById(R.id.mouth);
        mustache = (ImageView) findViewById(R.id.mustache);
        ears = (ImageView) findViewById(R.id.ears);
        arms = (ImageView) findViewById(R.id.arms);
        shoes = (ImageView) findViewById(R.id.shoes);

    }
    public void selectItem(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.cbHat :
                if(checked){
                    hat.setVisibility(view.INVISIBLE);
                }
                else{
                    hat.setVisibility(view.VISIBLE);
                }
                break;
            case R.id.cbEyes :
                if(checked){
                    eyes.setVisibility(view.INVISIBLE);
                }
                else{
                    eyes.setVisibility(view.VISIBLE);
                }
                break;
            case R.id.cbEyebrows :
                if(checked){
                    eyebrows.setVisibility(view.INVISIBLE);
                }
                else{
                    eyebrows.setVisibility(view.VISIBLE);
                }
                break;
            case R.id.cbGlasses :
                if(checked){
                    glasses.setVisibility(view.INVISIBLE);
                }
                else{
                    glasses.setVisibility(view.VISIBLE);
                }
                break;
            case R.id.cbNose :
                if(checked){
                    nose.setVisibility(view.INVISIBLE);
                }
                else{
                    nose.setVisibility(view.VISIBLE);
                }
                break;
            case R.id.cbMouth :
                if(checked){
                    mouth.setVisibility(view.INVISIBLE);
                }
                else{
                    mouth.setVisibility(view.VISIBLE);
                }
                break;
            case R.id.cbMustache :
                if(checked){
                    mustache.setVisibility(view.INVISIBLE);
                }
                else{
                    mustache.setVisibility(view.VISIBLE);
                }
                break;
            case R.id.cbEars :
                if(checked){
                    ears.setVisibility(view.INVISIBLE);
                }
                else{
                    ears.setVisibility(view.VISIBLE);
                }
                break;
            case R.id.cbArms :
                if(checked){
                    arms.setVisibility(view.INVISIBLE);
                }
                else{
                    arms.setVisibility(view.VISIBLE);
                }
                break;
            case R.id.cbShoes :
                if(checked){
                    shoes.setVisibility(view.INVISIBLE);
                }
                else{
                    shoes.setVisibility(view.VISIBLE);
                }
                break;
        }
    }
}
