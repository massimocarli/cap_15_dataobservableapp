package uk.co.massimocarli.dataobservableapp

import androidx.databinding.ObservableArrayList

class CounterList {

  val value = ObservableArrayList<Int>().apply {
    add(0)
  }

  fun inc() {
    value[0] = value[0]?.plus(1)
  }

  fun dec() {
    value[0] = value[0]?.minus(1)
  }
}


