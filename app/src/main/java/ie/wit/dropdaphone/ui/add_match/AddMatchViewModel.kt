package ie.wit.dropdaphone.ui.add_match

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddMatchViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is add match Fragment"
    }
    val text: LiveData<String> = _text
}