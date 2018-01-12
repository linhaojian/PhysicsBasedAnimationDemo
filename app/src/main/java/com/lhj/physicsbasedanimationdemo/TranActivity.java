package com.lhj.physicsbasedanimationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.TransitionInflater;
import android.transition.TransitionSet;
import android.view.Gravity;
import android.view.KeyEvent;

/**
 * Created by Administrator on 2017/8/3.
 */

public class TranActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tranactity);
//        transitionForEnterXml();
//        transitionForExitXml();
        setEnterTransitionForSlide();
    }

    /**
     *  slide (滑动) : 从屏幕边缘进或出，移动视图
     */
    private void setEnterTransitionForSlide(){
        Slide slideTransition = new Slide(Gravity.LEFT);
        slideTransition.setDuration(500L);
        getWindow().setEnterTransition(slideTransition);//当A 跳转到 B时，使B中的View进入场景的transition
        getWindow().setAllowEnterTransitionOverlap(true);
        getWindow().setAllowReturnTransitionOverlap(true);
    }

    /**
     *  explode (分解) ：从屏幕中间进进或出，移动视图
     */
    private void setEnterTransitionForExplode(){
        Explode slideTransition = new Explode();
        slideTransition.setDuration(500L);
        getWindow().setEnterTransition(slideTransition);//当A 跳转到 B时，使B中的View进入场景的transition
        getWindow().setAllowEnterTransitionOverlap(true);
        getWindow().setAllowReturnTransitionOverlap(true);
    }

    /**
     *  fade (淡入淡出) ： 通过改变视图的透明度来添加或者移除视图
     */
    private void setEnterTransitionForFade(){
        Fade slideTransition = new Fade(Fade.MODE_IN);
        slideTransition.setDuration(500L);
        getWindow().setEnterTransition(slideTransition);//当A 跳转到 B时，使B中的View进入场景的transition
        getWindow().setAllowEnterTransitionOverlap(true);
        getWindow().setAllowReturnTransitionOverlap(true);
    }

    private void transitionSet(){
        Slide slide = new Slide(Gravity.LEFT);
        slide.setDuration(1500L);
        Explode explode = new Explode();
        explode.setDuration(1500L);
//        explode.excludeTarget()//除了那个View，不动画
//        explode.addTarget();//只针对View，动画
        Fade fade = new Fade(Fade.MODE_IN);
        fade.setDuration(1500L);
        fade.setStartDelay(1500L);
        TransitionSet transitionSet = new TransitionSet();
//        transitionSet.addTransition(fade);
        transitionSet.addTransition(explode);
        getWindow().setEnterTransition(transitionSet);//当A 跳转到 B时，使B中的View进入场景的transition
        getWindow().setAllowEnterTransitionOverlap(true);
        getWindow().setAllowReturnTransitionOverlap(true);
    }

    private void transitionForEnterXml(){
        TransitionSet transition = (TransitionSet) TransitionInflater.from(this).inflateTransition(R.transition.activity_transition_in);
        getWindow().setEnterTransition(transition);//当A 跳转到 B时，使B中的View进入场景的transition

    }


    private void transitionForExitXml(){
        TransitionSet transition = (TransitionSet) TransitionInflater.from(this).inflateTransition(R.transition.activity_transition_out);
        getWindow().setReturnTransition(transition);//当A 跳转到 B时，使B中的View进入场景的transition
    }

    /**
     *  changeBounds : 捕获共享元素的layout bound，然后播放layout bound变化动画。ChangeBounds 是共享元素变换中用的最多的，因为前后两个activity中共享元素的大小和位置一般都是不同的。
        changeClipBounds : 裁剪目标视图边界,捕获共享元素clip bounds，然后播放clip bounds变化动画。
        changeTransform : 捕获共享元素的缩放（scale）与旋转（rotation）属性 ，然后播放缩放（scale）与旋转（rotation）属性变化动画。
        changeImageTransform :捕获共享元素（ImageView）的transform matrices 属性，然后播放ImageViewtransform matrices 属性变化动画。与ChangeBounds相结合，这个变换可以让ImageView在动画中高效实现大小，形状或者ImageView.ScaleType 属性平滑过度。

        设置共享元素的过度动画
     */
    private void setSharedElementEnterTransition(){
        ChangeBounds changeBoundsTransition = new ChangeBounds();
        changeBoundsTransition.setDuration(1500L);
//        ChangeClipBounds changeClipBounds = new ChangeClipBounds();
//        changeClipBounds.setDuration(1500L);
//        ChangeTransform changeTransform = new ChangeTransform();
//        changeTransform.setDuration(1500L);
//        ChangeImageTransform changeImageTransform = new ChangeImageTransform();
//        changeImageTransform.setDuration(1500L);
        getWindow().setSharedElementEnterTransition(changeBoundsTransition);
    }

}
