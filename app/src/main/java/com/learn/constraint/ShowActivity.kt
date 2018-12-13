package com.learn.constraint

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * create date:  2018/12/12
 * creator:  luoyonghui
 * functional description:
 *
 */
class ShowActivity : AppCompatActivity() {

    private val tag: String = "ShowActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var layoutResID: Int

        var extras = this.intent.extras
        var type: String? = extras.get(showType).toString()
        Log.d(tag, "type : $type")
        layoutResID = if (type == typeBias) {
            R.layout.activity_bias
        } else {
            R.layout.activity_default
        }
        setContentView(layoutResID)
    }

    companion object {
        const val showType: String = "showType"
        const val typeBias: String = "type_bias"
    }
}