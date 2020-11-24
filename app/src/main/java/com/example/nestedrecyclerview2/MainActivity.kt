package com.example.nestedrecyclerview2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview2.adapter.MainRecyclerViewAdapter
import com.example.nestedrecyclerview2.model.AllCategory
import com.example.nestedrecyclerview2.model.CategoryItem

class MainActivity : AppCompatActivity() {

    var mainCategoryRecycler: RecyclerView? = null
    var mainRecycAdapter: MainRecyclerViewAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categoryItemList: MutableList<CategoryItem> = ArrayList()
        categoryItemList.add(CategoryItem(1, R.drawable.hollywood1))
        categoryItemList.add(CategoryItem(1, R.drawable.hollywood2))
        categoryItemList.add(CategoryItem(1, R.drawable.hollywood3))
        categoryItemList.add(CategoryItem(1, R.drawable.hollywood4))
        categoryItemList.add(CategoryItem(1, R.drawable.hollywood5))
        categoryItemList.add(CategoryItem(1, R.drawable.hollywood6))
        val categoryItemList2: MutableList<CategoryItem> = ArrayList()
        categoryItemList2.add(CategoryItem(1, R.drawable.hollywood1))
        categoryItemList2.add(CategoryItem(1, R.drawable.hollywood2))
        categoryItemList2.add(CategoryItem(1, R.drawable.hollywood3))
        categoryItemList2.add(CategoryItem(1, R.drawable.hollywood4))
        categoryItemList2.add(CategoryItem(1, R.drawable.hollywood5))
        categoryItemList2.add(CategoryItem(1, R.drawable.hollywood6))
        val categoryItemList3: MutableList<CategoryItem> = ArrayList()
        categoryItemList3.add(CategoryItem(1, R.drawable.hollywood1))
        categoryItemList3.add(CategoryItem(1, R.drawable.hollywood2))
        categoryItemList3.add(CategoryItem(1, R.drawable.hollywood3))
        categoryItemList3.add(CategoryItem(1, R.drawable.hollywood4))
        categoryItemList3.add(CategoryItem(1, R.drawable.hollywood5))
        categoryItemList3.add(CategoryItem(1, R.drawable.hollywood6))
        val categoryItemList4: MutableList<CategoryItem> = ArrayList()
        categoryItemList4.add(CategoryItem(1, R.drawable.hollywood1))
        categoryItemList4.add(CategoryItem(1, R.drawable.hollywood2))
        categoryItemList4.add(CategoryItem(1, R.drawable.hollywood3))
        categoryItemList4.add(CategoryItem(1, R.drawable.hollywood4))
        categoryItemList4.add(CategoryItem(1, R.drawable.hollywood5))
        categoryItemList4.add(CategoryItem(1, R.drawable.hollywood6))
        val categoryItemList5: MutableList<CategoryItem> = ArrayList()
        categoryItemList5.add(CategoryItem(1, R.drawable.hollywood1))
        categoryItemList5.add(CategoryItem(1, R.drawable.hollywood2))
        categoryItemList5.add(CategoryItem(1, R.drawable.hollywood3))
        categoryItemList5.add(CategoryItem(1, R.drawable.hollywood4))
        categoryItemList5.add(CategoryItem(1, R.drawable.hollywood5))
        categoryItemList5.add(CategoryItem(1, R.drawable.hollywood6))
        val categoryItemList6: MutableList<CategoryItem> = ArrayList()
        categoryItemList6.add(CategoryItem(1, R.drawable.hollywood1))
        categoryItemList6.add(CategoryItem(1, R.drawable.hollywood2))
        categoryItemList6.add(CategoryItem(1, R.drawable.hollywood3))
        categoryItemList6.add(CategoryItem(1, R.drawable.hollywood4))
        categoryItemList6.add(CategoryItem(1, R.drawable.hollywood5))
        categoryItemList6.add(CategoryItem(1, R.drawable.hollywood6))
        val categoryItemList7: MutableList<CategoryItem> = ArrayList()
        categoryItemList7.add(CategoryItem(1, R.drawable.hollywood1))
        categoryItemList7.add(CategoryItem(1, R.drawable.hollywood2))
        categoryItemList7.add(CategoryItem(1, R.drawable.hollywood3))
        categoryItemList7.add(CategoryItem(1, R.drawable.hollywood4))
        categoryItemList7.add(CategoryItem(1, R.drawable.hollywood5))
        categoryItemList7.add(CategoryItem(1, R.drawable.hollywood6))
        val categoryItemList8: MutableList<CategoryItem> = ArrayList()
        categoryItemList8.add(CategoryItem(1, R.drawable.hollywood1))
        categoryItemList8.add(CategoryItem(1, R.drawable.hollywood2))
        categoryItemList8.add(CategoryItem(1, R.drawable.hollywood3))
        categoryItemList8.add(CategoryItem(1, R.drawable.hollywood4))
        categoryItemList8.add(CategoryItem(1, R.drawable.hollywood5))
        categoryItemList8.add(CategoryItem(1, R.drawable.hollywood6))
        val categoryItemList9: MutableList<CategoryItem> = ArrayList()
        categoryItemList9.add(CategoryItem(1, R.drawable.hollywood1))
        categoryItemList9.add(CategoryItem(1, R.drawable.hollywood2))
        categoryItemList9.add(CategoryItem(1, R.drawable.hollywood3))
        categoryItemList9.add(CategoryItem(1, R.drawable.hollywood4))
        categoryItemList9.add(CategoryItem(1, R.drawable.hollywood5))
        categoryItemList9.add(CategoryItem(1, R.drawable.hollywood6))
        val categoryItemList10: MutableList<CategoryItem> = ArrayList()
        categoryItemList10.add(CategoryItem(1, R.drawable.hollywood1))
        categoryItemList10.add(CategoryItem(1, R.drawable.hollywood2))
        categoryItemList10.add(CategoryItem(1, R.drawable.hollywood3))
        categoryItemList10.add(CategoryItem(1, R.drawable.hollywood4))
        categoryItemList10.add(CategoryItem(1, R.drawable.hollywood5))
        categoryItemList10.add(CategoryItem(1, R.drawable.hollywood6))

