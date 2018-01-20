package com.example.wechattest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zhangsk on 1/20/18.
 */

public class ContactAdapter extends ArrayAdapter<Contact> {

    private int resourceId;

    public ContactAdapter(Context context, int resorceId, List<Contact> contacts){
        super(context,resorceId,contacts);
        this.resourceId = resorceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parentView){
        Contact currentItem = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parentView,false);

        ImageView imageView = view.findViewById(R.id.contact_photo);
        TextView textView = view.findViewById(R.id.contact_name);

        imageView.setImageResource(currentItem.getPhotoId());
        textView.setText(currentItem.getNickName());

        return view;
    }
}
