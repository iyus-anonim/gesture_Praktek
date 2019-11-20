package com.example.praktek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {
    override fun onSingleTapConfirmed(p0: MotionEvent?): Boolean {
        gesture_status.text="on single tap confirmed"
        return true    }

    override fun onDoubleTapEvent(p0: MotionEvent?): Boolean {
        gesture_status.text="on double tap event"
        return true    }

    override fun onDoubleTap(p0: MotionEvent?): Boolean {
        gesture_status.text="obdoble tap"
        return true    }

    override fun onLongPress(p0: MotionEvent?) {
        gesture_status.text="on long press"

    }

    override fun onScroll(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        gesture_status.text="on scroll"
        return true       }

    override fun onFling(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        gesture_status.text="onFling"
        return true
    }

    override fun onDown(p0: MotionEvent?): Boolean {
        gesture_status.text="onDown"
        return true
    }

    override fun onSingleTapUp(p0: MotionEvent?): Boolean {
        gesture_status.text="show single tap"
        return true       }

    override fun onShowPress(p0: MotionEvent?) {
        gesture_status.text="show press"
            }

    var gDetector: GestureDetectorCompat?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.gDetector= GestureDetectorCompat(this,this)

        gDetector?.setOnDoubleTapListener(this)

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        this.gDetector?.onTouchEvent(event)
        //memastikan untuk memanggil implementasi supper class
        return super.onTouchEvent(event)
    }
}
