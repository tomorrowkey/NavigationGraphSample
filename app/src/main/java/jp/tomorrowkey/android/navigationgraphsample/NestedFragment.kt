package jp.tomorrowkey.android.navigationgraphsample


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import jp.tomorrowkey.android.navigationgraphsample.databinding.FragmentNestedBinding

class NestedFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentNestedBinding>(inflater, R.layout.fragment_nested, container, false)
        return binding.root
    }
}
