package com.example.nestedrecyclerview2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview2.R
import com.example.nestedrecyclerview2.model.AllCategory
import com.example.nestedrecyclerview2.model.CategoryItem

class MainRecyclerViewAdapter(
    val context: Context,
    private var allCategoryList: ArrayList<AllCategory>
) :
    RecyclerView.Adapter<MainRecyclerViewAdapter.MainViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            LayoutInflater.from(context).inflate(R.layout.main_recycler_row_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

        holder.categoryTitle.text = allCategoryList[position].categoryTitle
        setCatItemRecycler(holder.itemRecycler, allCategoryList[position].categoryItemList)

    }

    override fun getItemCount() = allCategoryList.size


    class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var categoryTitle: TextView
        var itemRecycler: RecyclerView

        init {
            categoryTitle = itemView.findViewById(R.id.cat_title)
            itemRecycler = itemView.findViewById(R.id.item_recycler)

        }
    }


    private fun setCatItemRecycler(
        recyclerView: RecyclerView,
        categoryItemList: ArrayList<CategoryItem>
    ) {
        val itemRecyclerViewAdapter = CategoryItemRecyclerAdapter(context, categoryItemList)
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = itemRecyclerViewAdapter

    }

}
