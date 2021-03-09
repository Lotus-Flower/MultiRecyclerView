package meehan.matthew.multirecyclerapp.model

data class ArticleHeaderModel(
        override val type: ArticleModelType = ArticleModelType.HEADER,
        var title: CharSequence = ""
): BaseArticleModel