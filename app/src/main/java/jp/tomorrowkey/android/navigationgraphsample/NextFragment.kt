package jp.tomorrowkey.android.navigationgraphsample


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import jp.tomorrowkey.android.navigationgraphsample.databinding.FragmentNextBinding

class NextFragment : Fragment(), NextFragmentHandler {
    val args: NextFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentNextBinding>(inflater, R.layout.fragment_next, container, false)
        binding.handler = this
        binding.name = args.name
        return binding.root
    }

    override fun onClickPopButton(view: View) {
        view.findNavController().navigate(R.id.action_nextFragment_to_homeFragment)
    }

    override fun onClickNestedFragmentButton(view: View) {
        view.findNavController().navigate(R.id.action_nextFragment_to_nestedNavGraph)
    }
}

interface NextFragmentHandler {
    fun onClickPopButton(view: View)
    fun onClickNestedFragmentButton(view: View)
}