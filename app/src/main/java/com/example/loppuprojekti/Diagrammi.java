package com.example.loppuprojekti;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
/*
        import com.github.mikephil.charting.charts.BarChart;
        import com.github.mikephil.charting.components.AxisBase;
        import com.github.mikephil.charting.components.XAxis;
        import com.github.mikephil.charting.data.BarData;
        import com.github.mikephil.charting.data.BarDataSet;
        import com.github.mikephil.charting.data.BarEntry;
        import com.github.mikephil.charting.formatter.IAxisValueFormatter;
        import com.github.mikephil.charting.utils.ColorTemplate;
*/
        import java.lang.reflect.Array;
        import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.util.ArrayList;
        import java.util.Calendar;
        import java.util.Date;

/**
 * Luodaan luokka diagrammi (activity), joka perii luokan AppCompatActivityn ominaisuudet.
 * Diagrammi on sovelluksessä näkymä jossa voi seurata treenihistoriastaan diagrammia.
 */
public class Diagrammi extends AppCompatActivity {

 /*   BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagrammi);

        barChart = (BarChart) findViewById(R.id.barchart);

        barChart.setDrawBarShadow(false);
        barChart.setDrawValueAboveBar(true);
        barChart.setMaxVisibleValueCount(50);
        barChart.setPinchZoom(false);
        barChart.setDrawGridBackground(true);

        ArrayList<BarEntry> barEntries = new ArrayList<>();

        barEntries.add(new BarEntry(1,40f));
        barEntries.add(new BarEntry(2,47f));
        barEntries.add(new BarEntry(3,43f));
        barEntries.add(new BarEntry(4,45f));
        barEntries.add(new BarEntry(5,49f));

        ArrayList<BarEntry> barEntries1 = new ArrayList<>();

        barEntries1.add(new BarEntry(1,36f));
        barEntries1.add(new BarEntry(2,52f));
        barEntries1.add(new BarEntry(3,39f));
        barEntries1.add(new BarEntry(4,40f));
        barEntries1.add(new BarEntry(5,34f));


        BarDataSet barDataSet = new BarDataSet(barEntries, "Date Set1");
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        BarDataSet barDataSet1 = new BarDataSet(barEntries1, "Date Set2");
        barDataSet1.setColors(ColorTemplate.COLORFUL_COLORS);

        BarData data = new BarData(barDataSet, barDataSet1);

        float groupSpace = 0.1f;
        float barSpace = 0.02f;
        float barWidth = 0.43f;


        data.setBarWidth(0.9f);

        barChart.setData(data);

        data.setBarWidth(barWidth);
        barChart.groupBars(1, groupSpace, barSpace);

        String[] months = new String[] {"Tammi","Helmi","Maalis","Huhti","Touko"};
        XAxis xAxis = barChart.getXAxis();
        xAxis.setValueFormatter(new MyXAxisValueFormatter(months));
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);

    }


    public class MyXAxisValueFormatter implements IAxisValueFormatter{

        private String[] mValues;
        public MyXAxisValueFormatter(String[] values){
            this.mValues = values;
        }

        @Override
        public String getFormattedValue(float value, AxisBase axis){
            return mValues[(int)value];
        }
    }
*/
}


