package com.example.patternlock.view;

import com.example.patternlock.activity.R;
import com.example.patternlock.entity.Point;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class PatternLockView extends View {

	private Point[][] points = new Point[3][3];
	
	private boolean isInit = false;
	//���ֿ��
	private float width;
	private float height;
	//ƫ����
	private float offsetX;
	private float offsetY;
	//ͼƬ��Դ
	private Bitmap point_nomal;
	private Bitmap point_check;
	private Bitmap point_error;
	
	private Bitmap line_nomal;
	private Bitmap line_error;
	//����
	private Paint paint = new Paint();
	//����λ��
	private float movingX;
	private float movingY;
	/*
	 * ���캯��
	 */
	public PatternLockView(Context context) {
		super(context);
	}

	public PatternLockView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	public PatternLockView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		if(!isInit){
			initPoints();
		}
		points2Canvas(canvas);
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		movingX = event.getX();
		movingY = event.getY();
		
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			
			break;
		case MotionEvent.ACTION_MOVE:
			
			break;
		case MotionEvent.ACTION_UP:
	
			break;
		}
		
		return true;
	}

	/**
	 * ���Ƿ�ѡ��
	 */
	private Point checkedPoint(){
		for(int i = 0; i < points.length; i ++){
			for(int j = 0; j < points[i].length; j ++){
				Point 
			}
		}
		return point;
	}
	/**
	 * ��ʼ����
	 */
	private void initPoints() {
		//1.��ȡ���
		width = getWidth();
		height = getHeight();
		//2.ƫ����
		if( width > height){//����X����ƫ��
			offsetX = (width - height) / 2;
			width = height;
		}
		else{//����Y��ƫ��
			offsetY = (height - width) / 2;
			height = width;
		}
		//3.����ͼƬ��Դ
		point_nomal = BitmapFactory.decodeResource(getResources(), R.drawable.point_nomal);
		point_check = BitmapFactory.decodeResource(getResources(), R.drawable.point_check);
		point_error = BitmapFactory.decodeResource(getResources(), R.drawable.point_error);
		
		line_nomal = BitmapFactory.decodeResource(getResources(), R.drawable.line_nomal);
		line_error = BitmapFactory.decodeResource(getResources(), R.drawable.line_error);
		//4.ȷ�����λ��
		points[0][0] = new Point(offsetX + width / 4, offsetY + width / 4);
		points[0][1] = new Point(offsetX + width / 2, offsetY + width / 4);
		points[0][2] = new Point(offsetX + width - width / 4, offsetY + width / 4);
		
		points[1][0] = new Point(offsetX + width / 4, offsetY + width / 2);
		points[1][1] = new Point(offsetX + width / 2, offsetY + width / 2);
		points[1][2] = new Point(offsetX + width - width / 4, offsetY + width / 2);
		
		points[2][0] = new Point(offsetX + width / 4, offsetY + width - width / 4);
		points[2][1] = new Point(offsetX + width / 2, offsetY + width - width / 4);
		points[2][2] = new Point(offsetX + width - width / 4, offsetY + width - width / 4);
		//5.���ñ�ʶλ
		isInit = true;
	}
	/**
	 * �ѵ���Ƶ�����
	 * @param canvas ����
	 */
	private void points2Canvas(Canvas canvas) {
		for(int i = 0; i < points.length; i ++){
			for(int j = 0; j < points[i].length; j ++){
				if(points[i][j].getState() == Point.STATE_CHECK){
					canvas.drawBitmap(point_check, points[i][j].getX() - point_nomal.getWidth() / 2,
							points[i][j].getY()  - point_nomal.getWidth() / 2, paint);
				}
				else if(points[i][j].getState() == Point.STATE_ERROR){
					canvas.drawBitmap(point_error, points[i][j].getX() - point_nomal.getWidth() / 2,
							points[i][j].getY() - point_nomal.getWidth() / 2, paint);
				}
				else{
					canvas.drawBitmap(point_nomal, points[i][j].getX() - point_nomal.getWidth() / 2, 
							points[i][j].getY() - point_nomal.getWidth() / 2, paint);
				}
			}
		}
	}
	
}
