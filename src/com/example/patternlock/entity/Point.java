package com.example.patternlock.entity;

public class Point {
	//正常状态
	public static final int STATE_NOMAL = 0;
	//选中状态
	public static final int STATE_CHECK = 1;
	//错误状态
	public static final int STATE_ERROR = 2;
	//位置 	第几个点
	private int index;
	//坐标
	private float x;
	private float y;
	//状态
	private int state;
	
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
}
