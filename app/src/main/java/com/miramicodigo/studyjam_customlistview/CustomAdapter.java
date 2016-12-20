package com.miramicodigo.studyjam_customlistview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * @author Gustavo Lizarraga
 * @version 1.1
 * @date 16/12/2016 - Modified: 19/12/2016
 * #DevStudyJam
 * */

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Pokemon> items;

    public CustomAdapter(Activity activity, ArrayList data) {
        this.context = activity;
        this.items = data;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_lista, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Typeface tf_thing = Typeface.createFromAsset(
                context.getAssets(), "fonts/roboto_thin.ttf");
        Typeface tf_bold = Typeface.createFromAsset(
                context.getAssets(), "fonts/roboto_light.ttf");

        viewHolder.itemNombre.setTypeface(tf_bold);
        viewHolder.itemTipo.setTypeface(tf_thing);

        Pokemon currentItem = (Pokemon) getItem(position);
        viewHolder.itemNombre.setText(currentItem.getNombre());
        viewHolder.itemTipo.setText(currentItem.getHabilidades());
        viewHolder.itemImagen.setImageResource(currentItem.getImagen());

        return convertView;
    }

    private class ViewHolder {
        TextView itemNombre;
        TextView itemTipo;
        ImageView itemImagen;

        public ViewHolder(View view) {
            itemNombre = (TextView)view.findViewById(R.id.tvTitulo);
            itemTipo = (TextView) view.findViewById(R.id.tvSubtitulo);
            itemImagen = (ImageView) view.findViewById(R.id.ivImagen);
        }
    }

}
