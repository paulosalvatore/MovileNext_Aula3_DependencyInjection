package br.com.paulosalvatore.movilenext_aula3_dependencyinjection

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.paulosalvatore.movilenext_aula3_dependencyinjection.injection.DaggerTwitterComponent
import br.com.paulosalvatore.movilenext_aula3_dependencyinjection.injection.NetworkModule
import br.com.paulosalvatore.movilenext_aula3_dependencyinjection.injection.TwitterModule

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val component = DaggerTwitterComponent.builder()
				/*.networkModule(NetworkModule())*/
				.twitterModule(TwitterModule("Paulo Salvatore"))
				.build()

		val tweeter = component.tweeter()
		tweeter.tweet("Hello, #Dagger2")

		val timeline = component.timeline()
	}
}
