package meehan.matthew.multirecyclerapp

data class ArticleHeaderModel(
    override val type: ArticleModelType = ArticleModelType.HEADER,
    var title: CharSequence = ""
): BaseArticleModel