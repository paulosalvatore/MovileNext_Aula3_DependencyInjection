package br.com.paulosalvatore.movilenext_aula3_dependencyinjection.dependencies

class Timeline(private val api: TwitterApi,
               private val user: String) {
	private val cache: List<Tweet> = emptyList()

	fun get() = cache
	fun loadMore(amount: Int) {
	}
}
