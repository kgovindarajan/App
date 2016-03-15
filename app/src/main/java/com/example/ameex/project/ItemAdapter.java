package com.example.ameex.project;

/**
 * Created by ameex on 15/3/16.
 */
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by ameex on 18/2/16.
 */
public class ItemAdapter extends BaseAdapter {

    Context context;
    ArrayList<Item> listitems,arraylist;

    public ItemAdapter(Context context, ArrayList<Item> listitems) {
        this.context = context;
        this.listitems = listitems;
        this.arraylist = new ArrayList<Item>();
        this.arraylist.addAll(listitems);

    }

    private class ViewHolder {

        TextView textView;

    }


    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = new ViewHolder();
        LayoutInflater mInflater = (LayoutInflater)
                context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.contact_list_item, parent,false);
           /* holder.imageView = (ImageView) convertView.findViewById(R.id.img);*/
            holder.textView = (TextView) convertView.findViewById(R.id.name);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Item item = (Item) getItem(position);
        holder.textView.setText(item.getName());


        return convertView;

    }

    @Override
    public int getCount() {
        return listitems.size();
    }

    @Override
    public Object getItem(int position) {
        return listitems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listitems.indexOf(getItem(position));
    }

    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        listitems.clear();
        if (charText.length() == 0) {
            listitems.addAll(arraylist);
        } else {
            for (Item wp : arraylist) {
                if (wp.getName().toLowerCase(Locale.getDefault())
                        .contains(charText)) {
                    listitems.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }
}

