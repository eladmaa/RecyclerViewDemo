package elad.maayan.recyclerdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {
    ArrayList<Contact> contactList;

    public recyclerAdapter(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }


    @NonNull
    @Override
    public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View ContactView  = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list, parent, false);
        return new MyViewHolder(ContactView);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.MyViewHolder holder, int position) {
        String name = contactList.get(position).getName();
        holder.nameTxt.setText(name);
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView nameTxt;
        public MyViewHolder(final View view){
            super(view);
            nameTxt = view.findViewById(R.id.textView2);
        }
    }
}
