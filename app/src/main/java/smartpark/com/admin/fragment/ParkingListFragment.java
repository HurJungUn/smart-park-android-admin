package smartpark.com.admin.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Calendar;

import smartpark.com.admin.R;
import smartpark.com.admin.adapter.ParkingListGridAdapter;
import smartpark.com.admin.view.ExpandableHeightGridView;

public class ParkingListFragment extends Fragment {

    View view;
    ScrollView FragmentScroll;
    TextView refreshNow;
    TextView refreshNowUnderLine;
    ExpandableHeightGridView parkingList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.parking_list_fragment, container, false);
        init();
        return view;
    }

    public void init() {

        FragmentScroll = (ScrollView) view.findViewById(R.id.fragment_scroll);
        refreshNow = (TextView) view.findViewById(R.id.refresh_now);
        refreshNowUnderLine = (TextView) view.findViewById(R.id.refresh_now_under_line);
        parkingList = (ExpandableHeightGridView) view.findViewById(R.id.parking_list);
        ArrayList<String> a = new ArrayList<>();
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        a.add("경기 123 가 5678");
        a.add("45러 3847");
        ParkingListGridAdapter adapter = new ParkingListGridAdapter(getContext(), a, R.layout.parking_list_item);
        parkingList.setAdapter(adapter);
        parkingList.setExpanded(true);

        refreshList();
        refreshNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                refreshList();
            }
        });

        FragmentScroll.fullScroll(ScrollView.FOCUS_UP);

    }

    public void refreshList() {
        Calendar now = Calendar.getInstance();
        refreshNow.setText(now.get(Calendar.YEAR) + "-" + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + " " + now.get(Calendar.HOUR) + ":" + now.get(Calendar.MINUTE));
        refreshNowUnderLine.setText(now.get(Calendar.YEAR) + "-" + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + " " + now.get(Calendar.HOUR) + ":" + now.get(Calendar.MINUTE));
    }
}
