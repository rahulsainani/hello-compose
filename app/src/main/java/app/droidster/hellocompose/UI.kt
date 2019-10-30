package app.droidster.hellocompose

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Image
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.CrossAxisAlignment
import androidx.ui.layout.HeightSpacer
import androidx.ui.layout.LayoutSize
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle
import androidx.ui.material.withOpacity
import androidx.ui.res.imageResource
import androidx.ui.res.stringResource
import androidx.ui.text.style.TextOverflow

@Composable
fun Content() {
    MaterialTheme {
        NewsStory()
    }
}

@Composable
fun NewsStory() {
    Column(
        modifier = Spacing(16.dp),
        crossAxisAlignment = CrossAxisAlignment.Start,
        crossAxisSize = LayoutSize.Expand
    ) {
        Container(expanded = true, height = 180.dp) {
            Clip(shape = RoundedCornerShape(8.dp)) {
                DrawImage(headerImage())
            }
        }

        HeightSpacer(height = 16.dp)

        Text(
            +stringResource(R.string.title),
            style = (+themeTextStyle { h6 }).withOpacity(0.87f),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            +stringResource(R.string.subtitle),
            style = (+themeTextStyle { body2 }).withOpacity(0.87f)
        )
        Text(
            +stringResource(R.string.body),
            style = (+themeTextStyle { body2 }).withOpacity(0.6f)
        )
    }
}

private fun headerImage(): Image = +imageResource(R.drawable.header)
