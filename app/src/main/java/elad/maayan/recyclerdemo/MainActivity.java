package elad.maayan.recyclerdemo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contact> contacts;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv1);
        contacts = new ArrayList<>();
        setContacts();
        setAdapter();

    }

    private void setAdapter() {
        recyclerAdapter adapter = new recyclerAdapter(contacts);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getApplicationContext());
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);
    }

    private void setContacts() {
        contacts.add(new Contact("john"));
        contacts.add(new Contact("Lennon"));
        contacts.add(new Contact("Ringo"));
        contacts.add(new Contact("Shahaf"));
        contacts.add(new Contact("Nizan"));
        contacts.add(new Contact("Elad"));
        contacts.add(new Contact("Gaya"));
        contacts.add(new Contact("idan"));
        contacts.add(new Contact("Ariel"));
        contacts.add(new Contact("Iyan"));
        contacts.add(new Contact("yonathan"));

    }
}