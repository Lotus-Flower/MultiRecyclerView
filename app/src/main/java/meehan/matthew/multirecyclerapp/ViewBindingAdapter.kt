package meehan.matthew.multirecyclerapp

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

@BindingAdapter("recyclerAdapter")
fun bindRecyclerAdapter(recyclerView: RecyclerView, adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>?) {
    recyclerView.setHasFixedSize(true)
    recyclerView.adapter = adapter
}

@BindingAdapter("remoteImageUrl")
fun bindRemoteImageUrl(imageView: ImageView, url: String) {
    Picasso
        .get()
        .load(url)
        .into(imageView)
}