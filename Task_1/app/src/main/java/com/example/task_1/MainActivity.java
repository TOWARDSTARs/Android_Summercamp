package com.example.task_1;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public static final String TAG = "test";
    public Integer[] data;
    List<Integer> listData = new ArrayList<>();
    NumAdapter adapter;
    private EditText editText;
    private ListView lv;
    EditText et;
    public static Integer integer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        ListView listView = (ListView) findViewById(R.id.lv);
        editText = (EditText) findViewById(R.id.et);
        lv = (ListView) findViewById(R.id.lv);
        adapter =new NumAdapter(MainActivity.this, R.layout.item_list,listData);
        lv.setAdapter(adapter);
        button.setOnClickListener(this);
        et=(EditText) findViewById(R.id.et);
        Log.v("clip" ,et.getText().toString());


    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "onClick:click");
        String str=editText.getText().toString();
        switch (v.getId()) {
            case R.id.button:
                if (editText.getText().toString().equals("")){

                Toast toast=Toast.makeText(MainActivity.this,"Type an integer plz",Toast.LENGTH_LONG);
                toast.show();
                }
                else if (this.test(str)==false){
                    Toast toast=Toast.makeText(MainActivity.this,"Type an integer plz",Toast.LENGTH_LONG);
                    toast.show();
                }
                else {
                    String inputText = String.valueOf(editText.getText());
                    Integer integer=Integer.parseInt(inputText);
                    listData.add(integer);
                    int temp=0;
                        for (int i = 0; i <listData.size()-1 ; i++) {
                            boolean flag=false;
                            for (int j = 0; j <listData.size()-1-i ; j++) {
                                if (listData.get(j+1)>(listData.get(j))){
                                    temp=listData.get(j);
                                    listData.set(j,listData.get(j+1));
                                    listData.set(j+1,temp);
                                    flag=true;
                                }
                                if(flag=false){
                                    break;
                                }
                            }
                        }
                    adapter.notifyDataSetChanged();
                }
                break;
            default:
                break;
        }
    }
    public boolean test(String str){
        for(int i=0;i<str.length();i++){
            int chr=str.charAt(i);
            if (chr<48 || chr>57){
                return false;
            }
        }
        return true;
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