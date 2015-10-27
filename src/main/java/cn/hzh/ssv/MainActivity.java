package cn.hzh.ssv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import cn.hzh.ssv.view.SlidingSwitcherView;

public class MainActivity extends AppCompatActivity
{
    private SlidingSwitcherView mSsview;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mSsview = (SlidingSwitcherView) findViewById(R.id.id_switch_view);
        mSsview.setOnItemClickListener(new SlidingSwitcherView.OnItemClickListener()
        {
            @Override
            public void onClick(View view, int index)
            {
                Toast.makeText(MainActivity.this, index + "", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
