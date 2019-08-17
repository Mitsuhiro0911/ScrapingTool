import org.jsoup.Jsoup

fun main () {
    val document = Jsoup.connect("https://ja.wikipedia.org/wiki/メインページ").get()
    println(document.html())
}