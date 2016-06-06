package com.example.sebastian.gatav_project;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;
import android.widget.ImageView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;

/**
 * Created by Sebastian on 03.06.2016.
 */
public class MyGLSurfaceView extends GLSurfaceView {

    private MyRenderer renderer;
    public Context context; //
    public float[] transformationMatrix;
    // current velocity (x,y,z)
    public static float[] velocity;
    // current y-rotation, positive is z to x direction; angle zero is z-axis
    public float yRot;

    ImageView view = (ImageView)findViewById(R.id.content);


    public MyGLSurfaceView(Context context) {
        super(context);
        renderer = new MyRenderer();
        setRenderer(renderer);

        setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
    }

    private class MyRenderer implements Renderer {

        long lastFrameTime;

        public MyRenderer() {
            lastFrameTime = System.currentTimeMillis();
        }

        @Override
        public void onSurfaceCreated(GL10 gl, EGLConfig config) {
            // kommt noch
        }

        @Override
        public void onSurfaceChanged(GL10 gl, int width, int height) {
            // kommt noch
        }

        @Override
        public void onDrawFrame(GL10 gl) {
            // kommt noch
        }


    }

    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        gl.glDisable(GL10.GL_DITHER);
        gl.glHint(GL10.GL_PERSPECTIVE_CORRECTION_HINT, GL10.GL_FASTEST);

        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        gl.glEnable(GL10.GL_CULL_FACE);
        gl.glShadeModel(GL10.GL_FLAT);
        gl.glEnable(GL10.GL_DEPTH_TEST);
        gl.glDepthFunc(GL10.GL_LEQUAL);
        gl.glShadeModel(GL10.GL_SMOOTH);
        gl.glEnable(GL10.GL_DEPTH_TEST);
    }


}
