package com.z.nestedscrolling


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetBehavior


class MainActivity : AppCompatActivity() {
    private var mBottomSheetBehavior: BottomSheetBehavior<*>? = null
    private lateinit var rv : RecyclerView
    private lateinit var simpleAdapter: SimpleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv = findViewById(R.id.rv)

        val bottomSheet = findViewById<View>(R.id.bottom_sheet)
        mBottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)
        setUpRV()

    }

    private fun setUpRV(){
        val gridLayoutManager = GridLayoutManager(this,3)
        gridLayoutManager.isAutoMeasureEnabled  = true
        rv.layoutManager = gridLayoutManager
        rv.isNestedScrollingEnabled = false
        simpleAdapter = SimpleAdapter(Extras.getImagesList())
        rv.adapter = simpleAdapter
    }
}