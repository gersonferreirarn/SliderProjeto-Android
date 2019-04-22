package br.com.caicosoft.sliderprojeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

// extends IntroActivity PARA UTILIZAR SLIDER
public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        // UTILIZANDO FRAGMENT (tambem pode ser utilizado SIMPLE SLIDE)
        setButtonBackVisible(false); // oculta botao de voltar
        setButtonNextVisible(false); // oculta botao de proximo

        addSlide(new FragmentSlide.Builder()
           .background(android.R.color.holo_blue_light)
                .fragment(R.layout.intro_1)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.holo_blue_light)
                .fragment(R.layout.intro_2)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.holo_blue_light)
                .fragment(R.layout.intro_3)
                .build()
        );

        /* // ULTIMIZANDO SIMPLE SLIDE (tambem pode ser utilizado FRAGMENT)

        setButtonBackVisible(false); // oculta botao de voltar
        setButtonNextVisible(false); // oculta botao de proximo

        addSlide(new SimpleSlide.Builder()
                .title("Titulo")
                .description("Descrição")
                .image(R.drawable.um)
                .background(android.R.color.holo_orange_light)
                .build()
        );

        addSlide(new SimpleSlide.Builder()
                .title("Titulo 2")
                .description("Descrição 2")
                .image(R.drawable.dois)
                .background(android.R.color.holo_orange_light)
                .build()
        );

        addSlide(new SimpleSlide.Builder()
                .title("Titulo 3")
                .description("Descrição 3")
                .image(R.drawable.tres)
                .background(android.R.color.holo_orange_light)
                .build()
        );

        addSlide(new SimpleSlide.Builder()
                .title("Titulo 4")
                .description("Descrição 4")
                .image(R.drawable.quatro)
                .background(android.R.color.holo_orange_light)
                .build()
        );

        */
    }
}
