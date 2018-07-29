package br.com.paulosalvatore.movilenext_aula3_dependencyinjection.injection

import br.com.paulosalvatore.movilenext_aula3_dependencyinjection.dependencies.TwitterApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
class NetworkModule {
	@Provides @Singleton
	fun provideOkHttpClient() = OkHttpClient()

	/*@Provides @Singleton
	fun provideTwitterApi(client: OkHttpClient) = TwitterApi(client)*/
}
