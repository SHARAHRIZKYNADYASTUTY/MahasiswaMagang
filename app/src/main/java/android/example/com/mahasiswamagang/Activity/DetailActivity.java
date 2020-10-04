package android.example.com.mahasiswamagang.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.example.com.mahasiswamagang.R;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class DetailActivity extends AppCompatActivity {
    ListView listView;
    SimpleAdapter adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> mylist;
    String[] jdl; //deklarasi judul iem
    String[] ktr; //deklarasi keterangan item

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        listView = (ListView)findViewById(R.id.list_view);
        jdl = new String[] {
                "Membuat App Sederhana","Tampilan UI/UX","Install Aplikasi","Maintenance","Presentasi"
        };
        ktr = new String[]{
                "12-September-2020","13-September-2020","14-September-2020","15-September-2020","16-September-2020"//jumlahnya harus sama dengan jumlah judul
        };
        mylist = new ArrayList<HashMap<String, String>>();

        for (int i=0; i<jdl.length; i++){
            map = new HashMap<String, String>();
            map.put("judul", jdl[i]);
            map.put("Keterangan", ktr[i]);
            mylist.add(map);
        }
        adapter = new SimpleAdapter(this, mylist, R.layout.list_task,
                new String[]{"judul", "Keterangan"}, new int[]{R.id.txt_judul,(R.id.txt_keterangan)});
        listView.setAdapter(adapter);


    }
}
