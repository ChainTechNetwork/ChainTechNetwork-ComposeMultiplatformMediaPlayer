package org.chaintech.app.utility

import androidx.compose.runtime.Composable

@Composable
actual fun SystemAppearance() {

}

actual fun getSafeAreaHeight(): SafeAreaSize {
    return SafeAreaSize()
}