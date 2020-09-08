package smartpark.com.admin.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Calendar;

import smartpark.com.admin.R;
import smartpark.com.admin.adapter.ParkingListGridAdapter;
import smartpark.com.admin.fragment.EnrollmentFragment;
import smartpark.com.admin.fragment.ParkingListFragment;
import smartpark.com.admin.fragment.SearchFragment;
import smartpark.com.admin.view.ExpandableHeightGridView;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    ParkingListFragment parkingListFragment;
    EnrollmentFragment enrollmentFragment;
    SearchFragment searchFragment;
    RelativeLayout FooterLayout1;
    RelativeLayout FooterLayout2;
    RelativeLayout FooterLayout3;
    RelativeLayout FooterLayout4;
    ImageView FooterImage1;
    ImageView FooterImage2;
    ImageView FooterImage3;
    ImageView FooterImage4;
    private int NowPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parkingListFragment = new ParkingListFragment();
        enrollmentFragment = new EnrollmentFragment();
        searchFragment = new SearchFragment();

        setTitle("주차현황");
        setFooter();
        setFrag(1);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.footer_layout_1:
                setFrag(1);
                break;
            case R.id.footer_layout_2:
                setFrag(2);
                break;
            case R.id.footer_layout_3:
                setFrag(3);
                break;
            case R.id.footer_layout_4:
                setFrag(4);
                break;
        }
    }

    public void setFrag(int n){
        switch (n){
            case 1:
                setTitle("주차현황");
                getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, parkingListFragment).commit();
                setFooterImage(1, true);
                break;
            case 2:
                setTitle("주차현황");
                getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, enrollmentFragment).commit();
                setFooterImage(2, true);
                break;
            case 3:
                setTitle("내역조회");
                getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, searchFragment).commit();
                setFooterImage(3, true);
                break;
        }
    }

    public void setFooterImage(int n, boolean activate) {
        switch (n) {
            case 1:
                if (activate) {
                    FooterImage1.setImageResource(R.drawable.ic_baseline_home_24_pink);
                    if (n != NowPage) {
                        setFooterImage(NowPage,false);
                        NowPage = n;
                    }
                } else {
                    FooterImage1.setImageResource(R.drawable.ic_baseline_home_24);
                }
                break;
            case 2:
                if (activate) {
                    FooterImage2.setImageResource(R.drawable.ic_baseline_add_circle_outline_24_pink);
                    if (n != NowPage) {
                        setFooterImage(NowPage,false);
                        NowPage = n;
                    }
                } else {
                    FooterImage2.setImageResource(R.drawable.ic_baseline_add_circle_outline_24);
                }
                break;
            case 3:
                if (activate) {
                    FooterImage3.setImageResource(R.drawable.ic_baseline_search_24_pink);
                    if (n != NowPage) {
                        setFooterImage(NowPage,false);
                        NowPage = n;
                    }
                } else {
                    FooterImage3.setImageResource(R.drawable.ic_baseline_search_24);
                }
                break;
            case 4:
                break;
            default:
                break;
        }
    }

    public void setFooter() {

        FooterLayout1 = (RelativeLayout) findViewById(R.id.footer_layout_1);
        FooterLayout2 = (RelativeLayout) findViewById(R.id.footer_layout_2);
        FooterLayout3 = (RelativeLayout) findViewById(R.id.footer_layout_3);
        FooterLayout4 = (RelativeLayout) findViewById(R.id.footer_layout_4);

        FooterImage1 = (ImageView) findViewById(R.id.footer_image_1);
        FooterImage2 = (ImageView) findViewById(R.id.footer_image_2);
        FooterImage3 = (ImageView) findViewById(R.id.footer_image_3);
        FooterImage4 = (ImageView) findViewById(R.id.footer_image_4);

        FooterLayout1.setOnClickListener(this);
        FooterLayout2.setOnClickListener(this);
        FooterLayout3.setOnClickListener(this);
        FooterLayout4.setOnClickListener(this);

    }

}