package uk.co.massimocarli.dataobservableapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.massimocarli.dataobservableapp.databinding.ActivityMainListBinding

class CounterListActivity : AppCompatActivity() {

  lateinit var binding: ActivityMainListBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(
      this,
      R.layout.activity_main_list
    )
    binding.counter = CounterList()
  }
}
