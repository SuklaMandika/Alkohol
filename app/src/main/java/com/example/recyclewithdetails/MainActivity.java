package com.example.recyclewithdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> gambarUrls = new ArrayList<>();
    private ArrayList<String> penjelasan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        gambarUrls.add("http://www.thedrinksbusiness.com/wordpress/wp-content/uploads/2014/02/Johnnie-Walker-Whiskey-Wallpaper.jpg");
        mNames.add("Jonnie Walker");
        mDesc.add("Kilmarnock, Skotlandia");
        penjelasan.add(" Johnnie walker adalah sebuah merek wiski yang paling tersebar luas ke seluruh dunia. Untuk merek Johnnie walker ini sudah hampir terjaul ke seluruh dunia dan juga penjualan tahunan hampir mencapai 130 juta botol.");

        gambarUrls.add("https://2.bp.blogspot.com/_SERvDOadQ3A/TUGGnB5De2I/AAAAAAAAAHM/OVg70tv-Qg4/s320/absolut_vodka_family_.jpg");
        mNames.add("Vodka");
        mDesc.add("Polandia, Rusia");
        penjelasan.add(" Vodka memiliki kandungan alkohol 40 persen meski memang kandungan yang dianggap sempurna justru adalah 38 persen menurut Museum Vodka yang ada di Rusia. Hanya saja, pada zaman itu, pajak yang dikenakan ternyata tergantung dari kadar alkoholnya, sehingga kenaikan persentase pun menjadi solusi dan akhirnya menjadi 40 persen supaya penghitungan pajak lebih mudah.");

        gambarUrls.add("https://cintaihidup.com/wp-content/uploads/2017/02/wine-426466-1024x766.jpg");
        mNames.add("Wine");
        mDesc.add("Amerika Serikat");
        penjelasan.add("Wine atau anggur adalah jenis mjinuman beralkohol lainnya yang kerap dikonsumsi ketika berpesta. Wine sendiri kadang merupakan symbol kemewahan dan berdasarkan penelitian ilmiah, mengkonsumsi wine atau anggur dalam takaran tertentu secara rutin bisa mengurangi resiko penyakit jantung. Wine terbuat dari buah anggur yang dihancurkan kemudian difermentasikan dengan menggunakan  bantuan ragi Saccharomyces cerevesiae. Proses fermentasi anggur bisa berlangsung selama beberapa minggu hingga berbulan-bulan. Kandungan alkohol dalam wine sekitar 8 hingga 14%.");

        gambarUrls.add("https://cintaihidup.com/wp-content/uploads/2017/02/water-69742-1024x683.jpg");
        mNames.add("Rum");
        mDesc.add("Amerika Serikat");
        penjelasan.add("Rum adalah sejenis minuman beralkohol terdestilasi yang terbuat dari sari tebu atau molases yang difermentasikan. Rum biasanya dikemas dalam botol dan dipasarkan dinegara-negara Eropa dan Amerika dan mengandung sekitar 37,5% alkohol.");

        gambarUrls.add("https://cintaihidup.com/wp-content/uploads/2017/02/brandy-402572-1024x683.jpg");
        mNames.add("Brandy");
        mDesc.add("Belanda");
        penjelasan.add("Brandy, tipe minuman keras jenis destilasi atau hasil penyulinganini banyak dikonsumsi dan memiliki warna coklat karamel. Minuman ini biasnaya dibuat dari hasil penyulingan wine atau anggur dan biasanya kandungan alkoholnya berkisar antara 35-60%. Brandy biasa dikonsumsi sebagai minuman setelah makan malam.");

        gambarUrls.add("https://cintaihidup.com/wp-content/uploads/2017/02/tequila-bottle-1353391-1024x683.jpg");
        mNames.add("Tequila");
        mDesc.add("Meksiko");
        penjelasan.add("Tequila adalah sejenis minuman keras khas kota Tequila, Meksiko yang terbuat dari tanaman blue agave atau Agave tequilana dengan bantuan fermentasi mikroba. Warna tequila bisa bervariasi dari putih hingga karamel kecoklatan dan kadar alkohol yang dikandungnya sekitar 35%. Minuman yang telah ada sejak abad ke 16 ini memiliki banyak varian seperti Bianco, Juven, Reposado dan lain sebagainya.");

        gambarUrls.add("https://cintaihidup.com/wp-content/uploads/2017/02/table-2060499-1024x681.jpg");
        mDesc.add("Whiskey");
        mDesc.add("Skotlandia");
        penjelasan.add("Whiskey juga merupakan jenis minuman keras hasil penyulingan yang banyak dikenal dan dikonsumsi masyarakat. Minuman whiskey juga terbuat dari hasil fermentasi biji-bijian yang kemudian disuling dan dikemas. Uniknya, hasil fermentasi whiskey dibuat dan disimpan dalam sebuah gentong atau tong kayu yang terbuat dari pohon oak putih. Kandungan alkohol dalam whiskey cukup tinggi yakni sekitar 40%.");

        gambarUrls.add("https://cintaihidup.com/wp-content/uploads/2017/02/sake-985413-1024x768.jpg");
        mNames.add("Moonshine");
        mDesc.add("Amerika");
        penjelasan.add("Mungkin kita belum terlalu familiar dengan istilah moonshine tapi istilah minuman keras yang satu ini adalah jenis minuman keras tradisional yang diproduksi diseluruh dunia dengan karakter yang berbeda-beda. Misalnya saja arak dari Indonesia atau sake yang terkenal dari negara Jepang. Kadar alkohol yang dikandung moonshine juga cukup tinggi yakni sekitar 35 hingga 40%.");

        gambarUrls.add("https://cintaihidup.com/wp-content/uploads/2017/02/alcohol-1838386_1920-1024x683.jpg");
        mNames.add("Alcopops");
        mDesc.add("Jepang");
        penjelasan.add("Berbeda dengan jenis minuman keras lainnya, alcopops bukan minuman keras murni yang hanya terdiri dari air dan alkohol melainkan campuran alkohol dengan minuman ringan seperti soft drink atau jus buah. Karena hanya mengandung campuran, alcopops hanya mengandung sekitar 4 hingga 5% alkohol didalamnya.");

        gambarUrls.add("https://cintaihidup.com/wp-content/uploads/2017/02/cold-beer-564401-1024x683.jpg");
        mNames.add("Beer");
        mDesc.add("Mesir");
        penjelasan.add("Beer adalah minuman beralkohol yang terbuat dari hasil fermentasi biji-bijian seperti barley, sorgum, gandum, beras, jagung dan lain sebagainya. Proses pembutan beer harus melalui fermentasi yang dikenal dengan istilah “brewing” dan kadar alkohol yang terkandung dalam beer setelah jadi adalah 4 hingga 6%. Beer juga memiliki banyak varian dan namanya tentu disesuaikan dengan nama negara dimana ia dibuat.");





        initRecyclerView();

    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, mNames, gambarUrls, mDesc, penjelasan);
        recyclerView.setAdapter(adapter);
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames, gambarUrls, mDesc, penjelasan);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridActivity adapter = new GridActivity(this, mNames, gambarUrls, mDesc, penjelasan);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyleList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                initRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}