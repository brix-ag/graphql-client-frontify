package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class Guideline implements ch.brix.gql.client.frontify.interfaces.Node {
  /**
   * `Guideline` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `Guideline` name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * `Guideline` color.
   */
  @com.google.gson.annotations.SerializedName("color")
  private ch.brix.gql.client.frontify.objects.RgbaColor color;
  /**
   * `Guideline` internal url.
   */
  @com.google.gson.annotations.SerializedName("url")
  private ch.brix.gql.client.frontify.scalars.UrlScalar url;
  /**
   * Paginated list of `LibraryPage` items for `Guideline`.
   */
  @com.google.gson.annotations.SerializedName("libraryPages")
  private ch.brix.gql.client.frontify.objects.LibraryPageItems libraryPages;
}
