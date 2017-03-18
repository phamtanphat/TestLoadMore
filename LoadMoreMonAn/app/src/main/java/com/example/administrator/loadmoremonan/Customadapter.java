package com.example.administrator.loadmoremonan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Administrator on 2/22/2017.
 */

public class Customadapter extends BaseAdapter {
    Context context;
    ArrayList<MonAn> arraylistmonan;

    public Customadapter(Context context, ArrayList<MonAn> arraylistmonan) {
        this.context = context;
        this.arraylistmonan = arraylistmonan;
    }

    @Override
    public int getCount() {
        return arraylistmonan.size();
    }

    @Override
    public Object getItem(int i) {
        return arraylistmonan.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.dong_listview,null);
        TextView txtTen = (TextView) view.findViewById(R.id.textviewTenMonAn);
        ImageView imgHinhAnh = (ImageView) view.findViewById(R.id.imageviewHinhAnh);
        MonAn monAn = (MonAn) getItem(i);
        Picasso.with(context).load(monAn.HinhAnh).into(imgHinhAnh);
        txtTen.setText(monAn.TenMonAn);
        return view;
    }
}
