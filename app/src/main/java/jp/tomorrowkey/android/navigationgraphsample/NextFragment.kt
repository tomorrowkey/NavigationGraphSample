package jp.tomorrowkey.android.navigationgraphsample


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import jp.tomorrowkey.android.navigationgraphsample.databinding.FragmentNextBinding

class NextFragment : Fragment(), NextFragmentHandler {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentNextBinding>(inflater, R.layout.fragment_next, container, false)
        binding.handler = this
        return binding.root
    }

    override fun onClickPopButton(view: View) {
        view.findNavController().navigate(R.id.action_nextFragment_to_homeFragment)
    }
}

interface NextFragmentHandler {
    fun onClickPopButton(view: View)
}