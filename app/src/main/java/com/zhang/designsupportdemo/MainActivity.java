package com.zhang.designsupportdemo;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    /**
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setContentView(R.layout.drawer_layout);

        setContentView(R.layout.coordinator_layout);

        /**
         final TextInputLayout textInput = (TextInputLayout) findViewById(R.id.text_input);
         textInput.setHint("请输入用户名");

         EditText text = textInput.getEditText();
         text.addTextChangedListener(new TextWatcher() {
        @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (s.length() > 10) {
        textInput.setError("用户名不能超过10位");
        textInput.setErrorEnabled(true);
        } else {
        textInput.setErrorEnabled(false);
        }
        }

        @Override public void afterTextChanged(Editable s) {

        }
        });

         final FloatingActionButton btn = (FloatingActionButton) findViewById(R.id.btn);
         btn.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View v) {
        final Snackbar snackbar = Snackbar.make(btn, "你点击了按钮", Snackbar.LENGTH_LONG);
        snackbar.show();
        snackbar.setAction("我知道了", new View.OnClickListener() {
        @Override public void onClick(View v) {
        snackbar.dismiss();
        }
        });
        }
        });
         */
        /**
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);


        List<String> titles = new ArrayList<>();
        List<Fragment> fragments = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String title = "Tab" + (i +1);
            tabs.addTab(tabs.newTab().setText(title));
            titles.add(title);

            Fragment fragment = new MyFragment(title);
            fragments.add(fragment);

        }

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(),titles,fragments);
        viewPager.setAdapter(adapter);
        tabs.setupWithViewPager(viewPager);
        tabs.setTabsFromPagerAdapter(adapter);
         */

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing);
        collapsingToolbarLayout.setTitle("自定义标题");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        }).show();
            }
        });
    }
}
