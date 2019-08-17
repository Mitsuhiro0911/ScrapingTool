import org.jsoup.Jsoup
import java.awt.SystemColor.text





fun main () {
    // URLの指定
    val document = Jsoup.connect("https://ja.wikipedia.org/wiki/メインページ").get()
    println(document.html())
    // 要素の指定
    val elements = document.select("h2")
    for (element in elements) {
        println(element.text())
    }
    // 属性の指定
    val attributes = document.select("a").attr("abs:href", "")
    println(attributes)
    for (attribute in attributes) {
        println(attribute)
    }
}