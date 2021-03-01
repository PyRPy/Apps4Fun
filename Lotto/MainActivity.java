package lotto.Lotto;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
// https://stackoverflow.com/questions/23330816/error-package-android-support-v7-app-does-not-exist
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lotto( View vue)
    {
        TextView txt = (TextView) findViewById( R.id.textView) ;

        int[] nums = new int[60];  String str = "";
        for( int i = 1; i < 60; i++ ) { nums[i] = i; }
        for( int i = 1; i < 60; i++ )
        {
            int r = (int) ( Math.random() * 59 ) + 1;
            int t=nums[i]; nums[i]=nums[r]; nums[r]=t;
        }
        for ( int i = 1; i < 7; i++ )
        { str += "  " + Integer.toString(nums[ i ]) + "  "; }
        txt.setText( str );
    }

}