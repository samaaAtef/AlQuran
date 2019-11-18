package com.example.sm.quranread.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sm.quranread.R;
import com.example.sm.quranread.model.Ayahs;
import com.example.sm.quranread.model.ListForSura;
import com.example.sm.quranread.model.ListItem2;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SouraActivity extends AppCompatActivity {

    ArrayList<Ayahs> ayahs;
    Call<ListItem2> connection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soura);

        final TextView txt=(TextView)findViewById(R.id.txtshowsoura);
        Intent intent=getIntent();
        int num=intent.getIntExtra("number",0);
        Retrofit retrofit=new Retrofit.Builder().baseUrl(Urls.baseurl).addConverterFactory(GsonConverterFactory.create()).build();

        API api=retrofit.create(API.class);
        switch (num){
            case(1): { connection=api.one(); break;}
            case(2): { connection=api.one2(); break;}
            case(3): { connection=api.one3(); break;}
            case(4): { connection=api.one4(); break;}
            case(5): { connection=api.one5(); break;}
            case(6): { connection=api.one6(); break;}
            case(7): { connection=api.one7(); break;}
            case(8): { connection=api.one8(); break;}
            case(9): { connection=api.one9(); break;}
            case(10): { connection=api.one10(); break;}
            case(11): { connection=api.one11(); break;}
            case(12): { connection=api.one12(); break;}
            case(13): { connection=api.one13(); break;}
            case(14): { connection=api.one14(); break;}
            case(15): { connection=api.one15(); break;}
            case(16): { connection=api.one16(); break;}
            case(17): { connection=api.one17(); break;}
            case(18): { connection=api.one18(); break;}
            case(19): { connection=api.one19(); break;}
            case(20): { connection=api.one20(); break;}
            case (21): { connection=api.one21(); break;}
            case(22): { connection=api.one22(); break;}
            case(23): { connection=api.one23(); break;}
            case(24): { connection=api.one24(); break;}
            case(25): { connection=api.one25(); break;}
            case(26): { connection=api.one26(); break;}
            case(27): { connection=api.one27(); break;}
            case(28): { connection=api.one28(); break;}
            case(29): { connection=api.one29(); break;}
            case(30): { connection=api.one30(); break;}
            case(31): { connection=api.one31(); break;}
            case(32): { connection=api.one32(); break;}
            case(33): { connection=api.one33(); break;}
            case(34): { connection=api.one34(); break;}
            case(35): { connection=api.one35(); break;}
            case(36): { connection=api.one36(); break;}
            case(37): { connection=api.one37(); break;}
            case(38): { connection=api.one38(); break;}
            case(39): { connection=api.one39(); break;}
            case(40): { connection=api.one40(); break;}
            case(41): { connection=api.one41(); break;}
            case(42): { connection=api.one42(); break;}
            case(43): { connection=api.one43(); break;}
            case(44): { connection=api.one44(); break;}
            case(45): { connection=api.one45(); break;}
            case(46): { connection=api.one46(); break;}
            case(47): { connection=api.one47(); break;}
            case(48): { connection=api.one48(); break;}
            case(49): { connection=api.one49(); break;}
            case(50): { connection=api.one50(); break;}
            case(51): { connection=api.one51(); break;}
            case(52): { connection=api.one52(); break;}
            case(53): { connection=api.one53(); break;}
            case(54): { connection=api.one54(); break;}
            case(55): { connection=api.one55(); break;}
            case(56): { connection=api.one56(); break;}
            case(57): { connection=api.one57(); break;}
            case(58): { connection=api.one58(); break;}
            case(59): { connection=api.one59(); break;}
            case(60): { connection=api.one60(); break;}
            case(61): { connection=api.one61(); break;}
            case(62): { connection=api.one62(); break;}
            case(63): { connection=api.one63(); break;}
            case(64): { connection=api.one64(); break;}
            case(65): { connection=api.one65(); break;}
            case(66): { connection=api.one66(); break;}
            case(67): { connection=api.one67(); break;}
            case(68): { connection=api.one68(); break;}
            case(69): { connection=api.one69(); break;}
            case(70): { connection=api.one70(); break;}
            case(71): { connection=api.one71(); break;}
            case(72): { connection=api.one72(); break;}
            case(73): { connection=api.one73(); break;}
            case(74): { connection=api.one74(); break;}
            case(75): { connection=api.one75(); break;}
            case(76): { connection=api.one76(); break;}
            case(77): { connection=api.one77(); break;}
            case(78): { connection=api.one78(); break;}
            case(79): { connection=api.one79(); break;}
            case(80): { connection=api.one80(); break;}
            case(81): { connection=api.one81(); break;}
            case(82): { connection=api.one82(); break;}
            case(83): { connection=api.one83(); break;}
            case(84): { connection=api.one84(); break;}
            case(85): { connection=api.one85(); break;}
            case(86): { connection=api.one86(); break;}
            case(87): { connection=api.one87(); break;}
            case(88): { connection=api.one88(); break;}
            case(89): { connection=api.one89(); break;}
            case(90): { connection=api.one90(); break;}
            case(91): { connection=api.one91(); break;}
            case(92): { connection=api.one92(); break;}
            case(93): { connection=api.one93(); break;}
            case(94): { connection=api.one94(); break;}
            case(95): { connection=api.one95(); break;}
            case(96): { connection=api.one96(); break;}
            case(97): { connection=api.one97(); break;}
            case(98): { connection=api.one98(); break;}
            case(99): { connection=api.one99(); break;}
            case(100): { connection=api.one100(); break;}
            case(101): { connection=api.one101(); break;}
            case(102): { connection=api.one102(); break;}
            case(103): { connection=api.one103(); break;}
            case(104): { connection=api.one104(); break;}
            case(105): { connection=api.one105(); break;}
            case(106): { connection=api.one106(); break;}
            case(107): { connection=api.one107(); break;}
            case(108): { connection=api.one108(); break;}
            case(109): { connection=api.one109(); break;}
            case(110): { connection=api.one110(); break;}
            case(111): { connection=api.one111(); break;}
            case(112): { connection=api.one112(); break;}
            case(113): { connection=api.one113(); break;}
            case(114): { connection=api.one114(); break;}
        }


        connection.enqueue(new Callback<ListItem2>() {
            @Override
            public void onResponse(Call<ListItem2> call, Response<ListItem2> response) {
                try{
                    ayahs=response.body().data.getAyahses();
                    for(int i=0;i<ayahs.size();i++) {
                            txt.append(ayahs.get(i).getText()+" ");
                          //  txtnum.append(String.valueOf(ayahs.get(i).getNumber2()-1));
                    }
                }catch (Exception e){
                    Toast.makeText(SouraActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ListItem2> call, Throwable t) {
                Toast.makeText(SouraActivity.this, "لا يوجد اتصال بالانترنت :(", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
