package in.blogspot.httptechinfobg.rpsgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b_rock,b_paper,b_scissor;
    ImageView iv_cpu,iv_me;

    String MyChoice,CpuChoice,result;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        iv_cpu=(ImageView)findViewById(R.id.iv_cpu);
        iv_me=(ImageView)findViewById(R.id.iv_me);

        b_rock=(Button)findViewById(R.id.b_rock);
        b_paper=(Button)findViewById(R.id.b_paper);
        b_scissor=(Button)findViewById(R.id.b_scissor);
        r= new Random();
    b_rock.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            MyChoice="rock";
            iv_me.setImageResource(R.drawable.rock);
            calculate();
        }
    });

        b_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MyChoice="paper";
                iv_me.setImageResource(R.drawable.paper);
                calculate();

            }
        });

        b_scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MyChoice="scissor";
                iv_me.setImageResource(R.drawable.scissor);
                calculate();
            }
        });
    }
        public void calculate(){
        int cpu=r.nextInt(3);
            if(cpu==0){
                CpuChoice="rock";
                iv_cpu.setImageResource(R.drawable.rock);
            }
            else if(cpu==1){
                CpuChoice="paper";
                iv_cpu.setImageResource(R.drawable.paper);
            }
            else
            if(cpu==2){
                CpuChoice="scissor";
                iv_cpu.setImageResource(R.drawable.scissor);
            }

            if (MyChoice.equals("rock")&&CpuChoice.equals("rock")){
                result="draw";
            }
            else if (MyChoice.equals("paper")&&CpuChoice.equals("paper")){
                result="draw";
            }
            else if (MyChoice.equals("scissor")&&CpuChoice.equals("scissor")){
                result="draw";
            }
            else if (MyChoice.equals("rock")&&CpuChoice.equals("paper")){
                result="you lose";
            }
            else if (MyChoice.equals("rock")&&CpuChoice.equals("scissor")){
                result="you win";
            }
            else if (MyChoice.equals("paper")&&CpuChoice.equals("rock")){
                result="you win";
            }
            else if (MyChoice.equals("paper")&&CpuChoice.equals("scissor")){
                result="you lose";
            }
            else if (MyChoice.equals("scissor")&&CpuChoice.equals("rock")){
                result="you lose";
            }
            else if (MyChoice.equals("scissor")&&CpuChoice.equals("paper")){
                result="you win";
            }
            Toast.makeText(MainActivity.this,result,Toast.LENGTH_SHORT).show();

        }
}
