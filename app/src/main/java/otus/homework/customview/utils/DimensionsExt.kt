package otus.homework.customview.utils

import android.content.res.Resources

val Int.dp: Float
    get() = this * Resources.getSystem().displayMetrics.density