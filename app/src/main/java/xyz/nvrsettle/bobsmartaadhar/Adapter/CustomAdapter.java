package xyz.nvrsettle.bobsmartaadhar.Adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import xyz.nvrsettle.bobsmartaadhar.Models.TransactionCardModel;
import xyz.nvrsettle.bobsmartaadhar.Models.TranstModel;
import xyz.nvrsettle.bobsmartaadhar.Models.UserModel;
import xyz.nvrsettle.bobsmartaadhar.R;

/**
 * Created by abhijeet on 15/3/18.
 */

public class CustomAdapter extends ArrayAdapter<TransactionCardModel> {

    private Activity context;
    private List<TransactionCardModel> transactionCardModelList;
    String tag = "";

    public CustomAdapter(Activity context, List<TransactionCardModel> transactionCardModels)
    {
        super(context,R.layout.transaction_list_card, transactionCardModels);
        this.context=context;
        this.transactionCardModelList = transactionCardModels;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.transaction_list_card,null,true);


        TextView by = (TextView) listViewItem.findViewById(R.id.byAadharNo);
        TextView from = (TextView) listViewItem.findViewById(R.id.fromAadharNo);
        TextView to = (TextView) listViewItem.findViewById(R.id.toAadharNo);
        TextView date = (TextView) listViewItem.findViewById(R.id.date);
        TextView amount = (TextView) listViewItem.findViewById(R.id.amount);
        TextView wORd = (TextView) listViewItem.findViewById(R.id.w_or_d);


        TransactionCardModel transactionCardModel = transactionCardModelList.get(position);
        by.setText(transactionCardModel.getByAadharNo());
        from.setText(transactionCardModel.getFromAadharNo());
        to.setText(transactionCardModel.getToAadharNo());
        date.setText(String.valueOf(transactionCardModel.getDate()));
        amount.setText(String.valueOf(transactionCardModel.getAmountTranst()));


        return listViewItem;

    }
}
