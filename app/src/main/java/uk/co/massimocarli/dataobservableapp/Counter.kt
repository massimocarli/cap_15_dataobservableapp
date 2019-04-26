package uk.co.massimocarli.dataobservableapp

import androidx.databinding.ObservableInt


class Counter {
  val count = ObservableInt()

  fun inc() {
    count.set(count.get() + 1)
  }

  fun dec() {
    count.set(count.get() - 1)
  }
}