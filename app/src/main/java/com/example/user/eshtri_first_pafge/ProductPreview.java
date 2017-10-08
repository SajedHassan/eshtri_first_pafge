package com.example.user.eshtri_first_pafge;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.eshtri_first_pafge.R.id;
import com.example.user.eshtri_first_pafge.R.layout;
import com.squareup.picasso.Picasso;

/**
 * Created by user on 8/30/2017.
 */

public class ProductPreview extends AppCompatActivity {
    private Bitmap bmap;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.product_preview);

        final Intent clickedItem = this.getIntent();

        final String name = clickedItem.getStringExtra("name");
        final String det = clickedItem.getStringExtra("det");
        final String pro = clickedItem.getStringExtra("pro");
        final String address = clickedItem.getStringExtra("address");
        final String price = clickedItem.getStringExtra("price");
        // String image = clickedItem.getStringExtra("image");
        final boolean gettingPublicProduct = clickedItem.getBooleanExtra("publicProduct", false);
        final String phone;
        final String owner;

        if (!gettingPublicProduct) {
            final SharedPreferences sharedPref = this.getSharedPreferences("users", Context.MODE_PRIVATE);
            phone = sharedPref.getString("phone", null);
            owner = sharedPref.getString("name", null);
        } else {
            phone = clickedItem.getStringExtra("phone");
            owner = clickedItem.getStringExtra("owner");
        }

        // F stands for field
        final ImageView imageView = (ImageView) this.findViewById(id.myp_roduct_image);
        final TextView nameF = (TextView) this.findViewById(id.product_name);
        final TextView phoneF = (TextView) this.findViewById(id.num);
        final TextView addressF = (TextView) this.findViewById(id.address);
        final TextView priceF = (TextView) this.findViewById(id.price);
        final TextView detF = (TextView) this.findViewById(id.details);
        final TextView proF = (TextView) this.findViewById(id.dec);
        final TextView ownerF = (TextView) this.findViewById(id.owner);

        // byte[] decodedString = Base64.decode(image, Base64.DEFAULT);
        // Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0,
        // decodedString.length);
        // imageView.setImageBitmap(decodedByte);
        //
        // Intent i = new Intent(
        // Intent.ACTION_PICK,
        // android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        //
        //
        //
        // startActivityForResult(i, 1);
        // final SyncHttpClient client = new SyncHttpClient();
        // final RequestParams params = new RequestParams();
        // params.put("text", "some string");
        // try {
        //
        // params.put("image", new
        // File("/storage/emulated/0/DCIM/Screenshots/Screenshot_20171005-200722.png"));
        // } catch (Exception e) {
        // Log.v("pol", e.getMessage());
        // }
        Picasso.with(this).load(
                "http://eshtrybadawy.000webhostapp.com/download.jpg").into(imageView);

        // new AsyncTask<Void, Void, Void>() {
        // @Override
        // protected Void doInBackground(Void... voids) {
        // client.post("https://eshtrybadawy.000webhostapp.com", params, new
        // TextHttpResponseHandler() {
        //
        // @Override
        // public void onSuccess(int statusCode, Header[] headers, String
        // responseString) {
        // // success
        //
        //
        //
        // }
        // @Override
        // public void onFailure(int statusCode, Header[] headers, String
        // responseString, Throwable throwable) {
        // // error handling
        // Toast.makeText(ProductPreview.this, "fail",
        // Toast.LENGTH_SHORT).show();
        //
        // }
        //
        //
        // });
        // return null;
        // }
        // }.execute();

        nameF.setText("Name: " + name);
        phoneF.setText("Phone: " + phone);
        addressF.setText("Address: " + address);
        detF.setText(det);
        proF.setText(pro);
        priceF.setText("Price: " + price);
        ownerF.setText("Owner: " + owner);

    }

    // protected void onActivityResult(int requestCode, int resultCode, Intent
    // data) {
    // super.onActivityResult(requestCode, resultCode, data);
    //
    // if (requestCode == 1 && resultCode == RESULT_OK && null != data) {
    // Uri selectedImage = data.getData();
    // String[] filePathColumn = { MediaStore.Images.Media.DATA };
    //
    //
    //
    // Cursor cursor = getContentResolver().query(selectedImage,
    // filePathColumn, null, null, null);
    // cursor.moveToFirst();
    //
    // int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
    // picturePath = cursor.getString(columnIndex);
    // cursor.close();
    //
    // Toast.makeText(ProductPreview.this, picturePath,
    // Toast.LENGTH_SHORT).show();
    //
    // }
    // }
}
