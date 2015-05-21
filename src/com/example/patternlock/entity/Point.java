package com.example.patternlock.entity;

public class Point {
	//����״̬
	public static final int STATE_NOMAL = 0;
	//ѡ��״̬
	public static final int STATE_CHECK = 1;
	//����״̬
	public static final int STATE_ERROR = 2;
	//λ�� 	�ڼ�����
	private int index;
	//����
	private float x;
	private float y;
	//״̬
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