        val allCategoryList: MutableList<AllCategory> = java.util.ArrayList()
        allCategoryList.add(AllCategory("Hollywood", categoryItemList as ArrayList<CategoryItem>))
        allCategoryList.add(AllCategory("Hollywood2", categoryItemList2 as ArrayList<CategoryItem>))
        allCategoryList.add(AllCategory("Hollywood3", categoryItemList3 as ArrayList<CategoryItem>))
        allCategoryList.add(AllCategory("Hollywood4", categoryItemList4 as ArrayList<CategoryItem>))
        allCategoryList.add(AllCategory("Hollywood5", categoryItemList5 as ArrayList<CategoryItem>))
        allCategoryList.add(AllCategory("Hollywood6", categoryItemList6 as ArrayList<CategoryItem>))
        allCategoryList.add(AllCategory("Hollywood7", categoryItemList7 as ArrayList<CategoryItem>))
        allCategoryList.add(AllCategory("Hollywood8", categoryItemList8 as ArrayList<CategoryItem>))
        allCategoryList.add(AllCategory("Hollywood9", categoryItemList9 as ArrayList<CategoryItem>))
        allCategoryList.add(AllCategory("Hollywood10", categoryItemList10 as ArrayList<CategoryItem>))

        loadData(allCategoryList)

    }

    private fun loadData(allCategoryList: MutableList<AllCategory>) {
        mainCategoryRecycler = findViewById(R.id.main_recycler)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        mainCategoryRecycler!!.layoutManager = layoutManager
        mainRecycAdapter = MainRecyclerViewAdapter(this, allCategoryList as ArrayList<AllCategory>)
        mainCategoryRecycler!!.adapter = mainRecycAdapter

    }
}