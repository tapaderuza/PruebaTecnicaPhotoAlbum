import com.nhaarman.mockitokotlin2.whenever
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockitoExtension::class)
class AlbumServiceTest {

    @Mock
    lateinit var jsonPlaceholderClient: JsonPlaceholderClient

    @InjectMocks
    lateinit var albumService: AlbumService

    @Test
    fun `should return all albums`() {
        val albums = listOf(Album(1, 1, "Album 1"))
        whenever(jsonPlaceholderClient.getAlbums()).thenReturn(albums)

        val result = albumService.getAllAlbums()
        assertEquals(albums, result)
    }

    @Test
    fun `should return photos by albumId`() {
        val photos = listOf(Photo(1, 1, "Photo 1", "url", "thumbnailUrl"))
        whenever(jsonPlaceholderClient.getPhotos()).thenReturn(photos)

        val result = albumService.getPhotosByAlbumId(1)
        assertEquals(photos, result)
    }
}
