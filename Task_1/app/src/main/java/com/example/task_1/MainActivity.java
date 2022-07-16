package com.example.task_1;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public Integer[] data = new Integer[20];
    private EditText editText;
    private ListView lv;
    Button btn;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Number> listData = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listData.add(i);
        }
        Button button = (Button) findViewById(R.id.button);
        ListView listView = (ListView) findViewById(R.id.lv);
        editText = (EditText) findViewById(R.id.et);
        button.setOnClickListener(this);
        listView.setAdapter(new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1,data));
        lv = (ListView) findViewById(R.id.lv);
        ArrayList<Integer> listItem = new ArrayList<Integer>();
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this, R.layout.item_list,data);
        lv.setAdapter(adapter);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                i++;
                String inputText = editText.getText().toString();
                List<Integer> list = new ArrayList(Arrays.asList(data));
                list.add(i - 1, Integer.parseInt(inputText));
                Integer[] nsz = new Integer[list.size()];
                list.toArray(nsz);
                int temp = 0;
                for (int m = 0; m < nsz.length - 1; m++) {
                    boolean flag = false;
                    for (int j = 0; j < nsz.length - 1 - m; j++) {
                        if (nsz[j + 1] > nsz[j]) {
                            temp = nsz[j];
                            nsz[j] = nsz[j + 1];
                            nsz[j + 1] = temp;
                            flag = true;
                        }
                    }
                    if (flag == false) {
                        break;
                    }
                }
                for (int a = 0; a <i ; a++) {
                    
                }
                R.id.txt_content=nsz;
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