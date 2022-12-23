package com.example.facebookposts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class StoryAdapter(var stories:ArrayList<Story>) : RecyclerView.Adapter<StoryAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context=parent.context
        val inflater=LayoutInflater.from(context)
        val storyItem=inflater.inflate(R.layout.story_item,parent,false)
        return ViewHolder(storyItem)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.storyOwner.text = stories[position].storyOwner
        holder.storyImage.setBackgroundResource(stories[position].storyImage)
        holder.ownerImage.setImageResource(stories[position].ownerImage)
    }

    override fun getItemCount(): Int {
       return stories.size
    }
    class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
        var storyImage:ConstraintLayout
        var ownerImage:ImageView
        var storyOwner:TextView
        init {
            storyImage=itemView.findViewById(R.id.myStoryContainer)
            ownerImage=itemView.findViewById(R.id.owner_img)
            storyOwner=itemView.findViewById(R.id.owner_name)
        }
    }
}