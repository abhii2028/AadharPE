package xyz.nvrsettle.bobsmartaadhar.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import xyz.nvrsettle.bobsmartaadhar.Adapter.CustomAdapter;
import xyz.nvrsettle.bobsmartaadhar.Models.TransactionCardModel;
import xyz.nvrsettle.bobsmartaadhar.R;

public class TransactionActivity extends AppCompatActivity {

    private DatabaseReference mdatabase;
    ListView transactionCardList;
    List<TransactionCardModel> item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        transactionCardList = (ListView)findViewById(R.id.transaction_card_list);

        mdatabase = FirebaseDatabase.getInstance().getReference().child("transt");
        item = new ArrayList<>();

        mdatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                fetchData(dataSnapshot);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    private void fetchData(DataSnapshot dataSnapshot)
    {
        item.clear();
        for (DataSnapshot ds : dataSnapshot.getChildren())
        {
            TransactionCardModel a = ds.getValue(TransactionCardModel.class);
            item.add(0,a);



        }
        CustomAdapter adapter = new CustomAdapter(TransactionActivity.this,item);
        transactionCardList.setAdapter(adapter);
    }
}
