package com.example.quizearningapp.adaptor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quizearningapp.databinding.CategoryitemBinding
import com.example.quizearningapp.model.categoryModelClass

class categoryAdaptor(var categoryList: ArrayList<categoryModelClass>) : RecyclerView.Adapter<categoryAdaptor.myCategoryViewHolder>() {
    class myCategoryViewHolder(var binding: CategoryitemBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myCategoryViewHolder {
        return myCategoryViewHolder(CategoryitemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = categoryList.size

    override fun onBindViewHolder(holder: myCategoryViewHolder, position: Int) {
        var dataList = categoryList[position]
        holder.binding.categoryImage.setImageResource(dataList.catImage)
        holder.binding.category.text = dataList.catText
    }


}