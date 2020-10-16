package com.example.nativechat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

import android.util.Pair;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED)
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 10);

        ArrayList<Pair <String,String> > lang = new ArrayList <Pair <String,String> > ();
        lang.add(new Pair <String,String> ("af", "Afrikaans"));
        lang.add(new Pair <String,String> ("sq", "Albanian"));
        lang.add(new Pair <String,String> ("am", "Amharic"));
        lang.add(new Pair <String,String> ("ar", "Arabic"));
        lang.add(new Pair <String,String> ("hy", "Armanian"));
        lang.add(new Pair <String,String> ("az", "Azerbaijani"));
        lang.add(new Pair <String,String> ("eu", "Basque"));
        lang.add(new Pair <String,String> ("be", "Belarusian"));
        lang.add(new Pair <String,String> ("bn", "Bengali"));
        lang.add(new Pair <String,String> ("bs", "Bosnian"));
        lang.add(new Pair <String,String> ("bg", "Bulgarian"));
        lang.add(new Pair <String,String> ("ca", "Catalan"));
        lang.add(new Pair <String,String> ("ceb", "Cebuano"));
        lang.add(new Pair <String,String> ("ny", "Chichewa"));
        lang.add(new Pair <String,String> ("zh-CN", "Chinese (Simplified)"));
        lang.add(new Pair <String,String> ("zh-TW", "Chinese (Traditional)"));
        lang.add(new Pair <String,String> ("co", "Corsican"));
        lang.add(new Pair <String,String> ("hr", "Croatian"));
        lang.add(new Pair <String,String> ("cs", "Czech"));
        lang.add(new Pair <String,String> ("da", "Danish"));
        lang.add(new Pair <String,String> ("nl", "Dutch"));
        lang.add(new Pair <String,String> ("en", "English"));
        lang.add(new Pair <String,String> ("eo", "Esperanto"));
        lang.add(new Pair <String,String> ("et", "Estonian"));
        lang.add(new Pair <String,String> ("tl", "Filipino"));
        lang.add(new Pair <String,String> ("fi", "Finnish"));
        lang.add(new Pair <String,String> ("fr", "French"));
        lang.add(new Pair <String,String> ("fy", "Frisian"));
        lang.add(new Pair <String,String> ("gl", "Galician"));
        lang.add(new Pair <String,String> ("ka", "Georgian"));
        lang.add(new Pair <String,String> ("de", "German"));
        lang.add(new Pair <String,String> ("el", "Greek"));
        lang.add(new Pair <String,String> ("gu", "Gujarati"));
        lang.add(new Pair <String,String> ("ht", "Haitian Creole"));
        lang.add(new Pair <String,String> ("ha", "Hausa"));
        lang.add(new Pair <String,String> ("haw", "Hawaiian"));
        lang.add(new Pair <String,String> ("he", "Hebrew"));
        lang.add(new Pair <String,String> ("iw", "Hebrew"));
        lang.add(new Pair <String,String> ("hi", "Hindi"));
        lang.add(new Pair <String,String> ("hmn", "Hmong"));
        lang.add(new Pair <String,String> ("hu", "Hungarian"));
        lang.add(new Pair <String,String> ("is", "Icelandic"));
        lang.add(new Pair <String,String> ("ig", "Igbo"));
        lang.add(new Pair <String,String> ("id", "Indonesian"));
        lang.add(new Pair <String,String> ("ga", "Irish"));
        lang.add(new Pair <String,String> ("it", "Italian"));
        lang.add(new Pair <String,String> ("ja", "Japanese"));
        lang.add(new Pair <String,String> ("jw", "Javanese"));
        lang.add(new Pair <String,String> ("kn", "Kannada"));
        lang.add(new Pair <String,String> ("kk", "Kazakh"));
        lang.add(new Pair <String,String> ("km", "Khmer"));
        lang.add(new Pair <String,String> ("ko", "Korean"));
        lang.add(new Pair <String,String> ("ku", "Kurdish (Kurmanji)"));
        lang.add(new Pair <String,String> ("ky", "Kyrgyz"));
        lang.add(new Pair <String,String> ("lo", "Lao"));
        lang.add(new Pair <String,String> ("la", "Latin"));
        lang.add(new Pair <String,String> ("lv", "Latvian"));
        lang.add(new Pair <String,String> ("lt", "Lithuanian"));
        lang.add(new Pair <String,String> ("lb", "Luxembourgish"));
        lang.add(new Pair <String,String> ("mk", "Macedonian"));
        lang.add(new Pair <String,String> ("mg", "Malagasy"));
        lang.add(new Pair <String,String> ("ms", "Malay"));
        lang.add(new Pair <String,String> ("ml", "Malayalam"));
        lang.add(new Pair <String,String> ("mt", "Maltese"));
        lang.add(new Pair <String,String> ("mi", "Maori"));
        lang.add(new Pair <String,String> ("mr", "Marathi"));
        lang.add(new Pair <String,String> ("mn", "Mongolian"));
        lang.add(new Pair <String,String> ("my", "Myanmar (Burmese)"));
        lang.add(new Pair <String,String> ("ne", "Nepali"));
        lang.add(new Pair <String,String> ("no", "Norwegian"));
        lang.add(new Pair <String,String> ("ps", "Pashto"));
        lang.add(new Pair <String,String> ("fa", "Persian"));
        lang.add(new Pair <String,String> ("pl", "Polish"));
        lang.add(new Pair <String,String> ("pt", "Portuguese"));
        lang.add(new Pair <String,String> ("pa", "Punjabi"));
        lang.add(new Pair <String,String> ("ro", "Romanian"));
        lang.add(new Pair <String,String> ("ru", "Russian"));
        lang.add(new Pair <String,String> ("sm", "Samoan"));
        lang.add(new Pair <String,String> ("gd", "Scots Gaelic"));
        lang.add(new Pair <String,String> ("sr", "Serbian"));
        lang.add(new Pair <String,String> ("st", "Sesotho"));
        lang.add(new Pair <String,String> ("sn", "Shona"));
        lang.add(new Pair <String,String> ("sd", "Sindhi"));
        lang.add(new Pair <String,String> ("si", "Sinhala"));
        lang.add(new Pair <String,String> ("sk", "Slovak"));
        lang.add(new Pair <String,String> ("sl", "Slovenian"));
        lang.add(new Pair <String,String> ("so", "Somali"));
        lang.add(new Pair <String,String> ("es", "Spanish"));
        lang.add(new Pair <String,String> ("su", "Sundanese"));
        lang.add(new Pair <String,String> ("sw", "Swahili"));
        lang.add(new Pair <String,String> ("sv", "Swedish"));
        lang.add(new Pair <String,String> ("tg", "Tajik"));
        lang.add(new Pair <String,String> ("ta", "Tamil"));
        lang.add(new Pair <String,String> ("te", "Telugu"));
        lang.add(new Pair <String,String> ("th", "Thai"));
        lang.add(new Pair <String,String> ("tr", "Turkish"));
        lang.add(new Pair <String,String> ("uk", "Ukrainian"));
        lang.add(new Pair <String,String> ("ur", "Urdu"));
        lang.add(new Pair <String,String> ("uz", "Uzbek"));
        lang.add(new Pair <String,String> ("vi", "Vietnamese"));
        lang.add(new Pair <String,String> ("cy", "Welsh"));
        lang.add(new Pair <String,String> ("xh", "Xhosa"));
        lang.add(new Pair <String,String> ("yi", "Yiddish"));
        lang.add(new Pair <String,String> ("yo", "Yoruba"));
        lang.add(new Pair <String,String> ("zu", "Zulu"));

        ArrayList<String > RawLang = new ArrayList <String>  ();
        for(Pair<String,String> i : lang ){
            RawLang.add(i.second);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, RawLang);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner LanguageList = (Spinner) findViewById(R.id.Lang);
        LanguageList.setAdapter(adapter);

        EditText editText = findViewById(R.id.editText);

        findViewById(R.id.enterBtn)
                .setOnClickListener(v -> {


                    Intent intent = new Intent(this, ChatActivity.class);
                    intent.putExtra("name", editText.getText().toString());

                    intent.putExtra("language", lang.get(RawLang.indexOf(LanguageList.getSelectedItem().toString())).first);//Language prference is sent to the Chat activity
                    startActivity(intent);

                });

    }
}