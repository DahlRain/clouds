package com.dahl.myapp;

import android.content.Context;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class RecycleViewClickListener implements RecyclerView.OnItemTouchListener
{

    // GestureDetectorCompat 是为了版本兼容
    private GestureDetectorCompat mGestureDetector;
    private OnItem2ClickListener mListener;

    //自定义内部监听
    public interface OnItem2ClickListener
    {
        //单击
        void onItemClick(View view, int position);

        //长按
        void onItemLongClick(View view, int position);
    }

    public RecycleViewClickListener(Context context, final RecyclerView mRecyclerView, OnItem2ClickListener listener)
    {
        this.mListener = listener;
        // SimpleOnGestureListener 是为了选择重写需要的方法
        mGestureDetector = new GestureDetectorCompat(context, new GestureDetector.SimpleOnGestureListener() {
            //单击事件
            @Override
            public boolean onSingleTapUp(MotionEvent e)
            {
                Log.i("mGestureDetector", "onSingleTapUp");
                View childViewUnder = mRecyclerView.findChildViewUnder(e.getX(), e.getY());
                if (childViewUnder != null && mListener != null)
                {
                    mListener.onItemClick(childViewUnder, mRecyclerView.getChildLayoutPosition(childViewUnder));
                    return true;
                }
                return false;
            }

            //长按事件
            @Override
            public void onLongPress(MotionEvent e)
            {
                Log.i("mGestureDetector", "onLongPress");
                View childView = mRecyclerView.findChildViewUnder(e.getX(), e.getY());
                if (childView != null && mListener != null)
                {
                    mListener.onItemLongClick(childView, mRecyclerView.getChildLayoutPosition(childView));
                }
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e)
    {
        //是否拦截事件交给 mGestureDetector 处理
        if (mGestureDetector.onTouchEvent(e))
        {
            return true;
        }
        else
            return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e)
    {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept)
    {

    }
}
