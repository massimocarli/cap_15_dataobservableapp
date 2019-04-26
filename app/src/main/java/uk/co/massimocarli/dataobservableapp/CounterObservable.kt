package uk.co.massimocarli.dataobservableapp

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class CounterObservable : BaseObservable() {

  @get:Bindable
  var count: Int = 0
    set(value) {
      field = value
      notifyPropertyChanged(BR.count)
    }

  fun inc() = count++

  fun dec() = count--
}