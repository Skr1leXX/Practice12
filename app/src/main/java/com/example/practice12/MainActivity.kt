import com.example.practice12.R
import android.widget.RadioButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)

        val radioButton1 = findViewById<RadioButton>(R.id.radioButton1)
        val radioButton2 = findViewById<RadioButton>(R.id.radioButton2)
        val radioButton3 = findViewById<RadioButton>(R.id.radioButton3)


        radioButton1.setOnClickListener { onRadioButtonClicked(radioButton1) }
        radioButton2.setOnClickListener { onRadioButtonClicked(radioButton2) }
        radioButton3.setOnClickListener { onRadioButtonClicked(radioButton3) }
    }

    private fun onRadioButtonClicked(radioButton: RadioButton) {
        when (radioButton.id) {
            R.id.radioButton1 -> {
                imageView.setImageResource(R.drawable.apple)
            }
            R.id.radioButton2 -> {
                imageView.setImageResource(R.drawable.pear)
            }
            R.id.radioButton3 -> {
                imageView.setImageResource(R.drawable.grape)
            }
        }
    }
}