package com.example.nicdaoexer3

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)
        }

        findViewById<TextView>(R.id.nickname_text).setOnClickListener {
            updateNickname(it)
        }

        setListeners()
    }

    private fun addNickname(view:View){
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)

        nicknameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE
        //Hides the keyboard
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun updateNickname (view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val doneButton = findViewById<Button>(R.id.done_button)
        editText.visibility = View.VISIBLE
        doneButton.visibility = View.VISIBLE
        view.visibility = View.GONE
        editText.requestFocus()
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, 0)
    }
   /* private fun flipLight(view:View){
        when(view.id){
            R.id.box1 -> view.setBackgroundColor(Color.BLACK)
        }
    }*/

    private fun setListeners(){
        val box1 = findViewById<TextView>(R.id.box1)
        val box2 = findViewById<TextView>(R.id.box2)
        val box3= findViewById<TextView>(R.id.box3)
        val box4 = findViewById<TextView>(R.id.box4)
        val box5 = findViewById<TextView>(R.id.box5)
        val box6 = findViewById<TextView>(R.id.box6)
        val box7 = findViewById<TextView>(R.id.box7)
        val box8 = findViewById<TextView>(R.id.box8)
        val box9 = findViewById<TextView>(R.id.box9)
        val box10 = findViewById<TextView>(R.id.box10)
        val box11 = findViewById<TextView>(R.id.box11)
        val box12 = findViewById<TextView>(R.id.box12)
        val box13 = findViewById<TextView>(R.id.box13)
        val box14 = findViewById<TextView>(R.id.box14)
        val box15 = findViewById<TextView>(R.id.box15)
        val box16 = findViewById<TextView>(R.id.box16)
        val box17 = findViewById<TextView>(R.id.box17)
        val box18 = findViewById<TextView>(R.id.box18)
        val box19 = findViewById<TextView>(R.id.box19)
        val box20 = findViewById<TextView>(R.id.box20)
        val box21 = findViewById<TextView>(R.id.box21)
        val box22 = findViewById<TextView>(R.id.box22)
        val box23 = findViewById<TextView>(R.id.box23)
        val box24 = findViewById<TextView>(R.id.box24)
        val box25 = findViewById<TextView>(R.id.box25)

        val clickableViews: List<View> =
            listOf(box1,box2,box3,box4,box5,
                   box6,box7,box8,box9,box10,
                   box11,box12,box13,box14,box15,
                   box16,box17,box18,box19,box20,
                    box21,box22,box23,box24,box25)

        val twoDimen = mutableListOf<Int>(
            1,1,1,1,1,
            1,1,1,1,1,
            1,1,1,1,1,
            1,1,1,1,1,
            1,1,1,1,1)
        for (item in clickableViews){
            item.setOnClickListener{
                when(it.id){
                    R.id.box1 -> {
                        twoDimen[0] = twoDimen[0]*(-1)
                        twoDimen[1] = twoDimen[1]*(-1)
                        twoDimen[5] = twoDimen[5]*(-1)
                    }
                    R.id.box2 ->{
                        twoDimen[1] = twoDimen[1]*(-1)
                        twoDimen[0] = twoDimen[0]*(-1)
                        twoDimen[2] = twoDimen[2]*(-1)
                        twoDimen[6] = twoDimen[6]*(-1)
                    }
                    R.id.box3 ->{
                        twoDimen[1] = twoDimen[1]*-1
                        twoDimen[2] = twoDimen[2]*-1
                        twoDimen[3] = twoDimen[3]*-1
                        twoDimen[7] = twoDimen[7]*-1
                    }
                    R.id.box4 ->{
                        twoDimen[2] = twoDimen[3]*-1
                        twoDimen[3] = twoDimen[4]*-1
                        twoDimen[4] = twoDimen[4]*-1
                        twoDimen[8] = twoDimen[8]*-1
                    }
                    R.id.box5 ->{
                        twoDimen[3] = twoDimen[3]*-1
                        twoDimen[4] = twoDimen[4]*-1
                        twoDimen[9] = twoDimen[9]*-1
                    }
                    R.id.box6 ->{
                        twoDimen[0] = twoDimen[0]*-1
                        twoDimen[5] = twoDimen[5]*-1
                        twoDimen[6] = twoDimen[6]*-1
                        twoDimen[10] = twoDimen[10]*-1
                    }
                    R.id.box7 ->{
                        twoDimen[1] = twoDimen[1]*-1
                        twoDimen[6] = twoDimen[6]*-1
                        twoDimen[5] = twoDimen[5]*-1
                        twoDimen[7] = twoDimen[7]*-1
                        twoDimen[11] = twoDimen[11]*-1
                    }
                    R.id.box8 ->{
                        twoDimen[2] = twoDimen[2]*-1
                        twoDimen[6] = twoDimen[6]*-1
                        twoDimen[7] = twoDimen[7]*-1
                        twoDimen[8] = twoDimen[8]*-1
                        twoDimen[12] = twoDimen[12]*-1
                    }
                    R.id.box9 ->{
                        twoDimen[3] = twoDimen[3]*-1
                        twoDimen[7] = twoDimen[7]*-1
                        twoDimen[8] = twoDimen[8]*-1
                        twoDimen[9] = twoDimen[9]*-1
                        twoDimen[13] = twoDimen[13]*-1
                    }
                    R.id.box10 ->{
                        twoDimen[4] = twoDimen[4]*-1
                        twoDimen[9] = twoDimen[9]*-1
                        twoDimen[8] = twoDimen[8]*-1
                        twoDimen[14] = twoDimen[14]*-1
                    }
                    R.id.box11 ->{
                        twoDimen[5] = twoDimen[5]*-1
                        twoDimen[10] = twoDimen[10]*-1
                        twoDimen[11] = twoDimen[11]*-1
                        twoDimen[15] = twoDimen[15]*-1
                    }
                    R.id.box12 ->{
                        twoDimen[6] = twoDimen[6]*-1
                        twoDimen[10] = twoDimen[10]*-1
                        twoDimen[11] = twoDimen[11]*-1
                        twoDimen[12] = twoDimen[12]*-1
                        twoDimen[16] = twoDimen[16]*-1
                    }
                    R.id.box13->{
                        twoDimen[7] = twoDimen[7]*-1
                        twoDimen[11] = twoDimen[11]*-1
                        twoDimen[12] = twoDimen[12]*-1
                        twoDimen[13] = twoDimen[13]*-1
                        twoDimen[17] = twoDimen[17]*-1
                    }
                    R.id.box14->{
                        twoDimen[8] = twoDimen[8]*-1
                        twoDimen[12] = twoDimen[12]*-1
                        twoDimen[13] = twoDimen[13]*-1
                        twoDimen[14] = twoDimen[14]*-1
                        twoDimen[18] = twoDimen[18]*-1
                    }
                    R.id.box15 ->{
                        twoDimen[9] = twoDimen[9]*-1
                        twoDimen[13] = twoDimen[13]*-1
                        twoDimen[14] = twoDimen[14]*-1
                        twoDimen[19] = twoDimen[19]*-1
                    }
                    R.id.box16 ->{
                        twoDimen[10] = twoDimen[10]*-1
                        twoDimen[15] = twoDimen[15]*-1
                        twoDimen[16] = twoDimen[16]*-1
                        twoDimen[20] = twoDimen[20]*-1
                    }
                    R.id.box17 ->{
                        twoDimen[11] = twoDimen[11]*-1
                        twoDimen[15] = twoDimen[15]*-1
                        twoDimen[16] = twoDimen[16]*-1
                        twoDimen[17] = twoDimen[17]*-1
                        twoDimen[21] = twoDimen[21]*-1
                    }
                    R.id.box18 -> {
                        twoDimen[12] = twoDimen[12]*-1
                        twoDimen[16] = twoDimen[16]*-1
                        twoDimen[17] = twoDimen[17]*-1
                        twoDimen[18] = twoDimen[18]*-1
                        twoDimen[22] = twoDimen[22]*-1
                    }
                    R.id.box19 ->{
                        twoDimen[13] = twoDimen[13]*-1
                        twoDimen[17] = twoDimen[17]*-1
                        twoDimen[18] = twoDimen[18]*-1
                        twoDimen[19] = twoDimen[19]*-1
                        twoDimen[23] = twoDimen[23]*-1
                    }
                    R.id.box20 ->{
                        twoDimen[14] = twoDimen[14]*-1
                        twoDimen[18] = twoDimen[18]*-1
                        twoDimen[19] = twoDimen[19]*-1
                        twoDimen[24] = twoDimen[24]*-1
                    }
                    R.id.box21 ->{
                        twoDimen[15] = twoDimen[15]*-1
                        twoDimen[20] = twoDimen[20]*-1
                        twoDimen[21] = twoDimen[21]*-1
                    }
                    R.id.box22 ->{
                        twoDimen[16] = twoDimen[16]*-1
                        twoDimen[20] = twoDimen[20]*-1
                        twoDimen[21] = twoDimen[21]*-1
                        twoDimen[22] = twoDimen[22]*-1
                    }
                    R.id.box23 ->{
                        twoDimen[17] = twoDimen[17]*-1
                        twoDimen[21] = twoDimen[21]*-1
                        twoDimen[22] = twoDimen[22]*-1
                        twoDimen[23] = twoDimen[23]*-1
                    }
                    R.id.box24->{
                        twoDimen[18] = twoDimen[18]*-1
                        twoDimen[22] = twoDimen[22]*-1
                        twoDimen[23] = twoDimen[23]*-1
                        twoDimen[24] = twoDimen[24]*-1
                    }
                    R.id.box25 ->{
                        twoDimen[19] = twoDimen[19]*-1
                        twoDimen[23] = twoDimen[23]*-1
                        twoDimen[24] = twoDimen[24]*-1
                    }
                }
                for(i in 0..24){
                    when(twoDimen[i]){
                        -1 -> clickableViews[i].setBackgroundColor(Color.BLACK)
                        1 -> clickableViews[i].setBackgroundColor(Color.CYAN)
                    }
                }
            }
        }



    }
}
