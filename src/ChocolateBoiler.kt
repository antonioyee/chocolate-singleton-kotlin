/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 24/08/17.
 */

class ChocolateBoiler private constructor(){

	var empty: Boolean
	var boiled: Boolean

	init {
		empty = true
		boiled = false
	}

	private object uniqueInstance {
		val uniqueInstance = ChocolateBoiler()
	}

	companion object {
		val getInstance: ChocolateBoiler by lazy {
			uniqueInstance.uniqueInstance;
		}
	}

	fun fill() {
		if ( isEmpty() ) {
			empty = false
			boiled = false
		}
	}

	fun drain() {
		if ( ! isEmpty() and isBoiled() ) {
			empty = true
		}
	}

	fun boil() {
		if ( ! isEmpty() and ! isBoiled() ) {
			boiled = true
		}
	}

	fun isEmpty() = empty
	fun isBoiled() = boiled

}