package br.org.fundatec.calculadoralp4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_animation.*

class AnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        Picasso.get().load("https://i.ytimg.com/vi/iQtiq0biEv4/hqdefault.jpg")
                .into(imagem1)

    }

    fun anime(view: View){
        YoYo.with(Techniques.FadeIn)
                .duration(1000).repeat(1500)
                .playOn(imagem1);

        YoYo.with(Techniques.Shake)
                .duration(200).repeat(1500)
                .playOn(imagem1);

        YoYo.with(Techniques.Swing)
                .duration(200).repeat(1500)
                .playOn(imagem1);

        YoYo.with(Techniques.Bounce)
                .duration(200).repeat(1500)
                .playOn(imagem1);

        YoYo.with(Techniques.Landing)
                .duration(500).repeat(1500)
                .playOn(imagem1);

        YoYo.with(Techniques.Landing)
                .duration(500).repeat(1500)
                .playOn(texto1);
    }
}
