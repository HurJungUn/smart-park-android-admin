package smartpark.com.admin.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import smartpark.com.admin.R;
import smartpark.com.admin.fragment.ParkingListFragment;

public class BaseActivity extends AppCompatActivity {

    TextView HeaderTitle;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public void setTitle(String title) {

        HeaderTitle = (TextView) findViewById(R.id.header_title);
        HeaderTitle.setText(title);

    }

}
