package dizzcode.com.dessertrelease

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dizzcode.com.dessertrelease.ui.DessertReleaseApp
import dizzcode.com.dessertrelease.ui.theme.DessertReleaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DessertReleaseTheme {
                DessertReleaseApp()
            }
        }
    }
}
