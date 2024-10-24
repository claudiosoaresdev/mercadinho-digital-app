package com.claudiosoaresdev.mercadinhodigital.shared.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    title: String,
    onNavigationClick: () -> Unit = {},
    navigationIcon: ImageVector? = null,
    navigationIconContentDescription: String? = "Navigation Icon",
    actions: @Composable RowScope.() -> Unit = {}
) {
    TopAppBar(
        title = {
            Text(
                text = title,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        navigationIcon = {
            navigationIcon?.let {
                IconButton(onClick = onNavigationClick) {
                    Icon(
                        imageVector = it,
                        contentDescription = navigationIconContentDescription
                    )
                }
            }
        },
        actions = actions
    )
}

@Preview(showBackground = true)
@Composable
private fun TopBarPreview () {
    TopBar(
        title = "Title"
    )
}