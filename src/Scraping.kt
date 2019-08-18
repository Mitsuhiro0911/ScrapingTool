import org.jsoup.nodes.Document

class Scraping(val document:Document) {
    /**
     * コンストラクタ
     * コネクトしたURLの全HTML情報の出力
     */
    init {
        println(document.html())
    }

    /**
     * 要素による抽出
     */
    fun getInfoByElement () {
        val elements = document.select("h2")
        for (element in elements) {
            println(element.text())
        }
    }

    /**
     * 属性による抽出
     */
    fun getInfoByAttr () {
        val attributes = document.select("a").attr("abs:href", "")
        for (attribute in attributes) {
            println(attribute)
        }
    }

    /**
     * IDによる抽出
     */
    fun getInfoById () {
        val id = document.getElementById("top")
        println(id)
    }
}