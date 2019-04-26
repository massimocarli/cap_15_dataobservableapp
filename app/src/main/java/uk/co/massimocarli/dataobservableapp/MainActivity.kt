package uk.co.massimocarli.dataobservableapp

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.massimocarli.dataobservableapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(
      this,
      R.layout.activity_main
    )
    binding.counter = Counter()
  }
}
