package com.example.sm.quranread;

import android.content.Intent;
import android.support.annotation.IntDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sm.quranread.model.ListForSura;
import com.example.sm.quranread.model.ListItem;
import com.example.sm.quranread.service.API;
import com.example.sm.quranread.service.SouraActivity;
import com.example.sm.quranread.service.Urls;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<ListForSura> Items;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView=(ListView)findViewById(R.id.list);
        text=(TextView)findViewById(R.id.soura);
        Retrofit r=new Retrofit.Builder().baseUrl(Urls.baseurl).addConverterFactory(GsonConverterFactory.create()).build();
        API api=r.create(API.class);
        Call<ListItem> connection=api.firstlist();
        connection.enqueue(new Callback<ListItem>() {
            @Override
            public void onResponse(Call<ListItem> call, Response<ListItem> response) {
                try{
                    Items=response.body().listForSura;
                    for(int i=0;i<Items.size();i++)
                    {
                        MyAdapter myAdapter=new MyAdapter(Items);
                        listView.setAdapter(myAdapter);
                    }
                }catch (Exception e){
                    Toast.makeText(ListActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ListItem> call, Throwable t) {
                Toast.makeText(ListActivity.this, "لا يوجد اتصال بالانترنت :(", Toast.LENGTH_SHORT).show();

            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(ListActivity.this, SouraActivity.class);
                i.putExtra("number",Items.get(position).getNumber());
                startActivity(i);
            }
        });
    }

    class MyAdapter extends BaseAdapter{

        ArrayList<ListForSura> list=new ArrayList<>();
        public MyAdapter(ArrayList<ListForSura> list)
        {
            this.list=list;
        }
        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater=getLayoutInflater();
            View view=layoutInflater.inflate(R.layout.custom,null);
            TextView txt=(TextView) view.findViewById(R.id.soura);
            txt.setText(list.get(position).getName());
            return view;
        }
    }
}
