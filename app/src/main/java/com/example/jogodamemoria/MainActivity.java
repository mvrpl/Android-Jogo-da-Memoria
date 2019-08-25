package com.example.jogodamemoria;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView pontos_box;

    ImageView img_1, img_2, img_3, img_4, img_5, img_6, img_7, img_8, img_9, img_10, img_11, img_12, img_13, img_14, img_15, img_16, img_17, img_18, img_19, img_20;

    Integer[] pecas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    int peca1, peca2, peca3, peca4, peca5, peca6, peca7, peca8, peca9, peca10, peca11, peca12, peca13, peca14, peca15, peca16, peca17, peca18, peca19, peca20;

    int pri_peca, seg_peca;
    int cliquePeca1, cliquePeca2;

    int num_peca = 1;

    int pontos = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pontos_box = (TextView) findViewById(R.id.pontos);

        img_1 = (ImageView) findViewById(R.id.img_1);
        img_2 = (ImageView) findViewById(R.id.img_2);
        img_3 = (ImageView) findViewById(R.id.img_3);
        img_4 = (ImageView) findViewById(R.id.img_4);
        img_5 = (ImageView) findViewById(R.id.img_5);
        img_6 = (ImageView) findViewById(R.id.img_6);
        img_7 = (ImageView) findViewById(R.id.img_7);
        img_8 = (ImageView) findViewById(R.id.img_8);
        img_9 = (ImageView) findViewById(R.id.img_9);
        img_10 = (ImageView) findViewById(R.id.img_10);
        img_11 = (ImageView) findViewById(R.id.img_11);
        img_12 = (ImageView) findViewById(R.id.img_12);
        img_13 = (ImageView) findViewById(R.id.img_13);
        img_14 = (ImageView) findViewById(R.id.img_14);
        img_15 = (ImageView) findViewById(R.id.img_15);
        img_16 = (ImageView) findViewById(R.id.img_16);
        img_17 = (ImageView) findViewById(R.id.img_17);
        img_18 = (ImageView) findViewById(R.id.img_18);
        img_19 = (ImageView) findViewById(R.id.img_19);
        img_20 = (ImageView) findViewById(R.id.img_20);

        img_1.setTag(0);
        img_2.setTag(1);
        img_3.setTag(2);
        img_4.setTag(3);
        img_5.setTag(4);
        img_6.setTag(5);
        img_7.setTag(6);
        img_8.setTag(7);
        img_9.setTag(8);
        img_10.setTag(9);
        img_11.setTag(10);
        img_12.setTag(11);
        img_13.setTag(12);
        img_14.setTag(13);
        img_15.setTag(14);
        img_16.setTag(15);
        img_17.setTag(16);
        img_18.setTag(17);
        img_19.setTag(18);
        img_20.setTag(19);

        pecasFrontaisRes();

        Collections.shuffle(Arrays.asList(pecas));

        pontos_box.setText(String.format("PONTOS = %d", pontos));

        img_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_1, (int) view.getTag());
            }
        });

        img_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_2, (int) view.getTag());
            }
        });

        img_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_3, (int) view.getTag());
            }
        });

        img_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_4, (int) view.getTag());
            }
        });

        img_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_5, (int) view.getTag());
            }
        });

        img_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_6, (int) view.getTag());
            }
        });

        img_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_7, (int) view.getTag());
            }
        });

        img_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_8, (int) view.getTag());
            }
        });

        img_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_9, (int) view.getTag());
            }
        });

        img_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_10, (int) view.getTag());
            }
        });

        img_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_11, (int) view.getTag());
            }
        });

        img_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_12, (int) view.getTag());
            }
        });

        img_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_13, (int) view.getTag());
            }
        });

        img_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_14, (int) view.getTag());
            }
        });

        img_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_15, (int) view.getTag());
            }
        });

        img_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_16, (int) view.getTag());
            }
        });

        img_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_17, (int) view.getTag());
            }
        });

        img_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_18, (int) view.getTag());
            }
        });

        img_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_19, (int) view.getTag());
            }
        });

        img_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarJogada(img_20, (int) view.getTag());
            }
        });
    }

    private void executarJogada(ImageView img, int peca) {
        if (pecas[peca] == 1) {
            img.setImageResource(peca1);
        } else if (pecas[peca] == 2) {
            img.setImageResource(peca2);
        } else if (pecas[peca] == 3) {
            img.setImageResource(peca3);
        } else if (pecas[peca] == 4) {
            img.setImageResource(peca4);
        } else if (pecas[peca] == 5) {
            img.setImageResource(peca5);
        } else if (pecas[peca] == 6) {
            img.setImageResource(peca6);
        } else if (pecas[peca] == 7) {
            img.setImageResource(peca7);
        } else if (pecas[peca] == 8) {
            img.setImageResource(peca8);
        } else if (pecas[peca] == 9) {
            img.setImageResource(peca9);
        } else if (pecas[peca] == 10) {
            img.setImageResource(peca10);
        } else if (pecas[peca] == 11) {
            img.setImageResource(peca11);
        } else if (pecas[peca] == 12) {
            img.setImageResource(peca12);
        } else if (pecas[peca] == 13) {
            img.setImageResource(peca13);
        } else if (pecas[peca] == 14) {
            img.setImageResource(peca14);
        } else if (pecas[peca] == 15) {
            img.setImageResource(peca15);
        } else if (pecas[peca] == 16) {
            img.setImageResource(peca16);
        } else if (pecas[peca] == 17) {
            img.setImageResource(peca17);
        } else if (pecas[peca] == 18) {
            img.setImageResource(peca18);
        } else if (pecas[peca] == 19) {
            img.setImageResource(peca19);
        } else if (pecas[peca] == 20) {
            img.setImageResource(peca20);
        }

        if (num_peca == 1) {
            pri_peca = pecas[peca];
            Log.d("MEMORIA", String.format("PRIM PECA=%d", pri_peca));
            if (pri_peca > 10) {
                pri_peca = pri_peca - 10;
            }
            num_peca = 2;
            cliquePeca1 = peca;

            img.setEnabled(false);
        } else if (num_peca == 2) {
            seg_peca = pecas[peca];
            Log.d("MEMORIA", String.format("SEG PECA=%d", seg_peca));
            if (seg_peca > 10) {
                seg_peca = seg_peca - 10;
            }
            num_peca = 1;
            cliquePeca2 = peca;

            img_1.setEnabled(false);
            img_2.setEnabled(false);
            img_3.setEnabled(false);
            img_4.setEnabled(false);
            img_5.setEnabled(false);
            img_6.setEnabled(false);
            img_7.setEnabled(false);
            img_8.setEnabled(false);
            img_9.setEnabled(false);
            img_10.setEnabled(false);
            img_11.setEnabled(false);
            img_12.setEnabled(false);
            img_13.setEnabled(false);
            img_14.setEnabled(false);
            img_15.setEnabled(false);
            img_16.setEnabled(false);
            img_17.setEnabled(false);
            img_18.setEnabled(false);
            img_19.setEnabled(false);
            img_20.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    checarJogada();
                }
            }, 1000);
        }
    }

    private void mostraAlerta(String msg) {
        AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);

        alerta.setMessage(msg);

        alerta.setCancelable(false);

        alerta.setPositiveButton("NOVO", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        alerta.setNegativeButton("SAIR", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });

        alerta.show();
    }

    private void checarJogada() {

        if (pontos == 1) {
            mostraAlerta("GAME OVER!");
        }

        if (pri_peca == seg_peca){
            pontos++;

            cliquePeca1 = cliquePeca1 + 1;
            cliquePeca2 = cliquePeca2 + 1;

            Log.d("MEMORIA", String.format("CLIQUE PECA1=%d", cliquePeca1));
            Log.d("MEMORIA", String.format("CLIQUE PECA2=%d", cliquePeca2));

            if (cliquePeca1 == 0) {
                img_1.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 1) {
                img_1.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 2) {
                img_2.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 3) {
                img_3.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 4) {
                img_4.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 5) {
                img_5.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 6) {
                img_6.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 7) {
                img_7.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 8) {
                img_8.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 9) {
                img_9.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 10) {
                img_10.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 11) {
                img_11.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 12) {
                img_12.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 13) {
                img_13.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 14) {
                img_14.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 15) {
                img_15.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 16) {
                img_16.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 17) {
                img_17.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 18) {
                img_18.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 19) {
                img_19.setVisibility(View.INVISIBLE);
            } else if (cliquePeca1 == 20) {
                img_20.setVisibility(View.INVISIBLE);
            }

            if (cliquePeca2 == 0) {
                img_1.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 1) {
                img_1.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 2) {
                img_2.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 3) {
                img_3.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 4) {
                img_4.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 5) {
                img_5.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 6) {
                img_6.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 7) {
                img_7.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 8) {
                img_8.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 9) {
                img_9.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 10) {
                img_10.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 11) {
                img_11.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 12) {
                img_12.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 13) {
                img_13.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 14) {
                img_14.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 15) {
                img_15.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 16) {
                img_16.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 17) {
                img_17.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 18) {
                img_18.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 19) {
                img_19.setVisibility(View.INVISIBLE);
            } else if (cliquePeca2 == 20) {
                img_20.setVisibility(View.INVISIBLE);
            }
        } else {
            pontos--;
            img_1.setImageResource(R.drawable.na);
            img_2.setImageResource(R.drawable.na);
            img_3.setImageResource(R.drawable.na);
            img_4.setImageResource(R.drawable.na);
            img_5.setImageResource(R.drawable.na);
            img_6.setImageResource(R.drawable.na);
            img_7.setImageResource(R.drawable.na);
            img_8.setImageResource(R.drawable.na);
            img_9.setImageResource(R.drawable.na);
            img_10.setImageResource(R.drawable.na);
            img_11.setImageResource(R.drawable.na);
            img_12.setImageResource(R.drawable.na);
            img_13.setImageResource(R.drawable.na);
            img_14.setImageResource(R.drawable.na);
            img_15.setImageResource(R.drawable.na);
            img_16.setImageResource(R.drawable.na);
            img_17.setImageResource(R.drawable.na);
            img_18.setImageResource(R.drawable.na);
            img_19.setImageResource(R.drawable.na);
            img_20.setImageResource(R.drawable.na);
        }

        img_1.setEnabled(true);
        img_2.setEnabled(true);
        img_3.setEnabled(true);
        img_4.setEnabled(true);
        img_5.setEnabled(true);
        img_6.setEnabled(true);
        img_7.setEnabled(true);
        img_8.setEnabled(true);
        img_9.setEnabled(true);
        img_10.setEnabled(true);
        img_11.setEnabled(true);
        img_12.setEnabled(true);
        img_13.setEnabled(true);
        img_14.setEnabled(true);
        img_15.setEnabled(true);
        img_16.setEnabled(true);
        img_17.setEnabled(true);
        img_18.setEnabled(true);
        img_19.setEnabled(true);
        img_20.setEnabled(true);

        if (img_1.getVisibility() == View.INVISIBLE &&
                img_2.getVisibility() == View.INVISIBLE &&
                img_3.getVisibility() == View.INVISIBLE &&
                img_4.getVisibility() == View.INVISIBLE &&
                img_5.getVisibility() == View.INVISIBLE &&
                img_6.getVisibility() == View.INVISIBLE &&
                img_7.getVisibility() == View.INVISIBLE &&
                img_8.getVisibility() == View.INVISIBLE &&
                img_9.getVisibility() == View.INVISIBLE &&
                img_10.getVisibility() == View.INVISIBLE &&
                img_11.getVisibility() == View.INVISIBLE &&
                img_12.getVisibility() == View.INVISIBLE &&
                img_13.getVisibility() == View.INVISIBLE &&
                img_14.getVisibility() == View.INVISIBLE &&
                img_15.getVisibility() == View.INVISIBLE &&
                img_16.getVisibility() == View.INVISIBLE &&
                img_17.getVisibility() == View.INVISIBLE &&
                img_18.getVisibility() == View.INVISIBLE &&
                img_19.getVisibility() == View.INVISIBLE &&
                img_20.getVisibility() == View.INVISIBLE) {
            mostraAlerta(String.format("GAME OVER!\nPONTOS = %d", pontos));
        }

        pontos_box.setText(String.format("PONTOS = %d", pontos));
    }

    private void pecasFrontaisRes() {
        peca1 = R.drawable.c_1;
        peca2 = R.drawable.dotnet_1;
        peca3 = R.drawable.go_1;
        peca4 = R.drawable.java_1;
        peca5 = R.drawable.kotlin_1;
        peca6 = R.drawable.perl_1;
        peca7 = R.drawable.python_1;
        peca8 = R.drawable.rust_1;
        peca9 = R.drawable.scala_1;
        peca10 = R.drawable.swift_1;
        peca11 = R.drawable.c_1;
        peca12 = R.drawable.dotnet_1;
        peca13 = R.drawable.go_1;
        peca14 = R.drawable.java_1;
        peca15 = R.drawable.kotlin_1;
        peca16 = R.drawable.perl_1;
        peca17 = R.drawable.python_1;
        peca18 = R.drawable.rust_1;
        peca19 = R.drawable.scala_1;
        peca20 = R.drawable.swift_1;
    }
}