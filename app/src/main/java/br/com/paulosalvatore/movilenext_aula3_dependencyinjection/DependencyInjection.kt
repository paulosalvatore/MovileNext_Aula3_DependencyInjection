package br.com.paulosalvatore.movilenext_aula3_dependencyinjection

/*class Tweeter(private val api: TwitterApi,
              private val user: String) {

	fun tweet(tweet: String) {
		api.postTweet(user, tweet)
	}
}

class TwitterApi(private val client: OkHttpClient) {
	fun postTweet(user: String, tweet: String) {
		val request = Request.Builder().build()
		client.newCall(request).execute()
	}
}

class Tweet

class Timeline(private val api: TwitterApi,
               private val user: String) {
	private val cache: List<Tweet> = emptyList()

	fun get() = cache
	fun loadMore(amount: Int) {
	}
}

fun execute() {

	val client = OkHttpClient()
	val twitterApi = TwitterApi(client)
	val user = "Paulo Salvatore"

	val tweeter = Tweeter(twitterApi, user)
	tweeter.tweet("Hello, #DependencyInjection")
	tweeter.tweet("Kotlin > Java #KotlinWorld")

	val timeline = Timeline(twitterApi, user)
	timeline.loadMore(20)
	for (tweet in timeline.get()) {
		println(tweet)
	}
}*/
