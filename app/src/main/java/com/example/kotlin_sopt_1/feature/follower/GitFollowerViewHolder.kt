package com.example.kotlin_sopt_1.feature.follower

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_sopt_1.R
import com.example.kotlin_sopt_1.data.GitFollowerItem

class GitFollowerViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val id_txt: TextView = view.findViewById(R.id.id_txt)
    val name_txt: TextView = view.findViewById(R.id.name_txt)
    val profile_img: ImageView = view.findViewById(R.id.profile_img)

    fun bind(data: GitFollowerItem){
        id_txt.text = data.id
        name_txt.text = data.name
        profile_img.setImageResource(data.img)
    }
}