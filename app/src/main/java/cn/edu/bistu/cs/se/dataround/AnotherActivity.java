package cn.edu.bistu.cs.se.dataround;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by lsy on 2016/9/7.
 */
public class AnotherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another_layout);

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        Integer age=intent.getIntExtra("age", 20);
        Toast.makeText(this,name+age,Toast.LENGTH_LONG).show();



        Button button=(Button)findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                String name=intent.getStringExtra("name");
                Integer age=intent.getIntExtra("age", 20);
                intent.putExtra("result","姓名："+name+" 年龄："+age);
                setResult(0,intent);
                finish();

            }
        });

    }


}
