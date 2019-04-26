package uk.co.massimocarli.dataobservableapp

import androidx.databinding.ObservableArrayMap

val KEY = "countKey"

class CounterMap {

  val value = ObservableArrayMap<String, Int>().apply {
    put(KEY, 0)
  }

  fun inc() {
    value[KEY] = value[KEY]?.plus(1)
  }

  fun dec() {
    value[KEY] = value[KEY]?.minus(1)
  }
}


