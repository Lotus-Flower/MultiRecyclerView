package meehan.matthew.multirecyclerapp

data class HeadlineArticleModel(
    override val type: ArticleModelType = ArticleModelType.HEADLINE,
    var title: CharSequence = "",
    var description: CharSequence = ""
): BaseArticleModel