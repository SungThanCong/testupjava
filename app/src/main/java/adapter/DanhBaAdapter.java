package adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.karaoke.R;

import java.net.URL;
import java.util.ArrayList;

import model.DanhBa;

public class DanhBaAdapter extends ArrayAdapter<DanhBa> {
    Activity context;
    int resource;
    @NonNull ArrayList<DanhBa> objects;

    public DanhBaAdapter(@NonNull Activity context, int resource, @NonNull ArrayList<DanhBa> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.item,null);

        TextView txtName = (TextView) view.findViewById(R.id.txtName);
        TextView txtPhone = (TextView) view.findViewById(R.id.txtSDT);
        ImageView imageView = (ImageView) view.findViewById(R.id.imgAvatar);

        txtName.setText(objects.get(position).getName());
        txtPhone.setText(objects.get(position).getSdt());

        imageView.setImageResource(R.drawable.avatar);



        return view;
    }
}
