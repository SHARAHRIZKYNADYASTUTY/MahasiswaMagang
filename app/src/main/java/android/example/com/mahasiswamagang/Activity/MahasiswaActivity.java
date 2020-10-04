package android.example.com.mahasiswamagang.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.example.com.mahasiswamagang.R;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MahasiswaActivity extends AppCompatActivity {
    ListView listView;
    SimpleAdapter adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> mylist;
    String[] jdl; //deklarasi judul iem
    String[] ktr; //deklarasi keterangan item
    String[] img; //deklarasi image item

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahasiswa);
        listView = (ListView)findViewById(R.id.list_view);
        jdl = new String[] {
                "Sharah","Maretta","Nava","Azizah","Ega Kustian"
        };
        ktr = new String[]{
                "Teknik Informatka","Teknik Informatka","Teknik Komputer","Manajemen Informatka","Teknik Informatka"//jumlahnya harus sama dengan jumlah judul
        };
        img = new String[]{
                Integer.toString(R.drawable.ic_launcher_background),Integer.toString(R.drawable.ic_launcher_background),Integer.toString(R.drawable.ic_launcher_background),
                Integer.toString(R.drawable.ic_launcher_background),Integer.toString(R.drawable.ic_launcher_background)
        };
        mylist = new ArrayList<HashMap<String, String>>();

        for (int i=0; i<jdl.length; i++){
            map = new HashMap<String, String>();
            map.put("judul", jdl[i]);
            map.put("Keterangan", ktr[i]);
            map.put("Gambar", img[i]);
            mylist.add(map);
        }
        adapter = new SimpleAdapter(this, mylist, R.layout.list_item,
                new String[]{"judul", "Keterangan", "Gambar"}, new int[]{R.id.txt_judul,(R.id.txt_keterangan),(R.id.img)});
        listView.setAdapter(adapter);


    }
}
