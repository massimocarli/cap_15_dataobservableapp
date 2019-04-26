package uk.co.massimocarli.dataobservableapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.massimocarli.dataobservableapp.databinding.ActivityMainObservableBinding

class ObservableMainActivity : AppCompatActivity() {

  lateinit var binding: ActivityMainObservableBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(
      this,
      R.layout.activity_main_observable
    )
    binding.counter = CounterObservable()
  }
}
