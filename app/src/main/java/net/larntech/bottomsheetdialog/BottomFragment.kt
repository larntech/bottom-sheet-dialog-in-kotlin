package net.larntech.bottomsheetdialog

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_bottom_sheet.*
import kotlinx.android.synthetic.main.fragment_bottom_sheet.view.*

class BottomFragment(): BottomSheetDialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_bottom_sheet, container, false);
        var btnContinue = view.btnContinue;
        var edUsername = view.edUsername;

        btnContinue.setOnClickListener {
            if(edUsername.text.trim().toString().isNotEmpty()){
                var userName = edUsername.text.trim().toString();
                startActivity(Intent(requireContext(), ItemActivity::class.java).putExtra("data",userName))
                dismiss()
            }else{
                Toast.makeText(requireContext(),"Input Required", Toast.LENGTH_LONG).show()
            }
        }
        return view;
    }
}