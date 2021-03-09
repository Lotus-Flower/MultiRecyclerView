package meehan.matthew.multirecyclerapp

data class PhotoArticleModel(
    override val type: ArticleModelType = ArticleModelType.PHOTO,
    var title: CharSequence = "",
    var description: CharSequence = "",
    var photoUrl: String = ""
): BaseArticleModel