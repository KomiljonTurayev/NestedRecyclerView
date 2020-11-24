package com.example.nestedrecyclerview2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview2.R
import com.example.nestedrecyclerview2.model.CategoryItem

class CategoryItemRecyclerAdapter(
    val context: Context,
    private val categoryItemList: ArrayList<CategoryItem>
) :
    RecyclerView.Adapter<CategoryItemRecyclerAdapter.CategoryItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryItemViewHolder {

        return CategoryItemViewHolder(
            LayoutInflater.from(context).inflate(R.layout.category_row_items, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CategoryItemViewHolder, position: Int) {
        holder.itemImage.setImageResource(categoryItemList[position].imageUrl)
    }

    override fun getItemCount() = categoryItemList.size

    class CategoryItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var itemImage: ImageView = itemView.findViewById(R.id.item_image)

    }
}