package hello.jcw27.washington.edu.lifecounterfroyo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    private int countP1 = 20;
    private int countP2 = 20;
    private int countP3 = 20;
    private int countP4 = 20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null){
            TextView lives1 = (TextView) findViewById(R.id.livesP1);
            TextView lives2 = (TextView) findViewById(R.id.livesP2);
            TextView lives3 = (TextView) findViewById(R.id.livesP3);
            TextView lives4 = (TextView) findViewById(R.id.livesP4);
            TextView playerDied = (TextView) findViewById(R.id.dead);

            countP1 = savedInstanceState.getInt("Player1Lives");
            if(countP1 < 1){
                lives1.setText("Number of Lives: 0");
                playerDied.setText("PLAYER " + 1 + " LOSES!");
                countP1 = 0;
            }
            countP2 = savedInstanceState.getInt("Player2Lives");
            if(countP2 < 1){
                lives2.setText("Number of Lives: 0");
                playerDied.setText("PLAYER " + 2 + " LOSES!");
                countP2 = 0;
            }

            countP3 = savedInstanceState.getInt("Player3Lives");
            if(countP3 < 1){
                lives3.setText("Number of Lives: 0");
                playerDied.setText("PLAYER " + 3 + " LOSES!");
                countP3 = 0;
            }

            countP4 = savedInstanceState.getInt("Player4Lives");
            if(countP4 < 1){
                lives4.setText("Number of Lives: 0");
                playerDied.setText("PLAYER " + 4 + " LOSES!");
                countP4 = 0;
            }

        }
        TextView lives1 = (TextView) findViewById(R.id.livesP1);
        lives1.setText("Number of lives: " + countP1);

        TextView lives2 = (TextView) findViewById(R.id.livesP2);
        lives2.setText("Number of lives: " + countP2);

        TextView lives3 = (TextView) findViewById(R.id.livesP3);
        lives3.setText("Number of lives: " + countP3);

        TextView lives4 = (TextView) findViewById(R.id.livesP4);
        lives4.setText("Number of lives: " + countP4);

        // Player 1
        Button plusFiveP1 = (Button) findViewById(R.id.buttonPF_P1);
        Button plusOneP1 = (Button) findViewById(R.id.buttonPO_P1);
        Button minusOneP1 = (Button) findViewById(R.id.buttonMO_P1);
        Button minusFiveP1 = (Button) findViewById(R.id.buttonMF_P1);

        // Player 2
        Button plusFiveP2 = (Button) findViewById(R.id.buttonPF_P2);
        Button plusOneP2 = (Button) findViewById(R.id.buttonPO_P2);
        Button minusOneP2 = (Button) findViewById(R.id.buttonMO_P2);
        Button minusFiveP2 = (Button) findViewById(R.id.buttonMF_P2);

        // Player 3
        Button plusFiveP3 = (Button) findViewById(R.id.buttonPF_P3);
        Button plusOneP3 = (Button) findViewById(R.id.buttonPO_P3);
        Button minusOneP3 = (Button) findViewById(R.id.buttonMO_P3);
        Button minusFiveP3 = (Button) findViewById(R.id.buttonMF_P3);

        // Player 4
        Button plusFiveP4 = (Button) findViewById(R.id.buttonPF_P4);
        Button plusOneP4 = (Button) findViewById(R.id.buttonPO_P4);
        Button minusOneP4 = (Button) findViewById(R.id.buttonMO_P4);
        Button minusFiveP4 = (Button) findViewById(R.id.buttonMF_P4);

        // Player 1 Methods
        plusFiveP1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView lives = (TextView) findViewById(R.id.livesP1);
                countP1 = countP1 + 5;
                lives.setText("Number of Lives: " + countP1);
            }
        });

        plusOneP1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView lives = (TextView) findViewById(R.id.livesP1);
                countP1 = countP1 + 1;
                lives.setText("Number of Lives: " + countP1);
            }
        });

        minusOneP1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView lives = (TextView) findViewById(R.id.livesP1);
                TextView playerDied = (TextView) findViewById(R.id.dead);
                countP1 = countP1 - 1;
                if(countP1 < 1){
                    lives.setText("Number of Lives: 0");
                    playerDied.setText("PLAYER " + 4 + " LOSES!");
                } else {
                    lives.setText("Number of Lives: " + countP1);
                }

            }
        });

        minusFiveP1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView lives = (TextView) findViewById(R.id.livesP1);
                TextView playerDied = (TextView) findViewById(R.id.dead);
                countP1 = countP1 - 5;
                if(countP1 < 0 || countP1 == 0){
                    lives.setText("Number of Lives: 0");
                    playerDied.setText("PLAYER " + 1 + " LOSES!");
                } else {
                    lives.setText("Number of Lives: " + countP1);
                }
            }
        });

        // Player 2 Methods
        plusFiveP2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView lives = (TextView) findViewById(R.id.livesP2);
                countP2 = countP2 + 5;
                lives.setText("Number of Lives: " + countP2);
            }
        });

        plusOneP2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView lives = (TextView) findViewById(R.id.livesP2);
                countP2 = countP2 + 1;
                lives.setText("Number of Lives: " + countP2);
            }
        });

        minusOneP2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView lives = (TextView) findViewById(R.id.livesP2);
                TextView playerDied = (TextView) findViewById(R.id.dead);
                countP2 = countP2 - 1;
                if(countP2 < 1){
                    lives.setText("Number of Lives: 0");
                    playerDied.setText("PLAYER " + 2 + " LOSES!");
                } else {
                    lives.setText("Number of Lives: " + countP2);
                }

            }
        });

        minusFiveP2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView lives = (TextView) findViewById(R.id.livesP2);
                TextView playerDied = (TextView) findViewById(R.id.dead);
                countP2 = countP2 - 5;
                if(countP2 < 1){
                    lives.setText("Number of Lives: 0");
                    playerDied.setText("PLAYER " + 2 + " LOSES!");
                } else {
                    lives.setText("Number of Lives: " + countP2);
                }
            }
        });

        // Player 3 Methods
        plusFiveP3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView lives = (TextView) findViewById(R.id.livesP3);
                countP3 = countP3 + 5;
                lives.setText("Number of Lives: " + countP3);
            }
        });

        plusOneP3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView lives = (TextView) findViewById(R.id.livesP3);
                countP3 = countP3 + 1;
                lives.setText("Number of Lives: " + countP3);
            }
        });

        minusOneP3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView lives = (TextView) findViewById(R.id.livesP3);
                TextView playerDied = (TextView) findViewById(R.id.dead);
                countP3 = countP3 - 1;
                if(countP3 < 1){
                    lives.setText("Number of Lives: 0");
                    playerDied.setText("PLAYER " + 3 + " LOSES!");
                } else {
                    lives.setText("Number of Lives: " + countP3);
                }

            }
        });

        minusFiveP3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView lives = (TextView) findViewById(R.id.livesP3);
                TextView playerDied = (TextView) findViewById(R.id.dead);
                countP3 = countP3 - 5;
                if(countP3 < 1){
                    lives.setText("Number of Lives: 0");
                    playerDied.setText("PLAYER " + 3 + " LOSES!");
                } else {
                    lives.setText("Number of Lives: " + countP3);
                }
            }
        });

        // Player 4 Methods
        plusFiveP4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView lives = (TextView) findViewById(R.id.livesP4);
                countP4 = countP4 + 5;
                lives.setText("Number of Lives: " + countP4);
            }
        });

        plusOneP4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView lives = (TextView) findViewById(R.id.livesP4);
                countP4 = countP4 + 1;
                lives.setText("Number of Lives: " + countP4);
            }
        });

        minusOneP4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView lives = (TextView) findViewById(R.id.livesP4);
                TextView playerDied = (TextView) findViewById(R.id.dead);
                countP4 = countP4 - 1;
                if(countP4 < 1){
                    lives.setText("Number of Lives: 0");
                    playerDied.setText("PLAYER " + 4 + " LOSES!");
                } else {
                    lives.setText("Number of Lives: " + countP4);
                }

            }
        });

        minusFiveP4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView lives = (TextView) findViewById(R.id.livesP4);
                TextView playerDied = (TextView) findViewById(R.id.dead);
                countP4 = countP4 - 5;
                if(countP4 < 1){
                    lives.setText("Number of Lives: 0");
                    playerDied.setText("PLAYER " + 4 + " LOSES!");
                } else {
                    lives.setText("Number of Lives: " + countP4);
                }
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putInt("Player1Lives", countP1);
        savedInstanceState.putInt("Player2Lives", countP2);
        savedInstanceState.putInt("Player3Lives", countP3);
        savedInstanceState.putInt("Player4Lives", countP4);

    }

    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        countP1 = savedInstanceState.getInt("Player1Lives");
        countP2 = savedInstanceState.getInt("Player2Lives");
        countP3 = savedInstanceState.getInt("Player3Lives");
        countP4 = savedInstanceState.getInt("Player4Lives");
    }
}
