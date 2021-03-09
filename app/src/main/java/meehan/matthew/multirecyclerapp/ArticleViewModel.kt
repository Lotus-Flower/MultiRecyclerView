package meehan.matthew.multirecyclerapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import meehan.matthew.multirecyclerapp.model.ArticleHeaderModel
import meehan.matthew.multirecyclerapp.model.HeadlineArticleModel
import meehan.matthew.multirecyclerapp.model.PhotoArticleModel

class ArticleViewModel : ViewModel() {

    val adapter: MutableLiveData<ArticleAdapter> = MutableLiveData()

    fun getArticles() {
        adapter.value = ArticleAdapter()
        adapter.value?.data = mutableListOf(
                ArticleHeaderModel(
                        title = "Articles"
                ),
                PhotoArticleModel(
                        title = "Headline1",
                        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                                "sed do eiusmod tempor incididunt ut labore.",
                        photoUrl = "https://placekitten.com/120/120"
                ),
                PhotoArticleModel(
                        title = "Headline2",
                        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                                "sed do eiusmod tempor incididunt ut labore.",
                        photoUrl = "https://placekitten.com/120/120"
                ),
                HeadlineArticleModel(
                        title = "Headline3",
                        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                                "sed do eiusmod tempor incididunt ut labore et dolore."
                ),
                HeadlineArticleModel(
                        title = "Headline4",
                        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                                "sed do eiusmod tempor incididunt ut labore et dolore."
                ),
                HeadlineArticleModel(
                        title = "Headline5",
                        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                                "sed do eiusmod tempor incididunt ut labore et dolore."
                )
        )
    }
}