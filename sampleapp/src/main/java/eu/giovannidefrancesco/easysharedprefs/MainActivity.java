package eu.giovannidefrancesco.easysharedprefs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

import eu.giovannidefrancesco.easysharedprefslib.IStorage;
import eu.giovannidefrancesco.easysharedprefslib.SharedPreferenceStorage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.stuff);

        // init
        IStorage storage = new SharedPreferenceStorage(this, "MainActivityPrefs", MODE_PRIVATE);

        //example set

        Set<String> colors = new HashSet<>();
        colors.add("yellow");
        colors.add("pink");

        Set<Integer> numbers = new HashSet<>();
        numbers.add((int) (Math.random() * 99) + 1);
        numbers.add((int) (Math.random() * 99) + 1);
        numbers.add((int) (Math.random() * 99) + 1);

        // storing
        storage.store("string", "Hello World!");
        storage.store("boolean", true);
        storage.store("float", 32.333333f);
        storage.store("long", 123L);
        storage.store("int", 1);
        storage.store("setString", colors);
        storage.store("setNum", numbers);

        //retrieving
        String string = storage.get("string", "No string");
        boolean aBoolean = storage.get("boolean", false);
        float aFloat = storage.get("float", 0f);
        long aLong = storage.get("long", 0L);
        int anInt = storage.get("int", 0);
        Iterator<String> strings = storage.get("setString", new HashSet<String>()).iterator();
        Iterator<Integer> intgers = storage.get("setNum", new HashSet<Integer>()).iterator();

        // retrieve non-existing obj
        Object not = storage.get("nonexisting", null);

        String out = String.format(Locale.getDefault(),
                "The string:%s\nThe bool:%b\nThe float:%f\nThe long:%d\nThe int:%d\n",
                string, aBoolean, aFloat, aLong, anInt);
        out += "The Set<String>:{ ";
        while (strings.hasNext()) {
            out += strings.next() + ",";
        }
        out = out.substring(0, out.length() - 1) + "}\n";
        out += "The Set<Integer>:{ ";
        while (intgers.hasNext()) {
            out += intgers.next() + ",";
        }
        out = out.substring(0, out.length() - 1) + "}\n";

        out += "NonExisting: " + not;
        textView.setText(out);
    }
}
