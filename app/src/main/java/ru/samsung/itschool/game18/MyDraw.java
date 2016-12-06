package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

   class MyDraw extends View {

	private LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 150);
	private static ArrayList<Figure> f = new ArrayList<Figure>();
	MyDraw(Context context, AttributeSet attrs) {
		super(context);
		addFig(MainActivity.type);
	}



	static void addFig(int type)
	{

		switch (type) {
			case 0:
				f.add(new Square(100, 50));
				break;
			case 1:
				f.add(new Circle(410, 50));
				break;
			case 2:
				f.add(new Triangle(280, 50));
				break;
		}
	}


	private Paint paint = new Paint();
	@Override
	protected void onDraw(Canvas canvas) {
		for (Figure fig : f)
		{
			if (fig != null) {
				((Drawable) fig).draw(canvas);
				((Figure) fig).move();
			}
		}
		params.height = (int) f.get(0).pos.y + 100;
		this.setLayoutParams(params);

		invalidate();
	}


}
