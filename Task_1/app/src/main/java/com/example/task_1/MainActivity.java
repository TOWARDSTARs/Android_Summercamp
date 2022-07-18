package com.example.task_1;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public static final String TAG = "test";
    public Integer[] data = new Integer[20];
    List<Integer> listData = new ArrayList<>();
    NumAdapter adapter;
    private EditText editText;
    private ListView lv;
    Button btn;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        ListView listView = (ListView) findViewById(R.id.lv);
        editText = (EditText) findViewById(R.id.et);
        lv = (ListView) findViewById(R.id.lv);
        NumAdapter adapter = new NumAdapter(MainActivity.this, R.layout.item_list,listData);
        lv.setAdapter(adapter);
        button.setOnClickListener(this);
        adapter.notifyDataSetChanged();
        et=(EditText) findViewById(R.id.et);
        Log.v("clip" ,et.getText().toString());


    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "onClick:click");
        switch (v.getId()) {
            case R.id.button:
                if (editText.getText().toString()!= ""){
                String inputText = editText.getText().toString();
                Integer integer=Integer.parseInt(inputText);
                listData.add(integer);
                adapter.notifyDataSetChanged();

                }
                else
                    Toast.makeText(MainActivity.this,"Tap a integer plz",Toast.LENGTH_SHORT);

                break;
            default:
                break;
        }
    }

}




























//   ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//           MainActivity.this, android.R.layout.simple_list_item_1, data);
//   ListView listView = (ListView) findViewById(R.id.list_view);
//   listView.setAdapter(adapter);








  /*  public class numAdapter extends ArrayAdapter<Num>{
        private int resourceId;
        public numAdapter(Context context,int textViewResourceId,List<Num> objects){
            super(context,textViewResourceId,objects);
            resourceId=textViewResourceId;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            Num num =getItem(position);
            View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            TextView text=(TextView) view.findViewById(R.id.txt_content);
            text.setText(Num.getContent());
            return view;
        }

    }*/