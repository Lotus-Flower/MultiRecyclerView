package meehan.matthew.multirecyclerapp.model

data class HeadlineArticleModel(
        override val type: ArticleModelType = ArticleModelType.HEADLINE,
        var title: CharSequence = "",
        var description: CharSequence = ""
): BaseArticleModel