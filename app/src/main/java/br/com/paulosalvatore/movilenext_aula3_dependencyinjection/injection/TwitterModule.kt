package br.com.paulosalvatore.movilenext_aula3_dependencyinjection.injection

import br.com.paulosalvatore.movilenext_aula3_dependencyinjection.dependencies.Timeline
import br.com.paulosalvatore.movilenext_aula3_dependencyinjection.dependencies.Tweeter
import br.com.paulosalvatore.movilenext_aula3_dependencyinjection.dependencies.TwitterApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class TwitterModule(private val user: String) {
	@Provides @Singleton
	fun provideTweeter(api: TwitterApi) = Tweeter(api, user)

	@Provides @Singleton
	fun provideTimeline(api: TwitterApi) = Timeline(api, user)
}
