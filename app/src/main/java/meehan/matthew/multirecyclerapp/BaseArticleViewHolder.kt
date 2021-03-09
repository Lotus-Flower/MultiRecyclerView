package meehan.matthew.multirecyclerapp

import meehan.matthew.multirecyclerapp.model.BaseArticleModel

interface BaseArticleViewHolder {
    fun bind(articleModel: BaseArticleModel)
}