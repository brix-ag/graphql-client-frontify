package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class LibraryPage implements ch.brix.gql.client.frontify.interfaces.Node {
  /**
   * `LibraryPage` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `LibraryPage` title.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
  /**
   * `LibraryPage` type.
   */
  @com.google.gson.annotations.SerializedName("type")
  private ch.brix.gql.client.frontify.enums.LibraryType type;
  /**
   * **BETA** `LibraryPage` `Collection` items list.
   */
  @com.google.gson.annotations.SerializedName("collections")
  private ch.brix.gql.client.frontify.objects.LibraryPageCollectionItems collections;
  /**
   * `LibraryPage` `Asset` items list.
   */
  @com.google.gson.annotations.SerializedName("assets")
  private ch.brix.gql.client.frontify.objects.LibraryPageAssetItems assets;
}
