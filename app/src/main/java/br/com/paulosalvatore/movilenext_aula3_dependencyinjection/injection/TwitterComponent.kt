package br.com.paulosalvatore.movilenext_aula3_dependencyinjection.injection

import br.com.paulosalvatore.movilenext_aula3_dependencyinjection.dependencies.Timeline
import br.com.paulosalvatore.movilenext_aula3_dependencyinjection.dependencies.Tweeter
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class,
					  TwitterModule::class])
interface TwitterComponent {
	fun tweeter(): Tweeter
	fun timeline(): Timeline
}
