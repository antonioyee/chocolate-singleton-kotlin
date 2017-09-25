/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 24/08/17.
 */
fun main(args: Array<String>) {

	val boiler: ChocolateBoiler = ChocolateBoiler.getInstance

	boiler.fill()
	boiler.boil()
	boiler.drain()

	val boiler2: ChocolateBoiler = ChocolateBoiler.getInstance

}