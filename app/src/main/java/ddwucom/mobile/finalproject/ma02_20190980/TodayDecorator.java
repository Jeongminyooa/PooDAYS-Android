package ddwucom.mobile.finalproject.ma02_20190980;

import android.graphics.Typeface;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;

import java.util.Date;

public class TodayDecorator implements DayViewDecorator {
    private CalendarDay date;

    public TodayDecorator() {
        date = CalendarDay.today();
    }
    @Override
    public boolean shouldDecorate(CalendarDay day) {
        return day.equals(date);
    }

    @Override
    public void decorate(DayViewFacade view) {
        view.addSpan(new StyleSpan(Typeface.BOLD));
        view.addSpan(new RelativeSizeSpan(1.4f));
        /*view.addSpan(new ForegroundColorSpan(R.color.white_brown));*/
    }

    public void setDate(Date date) {
        this.date = CalendarDay.from(date);
    }
}
