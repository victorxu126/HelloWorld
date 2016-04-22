package com.example.test;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.Button;

public class MyButton extends Button {
	private String mText;
	private int x,y;
	
	public MyButton(Context context){
		super(context);
	}
	
	public void setText(String text){
		this.mText = text;
	}
	
	public void setPos(int xPos, int yPos){
		x = xPos;
		y = yPos;
	}
	
	protected void onDraw(Canvas canvas){
		super.onDraw(canvas);
		if(!(mText == null || mText.isEmpty()))
			canvas.drawText(mText, x, y, getPaint());
	}
}
