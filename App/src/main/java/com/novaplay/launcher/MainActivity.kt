
package com.novaplay.launcher

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(32, 32, 32, 32)
        layout.setBackgroundColor(Color.rgb(12, 16, 32))

        val title = TextView(this)
        title.text = "NOVA PLAY"
        title.textSize = 34f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "YOUR GAMING WORLD"
        subtitle.textSize = 16f
        subtitle.setTextColor(Color.CYAN)
        subtitle.gravity = Gravity.CENTER

        layout.addView(title)
        layout.addView(subtitle)

        setContentView(layout)
    }
}
