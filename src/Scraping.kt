import org.jsoup.Jsoup
import java.awt.SystemColor.text





fun main () {
    // URLの指定
    val document = Jsoup.connect("https://ja.wikipedia.org/wiki/メインページ").get()
    println(document.html())
    // 要素の指定
    val elements = document.select("h2")
    for (element in elements) {
        System.out.println(element.text())
    }
}