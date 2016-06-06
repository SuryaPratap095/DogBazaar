package com.example.suryasolanki.dogbazaar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by surya.solanki on 6/1/2016.
 */
public class GridAdapter extends BaseAdapter{
        private Context mContext;
        private final String[] breeds;
        private final int[] ImageId;

    public GridAdapter(Context c, String[] breeds,int[] ImageId){
        mContext=c;
        this.breeds=breeds;
        this.ImageId=ImageId;
    }


        //}
    @Override
    public int getCount() {

        return breeds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View grid;
        LayoutInflater inflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView==null){
            grid=new View(mContext);
            grid=inflater.inflate(R.layout.home_grid_single,null);
            TextView textName=(TextView)grid.findViewById(R.id.grid_text);
            LinearLayout linearGrid=(LinearLayout)grid.findViewById(R.id.gridLinear_image);
            ImageView imgGrid=(ImageView)grid.findViewById(R.id.grid_image);
            textName.setText(breeds[position]);
            imgGrid.setImageResource(ImageId[position]);
            linearGrid.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext,"You clicked At"+breeds[+position], Toast.LENGTH_SHORT).show();
                }
            });
        }
        else{
            grid=(View)convertView;
        }

        return grid;
    }
}
