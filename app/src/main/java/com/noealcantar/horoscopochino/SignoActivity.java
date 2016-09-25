package com.noealcantar.horoscopochino;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        TextView tvTituloSigno = (TextView) this.findViewById(R.id.tvTituloSigno);
        TextView tvSignoInfo= (TextView) this.findViewById(R.id.tvSignoInfo);
        ImageView imgSigno= (ImageView) this.findViewById(R.id.imgSigno);

        Resources res = this.getResources();
        Drawable d = res.getDrawable(R.drawable.buey);

        tvTituloSigno.setText(signo);

        switch (signo){
            case "BUEY":
                descripcion.append("Los que han nacido en 1901, 1913, 1925, 1937, 1949, 1961, 1973, 1985, 1997.\n");
                descripcion.append("Este año el buey tendrá una evolución laboral,");
                descripcion.append(" tienes que esforzarte al máximo para ver resultados.");
                d = res.getDrawable(R.drawable.buey);

                break;

            case "CABALLO":
                descripcion.append("Los que han nacido en 1906, 1918, 1930, 1942, 1954, 1966, 1978, 1990, 2002.\n");
                descripcion.append("Este es un año de aprendizaje, avanza hacia tus objetivos.\n");
                descripcion.append("Reflexiona tus errores y encuentra la mejor manera de corregirlos.");
                d = res.getDrawable(R.drawable.caballo);

                break;

            case "CABRA":
                descripcion.append("Los que han nacido en 1907, 1919, 1931, 1943, 1955, 1967, 1979, 1991, 2003.\n");
                descripcion.append("Tienes que ser más directo, no le des tantas vueltas a las cosas.\n ");
                descripcion.append("Este año tendrás muy buenas oportunidades, no las desaproveches.");
                d = res.getDrawable(R.drawable.cabra);

                break;

            case "DRAGON":
                descripcion.append("Los que han nacido en 1904, 1916, 1928, 1940, 1952, 1964, 1976, 1988, 2000.\n");
                descripcion.append("Tendrás mucha suerte este año, acabarás con éxito muchos proyectos que tenías abiertos.\n");
                descripcion.append("El 2013 es un año que vas a ver realizados los sueños que creías imposibles.");
                d = res.getDrawable(R.drawable.dragon);

                break;

            case "GALLO":
                descripcion.append("Los que han nacido en 1909, 1921, 1933, 1945, 1957, 1969, 1981, 1993.\n");
                descripcion.append("Muy buen año para los gallos, piensa lo que quieres conseguir en la vida y lo lograrás.\n");
                descripcion.append("Confía en tus capacidades.");
                d = res.getDrawable(R.drawable.gallo);

                break;

            case "GATO":
                descripcion.append("Los que han nacido en 1903, 1915, 1927, 1939, 1951, 1963, 1975, 1987, 1999.\n");
                descripcion.append("Es muy buen año para el gato, aprovecha todas las oportunidades que se te van a presentar y disfruta del año.\n");
                descripcion.append("Evita ser tan impulsivo y piensa antes de hablar, de esta manera evitarás arrepentirte de tus palabras.");
                d = res.getDrawable(R.drawable.gato);

                break;

            case "JABALI":
                descripcion.append("Los que han nacido en 1911, 1923, 1935, 1947, 1959, 1971, 1983, 1995.\n");
                descripcion.append("Es un año de aprendizaje, no te gustarán algunas cosas que haces y querrás cambiarlas, no seas tan duro contigo mismo porque todo el mundo comete errores, lo importante es saber corregirlos y aprender de ellos.");
                d = res.getDrawable(R.drawable.jabali);

                break;

            case "MONO":
                descripcion.append("Los que han nacido en 1908, 1920, 1932, 1944, 1956, 1968, 1980, 1992, 2004.\n");
                descripcion.append("Tendrás un buen año gracias a tu carisma y tu talento. Este año triunfarás en todos los aspectos.\n");
                descripcion.append("Eres una persona muy fiel y trabajadora, este año buscarás mayor estabilidad para tu familia, pero no te descentres de tu trabajo.");
                d = res.getDrawable(R.drawable.mono);

                break;

            case "PERRO":
                descripcion.append("Los que han nacido en 1910, 1922, 1934, 1946, 1958, 1970, 1982, 1994.\n");
                descripcion.append("Es un año importante para que reflexiones, no te lamentes por errores pasados, aprende de ellos y corrígelos.\n");
                descripcion.append("Es un año importante para que reflexiones, no te lamentes por errores pasados, aprende de ellos y corrígelos.\n");
                d = res.getDrawable(R.drawable.perro);

                break;

            case "RATA":
                descripcion.append("Los que han nacido en 1900, 1912, 1924, 1936, 1948, 1960, 1972, 1984, 1996.\n");
                descripcion.append("Este será el año de los negocios, muy buen año laboral y económico.\n");
                descripcion.append("Puedes encontrar tu equilibrio económico, pero a cambio, será necesario un duro trabajo, aunque merecerá la pena.\n");
                descripcion.append("La rata debe pensar en el presente y dejar atrás el pasado, no pensar en antiguas ilusiones para no perder las oportunidades que la vida te depara en el presente.");
                d = res.getDrawable(R.drawable.rata);

                break;

            case "SERPIENTE":
                descripcion.append("Los que han nacido en 1905, 1917, 1929, 1941, 1953, 1965, 1977, 1989, 2001.\n");
                descripcion.append("Este 2013 la serpiente debe pensar antes de hablar y evitar ser tan impulsivo.\n");
                descripcion.append("Ten mas calma e intenta relajarte, puedes cometer errores por no pensar con calma antes de expresar tu opinión, especialmente en el amor, cuenta con tu pareja a la hora de decidir.");
                d = res.getDrawable(R.drawable.serpiente);

                break;

            case "TIGRE":
                descripcion.append("Los que han nacido en 1902, 1914, 1926, 1938, 1950, 1962, 1974, 1986, 1998.\n");
                descripcion.append("Este año va a ser un año de cambios, puede ser que te mudes de casa, que te cambies de trabajo o que tengas un bebe.\n");
                descripcion.append("Estos cambios te producirán mucha tensión, pero se verá compensada por la alegría que te proporcionarán.");
                d = res.getDrawable(R.drawable.tigre);

                break;

            default:
                descripcion.append("Los que han nacido en 1901, 1913, 1925, 1937, 1949, 1961, 1973, 1985, 1997.\n");
                descripcion.append("Este año el buey tendrá una evolución laboral,");
                descripcion.append(" tienes que esforzarte al máximo para ver resultados.");
                d = res.getDrawable(R.drawable.buey);

                break;
        }

        tvSignoInfo.setText(descripcion.toString());
        imgSigno.setImageDrawable(d);

    }
}
