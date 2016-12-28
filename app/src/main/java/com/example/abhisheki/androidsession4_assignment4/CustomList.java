package com.example.abhisheki.androidsession4_assignment4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by ABHISHEKI on 27-12-2016.
 */

public class CustomList extends ArrayAdapter<Integer> {

    private Integer[] images;
    private String[]  names;

    private Activity context;

    public CustomList(Activity context, Integer[] Images,String[] Names) {
        super(context, R.layout.activity_listview, Images);
        this.context = context;
        this.images  = Images;
        this.names   = Names;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.activity_listview, null, true);
        ImageView image = (ImageView) listViewItem.findViewById(R.id.imageView);
        TextView txtname = (TextView) listViewItem.findViewById(R.id.txtName);

        image.setImageResource(images[position]);
        txtname.setText(names[position]);
        return  listViewItem;
    }

}
