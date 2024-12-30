package com.example.databaseapplication.ui.viewMahasiswa

import androidx.compose.runtime.Composable


@Composable
fun HomeView(
    viewModel: HomeViewModel = viewModel,
    navigateToInsert: () -> Unit
) {
    when (val state = viewModel.uiState) {
        is HomeUiState.Loading -> {/* Display loading */}
        is HomeUiState.Success -> {/* Display mahasiswa list */}
        is HomeUiState.Error -> {/* Display error */}
    }
}

class HomeUiState {
    class Loading {

    }

    class Success {

    }

    class Error {

    }

}

abstract class HomeViewModel {

    abstract val uiState: Any
}
