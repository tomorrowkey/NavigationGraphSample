package jp.tomorrowkey.android.navigationgraphsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import jp.tomorrowkey.android.navigationgraphsample.databinding.FragmentHomeBinding

class HomeFragment : Fragment(), HomeFragmentEventHandler {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(inflater, R.layout.fragment_home, container, false)
        binding.handler = this
        return binding.root
    }

    override fun onClickNextButton(view: View) {
        val action = HomeFragmentDirections.actionHomeFragmentToNextFragment("hoge")
        view.findNavController().navigate(action)
    }

    override fun onClickNestedFragmentButton(view: View) {
        view.findNavController().navigate(R.id.action_homeFragment_to_nestedNavGraph)
    }
}

interface HomeFragmentEventHandler {
    fun onClickNextButton(view: View)
    fun onClickNestedFragmentButton(view: View)
}