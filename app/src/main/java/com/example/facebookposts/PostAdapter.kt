package com.example.facebookposts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(var posts: ArrayList<Post>) : RecyclerView.Adapter<PostAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val postView = inflater.inflate(R.layout.post_item, parent, false)
        return ViewHolder(postView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.profileName.text = posts[position].name
        holder.profileImage.setImageResource(posts[position].profileImage)
        holder.postImage.setImageResource(posts[position].postImage)
        holder.timePast.text = posts[position].timePast
        holder.content.text = posts[position].content
    }

    override fun getItemCount(): Int {
        return posts.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var profileImage: ImageView
        var postImage: ImageView
        var timePast: TextView
        var profileName: TextView
        var content: TextView

        init {
            profileImage = itemView.findViewById(R.id.profileImage)
            postImage = itemView.findViewById(R.id.postImage)
            timePast = itemView.findViewById(R.id.time_past)
            profileName = itemView.findViewById(R.id.person_name)
            content = itemView.findViewById(R.id.post_content)
        }
    }
}