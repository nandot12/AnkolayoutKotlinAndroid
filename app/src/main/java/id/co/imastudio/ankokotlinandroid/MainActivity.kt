package id.co.imastudio.ankokotlinandroid

import android.annotation.SuppressLint
import android.app.ActionBar
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        NandoUI().setContentView(this)


    }

    class NandoUI : AnkoComponent<MainActivity> {
        @SuppressLint("ResourceType")
        override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
            relativeLayout {
                var input1 = editText {
                    hint = "Nilai 1"
                    inputType = InputType.TYPE_CLASS_NUMBER
                    id = 1
                }.lparams {
                    width = matchParent
                    alignParentTop()
                }

                var input2 = editText {
                    hint = "Nilai 1"
                    inputType = InputType.TYPE_CLASS_NUMBER
                    id = 2
                }.lparams {

                    width = matchParent
                    below(1)

                }

                var text1 = textView {
                    text = "Hasilnya"
                }.lparams {
                    centerInParent()
                }

                button {

                    onClick {

                        if (!input1.text.toString().isEmpty() || !input2.text.toString().isEmpty()) {

                            var hasil = input1.text.toString().toInt() * input2.text.toString().toInt()
                            text1.text = hasil.toString()

                        } else {
                            toast("nggak boleh kosong")
                        }
                    }
                }.lparams {
                    width = matchParent
                    below(2)
                }


            }


            // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }


}
