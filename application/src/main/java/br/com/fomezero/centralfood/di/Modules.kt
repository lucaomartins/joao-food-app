package br.com.fomezero.centralfood.di

import br.com.fomezero.centralfood.domain.auth.Auth
import br.com.fomezero.centralfood.domain.auth.AuthImpl
import br.com.fomezero.centralfood.presentation.login.LoginViewModel
import br.com.fomezero.centralfood.presentation.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    single<Auth>{
        AuthImpl()
    }

    viewModel {
        MainViewModel(get())
    }

    viewModel {
        LoginViewModel(get())
    }
}