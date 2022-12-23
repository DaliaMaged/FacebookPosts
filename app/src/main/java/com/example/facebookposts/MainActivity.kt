package com.example.facebookposts

import androidx.appcompat.app.AppCompatActivity
import com.example.facebookposts.Post
import android.os.Bundle
import android.view.View
import com.example.facebookposts.R
import androidx.recyclerview.widget.RecyclerView
import com.example.facebookposts.PostAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import java.util.ArrayList


class MainActivity : AppCompatActivity() {
    private var posts = ArrayList<Post>()
    private var stories = ArrayList<Story>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        posts.add(
            Post(
                R.drawable.p2,
                R.drawable.p2,
                "Dalia Maged",
                "hello there , feel bored doing nothing , what about you ?",
                "1 hour"
            )
        )
        posts.add(
            Post(
                R.drawable.p3,
                R.drawable.p3,
                "Sahar Maged",
                "hello there , feel angry ,stop talking , what about you ?",
                "1 hour"
            )
        )
        posts.add(
            Post(
                R.drawable.p4,
                R.drawable.p4,
                "Saraa Maged",
                "hello there , feel craving , what about you ?",
                "1 hour"
            )
        )
        posts.add(
            Post(
                R.drawable.p5,
                R.drawable.p5,
                "Mohamed Ali",
                "hello there , feel creative today , what about you ?",
                "1 hour"
            )
        )
        val recyclerViewPosts = findViewById<View>(R.id.post_recyclerView) as RecyclerView
        val adapter = PostAdapter(posts)
        recyclerViewPosts.adapter = adapter
        recyclerViewPosts.layoutManager = LinearLayoutManager(this)
        //story
        stories.add(
            Story(
                R.drawable.p2,
                "Dalia Maged",
                R.drawable.p2

            )
        )
        stories.add(
            Story(
                R.drawable.p2,
                "Dalia Maged",
                R.drawable.p2

            )
        )
        stories.add(
            Story(
                R.drawable.p2,
                "Dalia Maged",
                R.drawable.p2

            )
        )
        stories.add(
            Story(
                R.drawable.p2,
                "Dalia Maged",
                R.drawable.p2

            )
        )
        val recyclerViewStories = findViewById<View>(R.id.story_recyclerView) as RecyclerView
        val adapter2 = StoryAdapter(stories)
        recyclerViewStories.adapter = adapter2
        val mLayoutManager = LinearLayoutManager(applicationContext)
        mLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        recyclerViewStories.layoutManager = mLayoutManager

    }
}