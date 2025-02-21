package com.essycynthia.bookapp.presentation.books_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.essycynthia.bookapp.domain.models.Books

@Composable
fun BookListItem(
    books: Books,
    onItemClick: (Books) -> Unit
) {

  Column(
      Modifier
          .fillMaxWidth(fraction = 0.5f)
          .height(200.dp)
          .clickable { onItemClick(books) }) {
      AsyncImage(
          model = books.resultDtos.firstOrNull()?.formats?.mimeType.toString(),
          contentDescription =books.resultDtos.firstOrNull()?.formats?.mimeType.toString(),
      )
      Text(text = books.resultDtos.firstOrNull()?.title.toString())
      Text(text = books.resultDtos.firstOrNull()?.authors?.firstOrNull()?.name.toString())

  }

}