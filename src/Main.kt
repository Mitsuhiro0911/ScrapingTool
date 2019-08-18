import org.jsoup.Jsoup

fun main () {
    val scraping = Scraping(Jsoup.connect("https://ja.wikipedia.org/wiki/メインページ").get())
    scraping.getInfoByElement()
    scraping.getInfoByAttr()
    scraping.getInfoById()
}