package com.example.kotlin_sopt_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_sopt_1.data.GitFollowerItem
import com.example.kotlin_sopt_1.feature.follower.GitFollowerAdapter
import kotlinx.android.synthetic.main.activity_github_follower.*

class GithubFollowerActivity : AppCompatActivity() {

    private lateinit var rvGitFollower: RecyclerView
    private lateinit var gitFollowerAdapter: GitFollowerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_github_follower)

        initGitFollowerList()

        main_id_txt.text = "ehdrbchd"
        main_name_txt.text = "LeeDongGyu"
        main_dist_txt.text = "LG전자 취업 시켜주세요"
    }

    private fun initGitFollowerList(){
        rvGitFollower = findViewById(R.id.gitFollower_rv)
        gitFollowerAdapter = GitFollowerAdapter(this)
        rvGitFollower.adapter = gitFollowerAdapter
        rvGitFollower.layoutManager = LinearLayoutManager(this)
        gitFollowerAdapter.data = listOf(
            GitFollowerItem(
                id = "ehdrbchd",
                name = "LeeDongGyu",
                img = R.drawable.example
            ),
            GitFollowerItem(
                id = "ehdrbchd",
                name = "LeeDongGyu",
                img = R.drawable.example
            ),
            GitFollowerItem(
                id = "ehdrbchd",
                name = "LeeDongGyu",
                img = R.drawable.example
            ),
            GitFollowerItem(
                id = "ehdrbchd",
                name = "LeeDongGyu",
                img = R.drawable.example
            ),
            GitFollowerItem(
                id = "ehdrbchd",
                name = "LeeDongGyu",
                img = R.drawable.example
            )
        )
        gitFollowerAdapter.notifyDataSetChanged()
    }
}
