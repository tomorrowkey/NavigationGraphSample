package jp.tomorrowkey.android.navigationgraphsample


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import jp.tomorrowkey.android.navigationgraphsample.databinding.FragmentNextBinding

class NextFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentNextBinding>(inflater, R.layout.fragment_next, container, false)
        return binding.root
    }
}
