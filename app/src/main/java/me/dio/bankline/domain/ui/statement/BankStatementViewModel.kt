package me.dio.bankline.domain.ui.statement

import androidx.lifecycle.ViewModel
import me.dio.bankline.domain.data.BankLineRepositor

class BankStatementViewModel : ViewModel() {

    fun findBankStatement(accountHolderId: Int) =
        BankLineRepositor.findBankStatement(accountHolderId)

}