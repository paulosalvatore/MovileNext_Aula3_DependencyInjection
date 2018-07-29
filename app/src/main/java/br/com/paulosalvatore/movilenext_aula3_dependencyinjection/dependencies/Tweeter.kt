package br.com.paulosalvatore.movilenext_aula3_dependencyinjection.dependencies

class Tweeter(private val api: TwitterApi,
              private val user: String) {

	fun tweet(tweet: String) {
		api.postTweet(user, tweet)
	}
}
