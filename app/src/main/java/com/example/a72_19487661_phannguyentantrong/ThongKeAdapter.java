package com.example.a72_19487661_phannguyentantrong;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ThongKeAdapter extends BaseAdapter {
    Context ctx;
    int layout;
    List<Bussiness> list;

    public ThongKeAdapter(Context ctx, int layout, List<Bussiness> list) {
        this.ctx = ctx;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layout,viewGroup,false);

        TextView txtTencv = view.findViewById(R.id.txtTenCV);
        TextView txtMucDo = view.findViewById(R.id.txtMucDo);
        TextView txtThoiGian = view.findViewById(R.id.txtThoiGian);

        txtTencv.setText(list.get(i).getTenCongViec());
        txtMucDo.setText(list.get(i).getMucDo());
        txtThoiGian.setText(list.get(i).getThoiGian());

        return view;
    }
}
