/**
 * Created by tony on 2018/9/24.
 */
operator fun String.invoke(fn: String.() -> Unit) {
    fn(this)
}

fun main(args: Array<String>) {
    "hello dsl" {

        println(this)
    }
}