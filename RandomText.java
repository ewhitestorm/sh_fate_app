package com.example.shfate;

import android.widget.TextView;

import java.util.Random;

class RandomText extends MagicText  {

    private TextView text;

    public void ranText(){

        int randomWord = new Random().nextInt(array.length);

        switch(randomWord) {
            case 1:
                this.text.setText(array[0]);
                break;
            case 2:
                this.text.setText(array[1]);
                break;
            case 3:
                this.text.setText(array[2]);
                break;
            case 4:
                this.text.setText(array[3]);
                break;
            case 5:
                this.text.setText(array[4]);
                break;
            case 6:
                this.text.setText(array[5]);
                break;
            case 7:
                this.text.setText(array[6]);
                break;
            case 8:
                this.text.setText(array[7]);
                break;
            case 9:
                this.text.setText(array[8]);
                break;
        }
    }
}
