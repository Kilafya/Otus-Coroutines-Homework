package otus.homework.coroutines.data.mapper

import otus.homework.coroutines.data.model.ImageUrlEntity
import otus.homework.coroutines.domain.model.ImageUrlModel
import javax.inject.Inject

class ImageUrlMapper @Inject constructor() {

    fun map(entity: ImageUrlEntity): ImageUrlModel {
        return ImageUrlModel(url = entity.url ?: "")
    }
}