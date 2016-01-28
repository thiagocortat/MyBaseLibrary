package com.thiagocortat.mybaselibrary.interfaces;

import android.view.MotionEvent;
import android.view.View;

/**
 * Created by glavko on 25/08/14.
 */
public class PressedStateOnTouchListener implements View.OnTouchListener
{
    public PressedStateOnTouchListener(float alphaNormal)
    {
        mAlphaNormal    = alphaNormal;
    }

    public boolean onTouch( View theView, MotionEvent motionEvent )
    {
        switch( motionEvent.getAction() ) {
            case MotionEvent.ACTION_DOWN:
                theView.setAlpha( mAlphaNormal / 2.0f );
                break;

            case MotionEvent.ACTION_UP:
                theView.setAlpha( mAlphaNormal );
                break;
        }

        // return false because I still want this to bubble off into an onClick
        return false;
    }

    private float   mAlphaNormal;
}