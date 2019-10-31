package com.example.mirodone.memorygame;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView tv_points, tv_miss;

    ImageView iv_11, iv_12, iv_13, iv_14, iv_21, iv_22, iv_23, iv_24, iv_31, iv_32, iv_33, iv_34;


    // array for images
    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    // images

    int image101, image102, image103, image104, image105, image106,
            image201, image202, image203, image204, image205, image206;

    int firstPic, secondPic;
    int picNumber = 1;

    int clickedFirst, clickedSecond;

    // int turn =1;
    int player_points = 0;
    int player_miss = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv_miss = findViewById(R.id.tv_miss);

        iv_11 = findViewById(R.id.iv_11);
        iv_12 = findViewById(R.id.iv_12);
        iv_13 = findViewById(R.id.iv_13);
        iv_14 = findViewById(R.id.iv_14);

        iv_21 = findViewById(R.id.iv_21);
        iv_22 = findViewById(R.id.iv_22);
        iv_23 = findViewById(R.id.iv_23);
        iv_24 = findViewById(R.id.iv_24);

        iv_31 = findViewById(R.id.iv_31);
        iv_32 = findViewById(R.id.iv_32);
        iv_33 = findViewById(R.id.iv_33);
        iv_34 = findViewById(R.id.iv_34);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");

        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");

        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");


        // load images
        frontOfImagesResources();

        Collections.shuffle(Arrays.asList(cardsArray));

        //inactive player // later implementation
        //tv_p2.setTextColor(Color.gray)

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thePic = Integer.parseInt((String) v.getTag());
                doStuff(iv_11, thePic);
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thePic = Integer.parseInt((String) v.getTag());
                doStuff(iv_12, thePic);
            }
        });

        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thePic = Integer.parseInt((String) v.getTag());
                doStuff(iv_13, thePic);
            }
        });

        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thePic = Integer.parseInt((String) v.getTag());
                doStuff(iv_14, thePic);
            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thePic = Integer.parseInt((String) v.getTag());
                doStuff(iv_21, thePic);
            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thePic = Integer.parseInt((String) v.getTag());
                doStuff(iv_22, thePic);
            }
        });
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thePic = Integer.parseInt((String) v.getTag());
                doStuff(iv_23, thePic);
            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thePic = Integer.parseInt((String) v.getTag());
                doStuff(iv_24, thePic);
            }
        });

        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thePic = Integer.parseInt((String) v.getTag());
                doStuff(iv_31, thePic);
            }
        });
        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thePic = Integer.parseInt((String) v.getTag());
                doStuff(iv_32, thePic);
            }
        });
        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thePic = Integer.parseInt((String) v.getTag());
                doStuff(iv_33, thePic);
            }
        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thePic = Integer.parseInt((String) v.getTag());
                doStuff(iv_34, thePic);
            }
        });

    }


    private void doStuff(ImageView iv, int pic) {
        if (cardsArray[pic] == 101) {
            iv.setImageResource(image101);
        } else if (cardsArray[pic] == 102) {
            iv.setImageResource(image102);
        } else if (cardsArray[pic] == 103) {
            iv.setImageResource(image103);
        } else if (cardsArray[pic] == 104) {
            iv.setImageResource(image104);
        } else if (cardsArray[pic] == 105) {
            iv.setImageResource(image105);
        } else if (cardsArray[pic] == 106) {
            iv.setImageResource(image106);
        } else if (cardsArray[pic] == 201) {
            iv.setImageResource(image201);
        } else if (cardsArray[pic] == 202) {
            iv.setImageResource(image202);
        } else if (cardsArray[pic] == 203) {
            iv.setImageResource(image203);
        } else if (cardsArray[pic] == 204) {
            iv.setImageResource(image204);
        } else if (cardsArray[pic] == 205) {
            iv.setImageResource(image205);
        } else if (cardsArray[pic] == 206) {
            iv.setImageResource(image206);
        }

// check witch pic was selected and saved to temporary variable
        if (picNumber == 1) {
            firstPic = cardsArray[pic];
            if (firstPic > 200) {
                firstPic = firstPic - 100;
            }
            picNumber = 2;
            clickedFirst = pic;

            iv.setEnabled(false);
        } else if (picNumber == 2) {
            secondPic = cardsArray[pic];
            if (secondPic > 200) {
                secondPic = secondPic - 100;
            }
            picNumber = 1;
            clickedSecond = pic;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);

            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);

            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);



            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
// check if the selected images are equal
                    calculate();
                }
            }, 500);

        }

    }

    private void calculate() {
        if (firstPic == secondPic) {
            if (clickedFirst == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 4) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 5) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 7) {
                iv_24.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 8) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 9) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }

            if (clickedSecond == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 4) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 5) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 7) {
                iv_24.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 8) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 9) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }

        //    player_points++;
          //  tv_points.setText(getString(R.string.tv_points, player_points));

        } else {
            iv_11.setImageResource(R.drawable.ic_back);
            iv_12.setImageResource(R.drawable.ic_back);
            iv_13.setImageResource(R.drawable.ic_back);
            iv_14.setImageResource(R.drawable.ic_back);
            iv_21.setImageResource(R.drawable.ic_back);
            iv_22.setImageResource(R.drawable.ic_back);
            iv_23.setImageResource(R.drawable.ic_back);
            iv_24.setImageResource(R.drawable.ic_back);
            iv_31.setImageResource(R.drawable.ic_back);
            iv_32.setImageResource(R.drawable.ic_back);
            iv_33.setImageResource(R.drawable.ic_back);
            iv_34.setImageResource(R.drawable.ic_back);

            player_miss++;
            tv_miss.setText(getString(R.string.tv_miss) + player_miss);

        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);

        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);

        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);


        checkEndGame();

    }

    public void checkEndGame() {
        if (iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_34.getVisibility() == View.INVISIBLE) {

            AlertDialog.Builder adb = new AlertDialog.Builder(MainActivity.this);
            adb.setMessage("Game Over ! \nMissed: " + player_miss)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    }).setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });

            AlertDialog alertDialog = adb.create();
            alertDialog.show();

        }

    }

    private void frontOfImagesResources() {

        image101 = R.drawable.ic_001;
        image102 = R.drawable.ic_002;
        image103 = R.drawable.ic_003;
        image104 = R.drawable.ic_004;
        image105 = R.drawable.ic_005;
        image106 = R.drawable.ic_006;

        image201 = R.drawable.ic_101;
        image202 = R.drawable.ic_102;
        image203 = R.drawable.ic_103;
        image204 = R.drawable.ic_104;
        image205 = R.drawable.ic_105;
        image206 = R.drawable.ic_106;


    }
}
