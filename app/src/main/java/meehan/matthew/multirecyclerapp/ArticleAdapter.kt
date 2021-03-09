package meehan.matthew.multirecyclerapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import meehan.matthew.multirecyclerapp.databinding.ViewHolderHeaderArticleBinding
import meehan.matthew.multirecyclerapp.databinding.ViewHolderHeadlineArticleBinding
import meehan.matthew.multirecyclerapp.databinding.ViewHolderPhotoArticleBinding

class ArticleAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var data: MutableList<BaseArticleModel> = mutableListOf()
        set(value) {
            field.clear()
            field.addAll(value)
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            ArticleModelType.HEADER.ordinal -> HeaderArticleViewHolder(
                ViewHolderHeaderArticleBinding.inflate(LayoutInflater.from(parent.context),
                parent,
                false
            ))
            ArticleModelType.HEADLINE.ordinal -> HeadlineArticleViewHolder(
                ViewHolderHeadlineArticleBinding.inflate(LayoutInflater.from(parent.context),
                parent,
                false
            ))
            else -> PhotoArticleViewHolder(
                ViewHolderPhotoArticleBinding.inflate(LayoutInflater.from(parent.context),
                parent,
                false
            ))
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is BaseArticleViewHolder -> holder.bind(data[position])
        }
    }

    override fun getItemViewType(position: Int): Int {
        return data[position].type.ordinal
    }

    class HeaderArticleViewHolder(private val itemBinding: ViewHolderHeaderArticleBinding) : RecyclerView.ViewHolder(itemBinding.root), BaseArticleViewHolder {
        override fun bind(articleModel: BaseArticleModel) {
            itemBinding.model = articleModel as ArticleHeaderModel
        }
    }

    class HeadlineArticleViewHolder(private val itemBinding: ViewHolderHeadlineArticleBinding) : RecyclerView.ViewHolder(itemBinding.root), BaseArticleViewHolder {
        override fun bind(articleModel: BaseArticleModel) {
            itemBinding.model = articleModel as HeadlineArticleModel
        }
    }

    class PhotoArticleViewHolder(private val itemBinding: ViewHolderPhotoArticleBinding) : RecyclerView.ViewHolder(itemBinding.root), BaseArticleViewHolder {
        override fun bind(articleModel: BaseArticleModel) {
            itemBinding.model = articleModel as PhotoArticleModel
        }
    }

}