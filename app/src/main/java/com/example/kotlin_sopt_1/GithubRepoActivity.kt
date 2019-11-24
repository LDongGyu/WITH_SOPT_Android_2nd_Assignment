package com.example.kotlin_sopt_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_sopt_1.data.GitRepoItem
import com.example.kotlin_sopt_1.feature.repo.GitRepoAdapter

class GithubRepoActivity : AppCompatActivity() {

    private lateinit var rvGitRepo: RecyclerView
    private lateinit var gitRepoAdapter: GitRepoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_github_repo)

        initGitRepoList()
    }

    private fun initGitRepoList(){
        rvGitRepo = findViewById(R.id.gitRepo_rv)
        gitRepoAdapter =
            GitRepoAdapter(this)
        rvGitRepo.adapter = gitRepoAdapter
        rvGitRepo.layoutManager = LinearLayoutManager(this)

        gitRepoAdapter.data = listOf(
            GitRepoItem(
                name = "SoptStagram",
                dist = "IT 창업 동아리 SOPT 안드로이드 교육 프로젝트",
                language = "Kotlin",
                language_color = 0
            ),
            GitRepoItem(
                name = "우아",
                dist = "두번째 과제",
                language = "Kotlin",
                language_color = 0
            ),
            GitRepoItem(
                name = "취업시켜주세요",
                dist = "LG전자 합격시켜주세요",
                language = "Kotlin",
                language_color = 0
            ),
            GitRepoItem(
                name = "LG전자 MC본부",
                dist = "안드로이드 개발할래요",
                language = "Kotlin",
                language_color = 0
            )
        )
        gitRepoAdapter.notifyDataSetChanged()
    }
}
