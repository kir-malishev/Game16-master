package ru.samsung.itschool.game18;

import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by Кирилл on 05.12.2016.
 */
public interface Toaster {
    final int CENTER = Gravity.CENTER;
    final int TOP = Gravity.TOP;
    final int BOTTOM = Gravity.BOTTOM;
    final int SHORT = Toast.LENGTH_SHORT;
    final int LONG = Toast.LENGTH_LONG;
    void showToast(String text);
}
