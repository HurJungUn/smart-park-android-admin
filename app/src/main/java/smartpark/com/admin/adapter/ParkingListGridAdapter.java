package smartpark.com.admin.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import smartpark.com.admin.R;

public class ParkingListGridAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> items;
    int layout;
    LayoutInflater inflater;

    public ParkingListGridAdapter(Context context, ArrayList<String> items, int layout) {
        this.context = context;
        this.items = items;
        this.layout = layout;
        inflater = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null)
            view = inflater.inflate(layout, null);
        TextView tv = (TextView)view.findViewById(R.id.car_number);
        TextView count = (TextView) view.findViewById(R.id.parking_number);
        tv.setText(items.get(i));
        count.setText((i + 1) + " 일반");

        return view;
    }
}
