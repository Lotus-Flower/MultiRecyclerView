package meehan.matthew.multirecyclerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import meehan.matthew.multirecyclerapp.databinding.ActivityArticleBinding

class ArticleActivity : AppCompatActivity() {

    private val viewModel: ArticleViewModel by viewModels()

    private lateinit var binding: ActivityArticleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityArticleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.model = viewModel
        viewModel.getArticles()
    }
}