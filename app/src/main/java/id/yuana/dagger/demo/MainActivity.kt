package id.yuana.dagger.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

/**
 * @author Yuana
 * @since July, 16 2018
 */


class MainActivity : AppCompatActivity() {

    @Inject
    @field:Choose(LOVE)
    lateinit var infoLove: Info

    @Inject
    @field:Choose(HELLO)
    lateinit var infoHello: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMagicBoxComponent.create().poke(this)

        tvSample.text = "${infoLove.text} : ${infoHello.text}"
    }
}
