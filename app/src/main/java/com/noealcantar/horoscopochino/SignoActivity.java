package com.noealcantar.horoscopochino;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

public class SignoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signo);

        String signo= getIntent().getStringExtra("SIGNO");
        cargaSigno(signo);
    }

    private void cargaSigno(String signo)
    {

        StringBuilder descripcion= new StringBuilder();

        String description = "";
        AssetHelper helper;

        TextView tvTituloSigno = (TextView) this.findViewById(R.id.tvTituloSigno);
        TextView tvSignoInfo= (TextView) this.findViewById(R.id.tvSignoInfo);
        ImageView imgSigno= (ImageView) this.findViewById(R.id.imgSigno);

        Resources res = this.getResources();
        Drawable d = res.getDrawable(R.drawable.buey);

        tvTituloSigno.setText(signo);

        switch (signo){
            case "BUEY":
                helper = new AssetHelper(this, "BUEY.txt");
                description = helper.loadData();
                d = res.getDrawable(R.drawable.buey);

                break;

            case "CABALLO":
                helper = new AssetHelper(this, "CABALLO.txt");
                description = helper.loadData();
                d = res.getDrawable(R.drawable.caballo);

                break;

            case "CABRA":
                helper = new AssetHelper(this, "CABRA.txt");
                description = helper.loadData();
                d = res.getDrawable(R.drawable.cabra);

                break;

            case "DRAGON":
                helper = new AssetHelper(this, "DRAGON.txt");
                description = helper.loadData();
                d = res.getDrawable(R.drawable.dragon);

                break;

            case "GALLO":
                helper = new AssetHelper(this, "GALLO.txt");
                description = helper.loadData();
                d = res.getDrawable(R.drawable.gallo);

                break;

            case "GATO":
                helper = new AssetHelper(this, "GATO.txt");
                description = helper.loadData();
                d = res.getDrawable(R.drawable.gato);

                break;

            case "JABALI":
                helper = new AssetHelper(this, "JABALI.txt");
                description = helper.loadData();
                d = res.getDrawable(R.drawable.jabali);

                break;

            case "MONO":
                helper = new AssetHelper(this, "MONO.txt");
                description = helper.loadData();
                d = res.getDrawable(R.drawable.mono);

                break;

            case "PERRO":
                helper = new AssetHelper(this, "PERRO.txt");
                description = helper.loadData();
                d = res.getDrawable(R.drawable.perro);

                break;

            case "RATA":
                helper = new AssetHelper(this, "RATA.txt");
                description = helper.loadData();
                d = res.getDrawable(R.drawable.rata);

                break;

            case "SERPIENTE":
                helper = new AssetHelper(this, "SERPIENTE.txt");
                description = helper.loadData();
                d = res.getDrawable(R.drawable.serpiente);

                break;

            case "TIGRE":
                helper = new AssetHelper(this, "SERPIENTE.txt");
                description = helper.loadData();
                d = res.getDrawable(R.drawable.tigre);

                break;

            default:
                descripcion.append("Los que han nacido en 1901, 1913, 1925, 1937, 1949, 1961, 1973, 1985, 1997.\n");
                descripcion.append("Este año el buey tendrá una evolución laboral,");
                descripcion.append(" tienes que esforzarte al máximo para ver resultados.");
                d = res.getDrawable(R.drawable.buey);

                break;
        }

        tvSignoInfo.setText(Html.fromHtml(description));
        imgSigno.setImageDrawable(d);

    }
}
