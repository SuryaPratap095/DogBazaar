package com.example.suryasolanki.dogbazaar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
       // private final int[] ImageId;
       private    int[] ImageId={
            R.mipmap.dog,
            R.mipmap.cat,
            R.mipmap.bird,
            R.mipmap.animalacc,
            R.mipmap.galleries,
            R.mipmap.contact
    };

    public GridAdapter(Context c, String[] breeds){
        mContext=c;
        this.breeds=breeds;

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
        return position;
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

         //   Bitmap icon = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.animalacc);
            Bitmap bm[]=new Bitmap[breeds.length];
            bm[0]=BitmapFactory.decodeResource(mContext.getResources(), ImageId[0]);
            textName.setText(breeds[position]);
            imgGrid.setImageBitmap(null);

            imgGrid.setImageBitmap(bm[0]);
         //   imgGrid.setBackground(mContext.getResources().getDrawable(ImageId[position]));



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
        notifyDataSetChanged();
        return grid;
    }
}
